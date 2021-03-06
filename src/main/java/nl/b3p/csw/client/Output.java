/*
 * Copyright 2009 B3Partners BV
 * 
 */
package nl.b3p.csw.client;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import nl.b3p.csw.util.MarshallUtil;
import nl.b3p.csw.util.OnlineResource;
import nl.b3p.csw.util.OperatesOn;
import nl.b3p.csw.util.Protocol;
import nl.b3p.csw.util.UrlDataset;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.Text;
import org.jdom.filter.ElementFilter;
import org.jdom.input.DOMBuilder;
import org.jdom.output.XMLOutputter;
import org.jdom.transform.JDOMResult;
import org.jdom.transform.JDOMSource;

/**
 *
 * @author Erik van de Pol
 *
 */
public abstract class Output implements Iterable<Element> {

    protected static final Log log = LogFactory.getLog(Output.class);
    protected static final Namespace cswNameSpace = Namespace.getNamespace("http://www.opengis.net/cat/csw/2.0.2");
    protected static final Namespace gmdNameSpace = Namespace.getNamespace("http://www.isotc211.org/2005/gmd");
    protected static final Namespace gcoNameSpace = Namespace.getNamespace("http://www.isotc211.org/2005/gco");
    protected static final Namespace cswPrefixNameSpace = Namespace.getNamespace("csw","http://www.opengis.net/cat/csw/2.0.2");
    protected static final Namespace gmdPrefixNameSpace = Namespace.getNamespace("gmd","http://www.isotc211.org/2005/gmd");
    protected static final Namespace gcoPrefixNameSpace = Namespace.getNamespace("gco","http://www.isotc211.org/2005/gco");
    protected static final Namespace srvPrefixNameSpace = Namespace.getNamespace("srv","http://www.isotc211.org/2005/srv");
    
    // TODO: deze staat hard op ISO 19139. Andere standaarden toevoegen?
    protected static final ElementFilter resultElementFilter = new ElementFilter("MD_Metadata", gmdNameSpace);
    protected static final ElementFilter resourceElementFilter = new ElementFilter("CI_OnlineResource", gmdNameSpace);
    protected static final ElementFilter fileIdentifierElementFilter = new ElementFilter("fileIdentifier", gmdNameSpace);
    //for jdom
    protected static org.jdom.xpath.XPath titleJdomXPath;
    protected static org.jdom.xpath.XPath keywordsJdomXPath;
    protected static org.jdom.xpath.XPath identificationDateJdomXPath;
    protected static org.jdom.xpath.XPath responsibleOrganisationNameJdomXPath;
    protected static org.jdom.xpath.XPath dateStampJdomXPath;
    protected static org.jdom.xpath.XPath dateTimeStampJdomXPath;
    protected static org.jdom.xpath.XPath abstractJdomXPath;
    protected static org.jdom.xpath.XPath browseGraphicFileName;
    protected static org.jdom.xpath.XPath metadataStandardNameXPath;  
    protected static org.jdom.xpath.XPath urlDatasetNameXPath;  
    
    //for MD for services
    protected static org.jdom.xpath.XPath operatesOnXpath;  
    
    protected static final Protocol defaultProtocol = Protocol.WMS;
    protected static final List<Protocol> defaultAllowedProtocols;

    protected static final String exceptionName = "ExceptionReport";
    
    //metadata for datasets
    public static final String ISO_19115 = "ISO 19115";
    //metadata for services
    public static final String ISO_19119 = "ISO 19119";
    

    static {
        defaultAllowedProtocols = new ArrayList<Protocol>();
        defaultAllowedProtocols.add(defaultProtocol);

        try {
            titleJdomXPath = org.jdom.xpath.XPath.newInstance("gmd:identificationInfo/*/gmd:citation/gmd:CI_Citation/gmd:title/gco:CharacterString/text()");
            titleJdomXPath.addNamespace(gmdPrefixNameSpace);
            titleJdomXPath.addNamespace(gcoPrefixNameSpace);
            keywordsJdomXPath = org.jdom.xpath.XPath.newInstance("gmd:identificationInfo/*/gmd:descriptiveKeywords/gmd:MD_Keywords/gmd:keyword/gco:CharacterString/text()");
            keywordsJdomXPath.addNamespace(gmdPrefixNameSpace);
            keywordsJdomXPath.addNamespace(gcoPrefixNameSpace);
            //gmd:identificationInfo/gmd:MD_DataIdentification/gmd:descriptiveKeywords/gmd:MD_Keywords/gmd:thesaurusName/gmd:CI_Citation/gmd:date/gmd:CI_Date/gmd:date/gco:DateTime
            identificationDateJdomXPath = org.jdom.xpath.XPath.newInstance("gmd:identificationInfo/*/gmd:citation/gmd:CI_Citation/gmd:date/gmd:CI_Date/gmd:date/gco:Date/text()");
            identificationDateJdomXPath.addNamespace(gmdPrefixNameSpace);
            identificationDateJdomXPath.addNamespace(gcoPrefixNameSpace);
            responsibleOrganisationNameJdomXPath = org.jdom.xpath.XPath.newInstance("gmd:contact/gmd:CI_ResponsibleParty/gmd:organisationName/gco:CharacterString/text()");
            responsibleOrganisationNameJdomXPath.addNamespace(gmdPrefixNameSpace);
            responsibleOrganisationNameJdomXPath.addNamespace(gcoPrefixNameSpace);
            dateStampJdomXPath = org.jdom.xpath.XPath.newInstance("gmd:dateStamp/gco:Date/text()");
            dateStampJdomXPath.addNamespace(gmdPrefixNameSpace);
            dateStampJdomXPath.addNamespace(gcoPrefixNameSpace);
            dateTimeStampJdomXPath = org.jdom.xpath.XPath.newInstance("gmd:dateStamp/gco:DateTime/text()");
            dateTimeStampJdomXPath.addNamespace(gmdPrefixNameSpace);
            dateTimeStampJdomXPath.addNamespace(gcoPrefixNameSpace);
            abstractJdomXPath = org.jdom.xpath.XPath.newInstance("gmd:identificationInfo/*/gmd:abstract/gco:CharacterString/text()");
            abstractJdomXPath.addNamespace(gmdPrefixNameSpace);
            abstractJdomXPath.addNamespace(gcoPrefixNameSpace);
            browseGraphicFileName = org.jdom.xpath.XPath.newInstance("gmd:identificationInfo/*/gmd:graphicOverview/gmd:MD_BrowseGraphic/gmd:fileName/gco:CharacterString/text()");
            browseGraphicFileName.addNamespace(gmdPrefixNameSpace);
            browseGraphicFileName.addNamespace(gcoPrefixNameSpace);
            metadataStandardNameXPath = org.jdom.xpath.XPath.newInstance("gmd:metadataStandardName/gco:CharacterString/text()");
            metadataStandardNameXPath.addNamespace(gmdPrefixNameSpace);
            metadataStandardNameXPath.addNamespace(gcoPrefixNameSpace);
            urlDatasetNameXPath = org.jdom.xpath.XPath.newInstance("gmd:distributionInfo/gmd:MD_Distribution/gmd:transferOptions/gmd:MD_DigitalTransferOptions/gmd:onLine/gmd:CI_OnlineResource");
            urlDatasetNameXPath.addNamespace(gmdPrefixNameSpace);
            urlDatasetNameXPath.addNamespace(gcoPrefixNameSpace);
            //metadata for services
            operatesOnXpath = org.jdom.xpath.XPath.newInstance("gmd:identificationInfo/srv:SV_ServiceIdentification/srv:operatesOn");                                                                
            operatesOnXpath.addNamespace(gmdPrefixNameSpace);
            operatesOnXpath.addNamespace(srvPrefixNameSpace);
            
            
        } catch (JDOMException ex) {
            log.error("Error creating xpath expressions");
        }
    }

    protected Document xmlDocument = null;
    protected JAXBElement response = null;
    protected Schema schema = null;

    public Output(Document xmlDocument) {
        this.xmlDocument = xmlDocument;
    }

    public Output(Document xmlDocument, Schema schema) {
        this(xmlDocument);
        this.schema = schema;
    }

    public Document getXml() {
        return xmlDocument;
    }

    public Document getTransformedXml(String transformPath) throws TransformerException {
        try {
            Transformer transformer =
                    TransformerFactory.newInstance().newTransformer(new StreamSource(transformPath));
            JDOMSource in = new JDOMSource(xmlDocument);
            JDOMResult out = new JDOMResult();
            transformer.transform(in, out);
            return out.getDocument();
        } catch (TransformerException e) {
            throw new TransformerException(
                    "Xml Csw response could not be transformed with " + transformPath
                    + ".\nXml: " + xmlDocument.toString(), e);
        }
    }

    protected JAXBElement getResponse() throws JDOMException, JAXBException, OwsException {
        return getResponseImpl();
    }

    private JAXBElement getResponseImpl() throws JDOMException, JAXBException {
        if (response == null) {
            response = MarshallUtil.unMarshall(xmlDocument, schema, getTargetType());
        }
        return response;
    }

    protected abstract Class getTargetType();

    @Override
    public Iterator<Element> iterator() {
        List<Element> jdomList = null;
        try {
            jdomList = getSearchResults();
        } catch(Exception ex) {
            log.error(ex);
            return null;
        }
        return jdomList.iterator();
    }

    public abstract List<org.w3c.dom.Element> getSearchResultsW3C() throws JDOMException, JAXBException, OwsException;

    public List<Element> getSearchResults() throws JDOMException, JAXBException, OwsException {
        List<org.w3c.dom.Element> w3cList = getSearchResultsW3C();
        List<Element> jdomList = new ArrayList<Element>(w3cList.size());

        // transform to jdom list
        DOMBuilder domBuilder = new DOMBuilder();
        for (org.w3c.dom.Element w3cElem : w3cList) {
            jdomList.add(domBuilder.build(w3cElem));
        }

        return jdomList;
    }

    public String getSearchResultsString() throws JDOMException, JAXBException, IOException, OwsException {
        return new XMLOutputter().outputString(getSearchResults());
    }

    /**
     * List of OnlineResource's. If the same resource-URL is included in more result-metadata,
     * all are included in this list.
     * @return List of OnlineResource's.
     */
    public List<OnlineResource> getResourcesFlattened() {
        return getResourcesFlattened(defaultAllowedProtocols);
    }

    /**
     * List of OnlineResource's. If the same resource-URL is included in more result-metadata,
     * all are included in this list.
     * @param allowedProtocols Online resource protocols that are allowed in the search results.
     * An empty list indicates all Protocol's are allowed.
     * @return List of OnlineResource's.
     */
    public List<OnlineResource> getResourcesFlattened(List<Protocol> allowedProtocols) {
        List<OnlineResource> resources = new ArrayList<OnlineResource>();

        Map<URI, List<OnlineResource>> resourcesMap = getResourcesMap(allowedProtocols);

        for (List<OnlineResource> list : resourcesMap.values()) {
            resources.addAll(list);
        }

        return resources;
    }

    /**
     * List of OnlineResource's grouped by URI.
     * @return List of OnlineResource's grouped by URI.
     */
    public Map<URI, List<OnlineResource>> getResourcesMap() {
        return getResourcesMap(defaultAllowedProtocols);
    }

    /**
     * List of OnlineResource's grouped by URI.
     * @param allowedProtocols Online resource protocols that are allowed in the search results.
     * An empty list indicates all Protocol's are allowed.
     * @return List of OnlineResource's grouped by URI.
     */
    public Map<URI, List<OnlineResource>> getResourcesMap(List<Protocol> allowedProtocols) {
        Map<URI, List<OnlineResource>> services = new HashMap<URI, List<OnlineResource>>();
        Element rootElement = xmlDocument.getRootElement();
        if (rootElement != null) {

            Iterator<Element> results = rootElement.getDescendants(resultElementFilter);
            while (results.hasNext()) {
                Element resultElem = results.next();

                Map<URI, List<OnlineResource>> resultServices = getResourcesMap(resultElem, allowedProtocols);
                for (Map.Entry<URI, List<OnlineResource>> resultService : resultServices.entrySet()) {
                    URI key = resultService.getKey();
                    List<OnlineResource> value = resultService.getValue();
                    // TODO: Dit moet een Set worden ipv een List! (duplicaten eruit). OnlineResource als Comparable? implementeren op url en name.
                    if (services.containsKey(key)) {
                        services.get(key).addAll(value);
                    } else {
                        services.putAll(resultServices);
                    }
                }
            }
        }
        return services;
    }

    public Map<URI, List<OnlineResource>> getResourcesMap(Element resultElem, List<Protocol> allowedProtocols) throws UnsupportedOperationException {
        Map<URI, List<OnlineResource>> services = new HashMap<URI, List<OnlineResource>>();

        //int resourceId = 0;
        //String uuid = getUUID(resultElem);

        Iterator<Element> resources = resultElem.getDescendants(resourceElementFilter);
        while (resources.hasNext()) {
            Element resourceElem = resources.next();

            OnlineResource onlineResource = getResource(resourceElem, allowedProtocols, resultElem);

            if (onlineResource != null) {
                //onlineResource.setUUID(uuid + ";" + resourceId);

                URI url = onlineResource.getUrl();
                if (services.get(url) == null) {
                    services.put(url, new ArrayList<OnlineResource>());
                }
                services.get(url).add(onlineResource);
            }
            //resourceId++;
        }

        return services;
    }

    public String getUUID(Element rootElement) throws UnsupportedOperationException {
        return getUUID(rootElement, false);
    }

    public String getUUID(Element rootElement, boolean sanitize) throws UnsupportedOperationException {
        Iterator<Element> fileIdentifierResult = rootElement.getDescendants(fileIdentifierElementFilter);
        if (!fileIdentifierResult.hasNext()) {
            throw new UnsupportedOperationException("No UUID found for metadata.");
        }
        Element fileIdentifier = fileIdentifierResult.next();
        String uuid = fileIdentifier.getChildTextTrim("CharacterString", gcoNameSpace);
        if (!sanitize) {
            return uuid;
        } else {
            uuid = uuid.startsWith("{") ? uuid.substring(1) : uuid;
            uuid = uuid.endsWith("}") ? uuid.substring(0, uuid.length() - 1) : uuid;
            return uuid;
        }
    }

    public String getTitle(Element recordElement) throws JDOMException {
        return titleJdomXPath.valueOf(recordElement);
    }

    public List<Text> getKeyWords(Element recordElement) throws JDOMException {
        return (List<Text>) keywordsJdomXPath.selectNodes(recordElement);
    }
    
    public List<String> getKeyWordsAsStringList(Element recordElement) throws JDOMException {
        List<Text> kwtl = keywordsJdomXPath.selectNodes(recordElement);
        if (kwtl==null || kwtl.isEmpty()) {
            return null;
        }
        List<String> sl = new ArrayList<String>();
        for (Text kwt : kwtl) {
            sl.add(kwt.getText());
        }
        return sl;
    }

    public String getIdentificationDate(Element recordElement) throws JDOMException {
        return identificationDateJdomXPath.valueOf(recordElement);
    }

    public String getResponsibleOrganisationName(Element recordElement) throws JDOMException {
        return responsibleOrganisationNameJdomXPath.valueOf(recordElement);
    }
    
    /**
     * First try to get the Date object if empty or ommitted try to get the DateTime object. 
     */     
    public String getDateStamp(Element recordElement) throws JDOMException{
        String s=dateStampJdomXPath.valueOf(recordElement);
        if (s==null || s.length()==0){
            s=dateTimeStampJdomXPath.valueOf(recordElement);
        }
        return s;
    }

    public String getAbstractText(Element recordElement) throws JDOMException{
        return abstractJdomXPath.valueOf(recordElement);
    }

    public String getBrowseGraphicFileName(Element recordElement) throws JDOMException{
        return browseGraphicFileName.valueOf(recordElement);
    }
    /**
     * Returns the metadata standard name.
     * @param recordElement
     * @return The ISO verison of the metadata standard
     * @throws JDOMException 
     */
    public String getMetadataStandardName(Element recordElement) throws JDOMException{
        return metadataStandardNameXPath.valueOf(recordElement);
    }
    /**
     * Returns true if given metadata element describes a service.
     * @param recordElement
     * @return true if metadata describes services
     */
    public boolean isMetadataForService(Element recordElement) throws JDOMException{
        return ISO_19119.equalsIgnoreCase(metadataStandardNameXPath.valueOf(recordElement));
    }
    
    private OnlineResource getResource(Element resourceElem, List<Protocol> allowedProtocols, Element metadataElement) {
        URI url = null;
        Protocol protocol = null;
        String version = null;
        String name = null;
        String desc = null;

        try {
            Element linkageElem = resourceElem.getChild("linkage", gmdNameSpace);
            if (linkageElem != null) {
                Element URLElem = linkageElem.getChild("URL", gmdNameSpace);
                if (URLElem != null) {
                    url = new URI(URLElem.getTextTrim());
                }
            }
            Element protocolElem = resourceElem.getChild("protocol", gmdNameSpace);
            if (protocolElem != null) {
                String completeProtocolString = this.getProtocolString(protocolElem);
                protocol = getProtocol(completeProtocolString);
                version = getVersion(protocol,completeProtocolString);
            }
            Element nameElem = resourceElem.getChild("name", gmdNameSpace);
            if (nameElem != null) {
                Element nameStringElem = nameElem.getChild("CharacterString", gcoNameSpace);
                if (nameStringElem != null) {
                    name = nameStringElem.getTextTrim();
                }
            }
            Element descElem = resourceElem.getChild("description", gmdNameSpace);
            if (descElem != null) {
                Element descStringElem = descElem.getChild("CharacterString", gcoNameSpace);
                if (descStringElem != null) {
                    desc = descStringElem.getTextTrim();
                }
            }
            //if WMS/WFS and name (layer) is null dont add.. Not usable
            if (url != null && protocol!=null && 
                    ((!Protocol.WMS.equals(protocol) && !Protocol.WFS.equals(protocol)) || name != null)
                    && (allowedProtocols.isEmpty() || allowedProtocols.contains(protocol))) {

                OnlineResource onlineResource = new OnlineResource();

                onlineResource.setUrl(url);
                onlineResource.setName(name);
                onlineResource.setDescription(desc);
                onlineResource.setProtocol(protocol);
                onlineResource.setVersion(version);
                //log.debug("md:\n" + new XMLOutputter().outputString(metadataElement));
                onlineResource.setMetadata(metadataElement);
                //log.debug(onlineResource);

                return onlineResource;
            }
        } catch (URISyntaxException ex) {
            log.error(ex);
        }
        return null;
    }
    
    private String getProtocolString(Element protocolElem){
        String protocolText=null;
        
        Element SV_ServiceTypeElem = protocolElem.getChild("SV_ServiceType", gmdNameSpace);
        // onderstaand element is voor compatibiliteit. Is eigenlijk niet correct.
        Element protocolStringElem = protocolElem.getChild("CharacterString", gcoNameSpace);

        if (SV_ServiceTypeElem != null) {
            protocolText = SV_ServiceTypeElem.getTextTrim();            
            
        } else if (protocolStringElem != null) {
            protocolText = protocolStringElem.getTextTrim();            
        }
        return protocolText;
    }

    private Protocol getProtocol(String protocolText) {
        Protocol protocol = null;
        if (protocolText != null) {            
            try {
                protocol = Protocol.fromValue(protocolText);
            } catch (Exception e) {
            }
        }
        if (protocol == null) {
            protocol = defaultProtocol;
        }
        return protocol;
    }
    
    private String getVersion(Protocol protocol, String protocolString){
        String version = null;
        if (protocolString!=null){            
            String extraString = protocolString.substring(protocol.getName().length());
            if (extraString.length()>1){
                //Is there a - that indicates more then only the version
                if (extraString.indexOf("-",1)>0){
                    version = extraString.substring(1,extraString.indexOf("-",1));
                }else{
                    version = extraString.substring(1);
                }
            }
        }
        return version;
                
    }
    
    public List<OperatesOn> getOperatesOn(Element recordElement)throws JDOMException{
        List<OperatesOn> returnList = new ArrayList<OperatesOn>();
        List<Element> elements=operatesOnXpath.selectNodes(recordElement);
        for (Element el : elements){
            returnList.add(new OperatesOn(el));
        }
        return returnList;
    }
    
    public List<Map<String,String>> getOperatesOnAsStringList(Element recordElement) throws JDOMException {
        List<OperatesOn> ool = getOperatesOn(recordElement);
        if (ool==null || ool.isEmpty()) {
            return null;
        }
        List<Map<String,String>> sl = new ArrayList<Map<String,String>>();
        for (OperatesOn oo : ool) {
            Map<String,String> oom = new HashMap<String,String>();
            oom.put("uuidref", oo.getUuidref());
            oom.put("href", oo.getHref());
            sl.add(oom);
        }
        return sl;
    }
    
    public List<UrlDataset> getUrlDatasets(Element recordElement)throws JDOMException{
        List<UrlDataset> returnList = new ArrayList<UrlDataset>();
        List<Element> elements=urlDatasetNameXPath.selectNodes(recordElement);
        for (Element el : elements){
            returnList.add(new UrlDataset(el));
        }
        return returnList;
    }
    
    public List<Map<String,String>> getUrlDatasetsAsStringList(Element recordElement) throws JDOMException {
        List<UrlDataset> udl = getUrlDatasets(recordElement);
        if (udl == null || udl.isEmpty()) {
            List<Map<String, String>> sl = new ArrayList<Map<String, String>>();
            Map<String, String> udm = new HashMap<String, String>();
            udm.put("name", "voorbeeld");
            udm.put("href", "http://www.b3partners.nl");
            udm.put("protocol", "website");
            sl.add(udm);
            udm = new HashMap<String, String>();
            udm.put("name", "voorbeeld");
            udm.put("href", "http://www.b3partners.nl");
            udm.put("protocol", "download");
            sl.add(udm);
            return sl;
//            return null;
        }
        List<Map<String,String>> sl = new ArrayList<Map<String,String>>();
        for (UrlDataset ud : udl) {
            Map<String,String> udm = new HashMap<String,String>();
            udm.put("name", ud.getName());
            udm.put("href", ud.getHref());
            udm.put("protocol", ud.getProtocol());
            sl.add(udm);
        }
        return sl;
    }

}
