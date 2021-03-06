//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.06.10 at 04:19:23 PM CEST 
//


package nl.b3p.csw.jaxb.csw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import nl.b3p.csw.jaxb.elements.Contributor;
import nl.b3p.csw.jaxb.elements.Coverage;
import nl.b3p.csw.jaxb.elements.Creator;
import nl.b3p.csw.jaxb.elements.DCElement;
import nl.b3p.csw.jaxb.elements.Date;
import nl.b3p.csw.jaxb.elements.Description;
import nl.b3p.csw.jaxb.elements.Format;
import nl.b3p.csw.jaxb.elements.Identifier;
import nl.b3p.csw.jaxb.elements.Language;
import nl.b3p.csw.jaxb.elements.Publisher;
import nl.b3p.csw.jaxb.elements.Relation;
import nl.b3p.csw.jaxb.elements.Rights;
import nl.b3p.csw.jaxb.elements.SimpleLiteral;
import nl.b3p.csw.jaxb.elements.Source;
import nl.b3p.csw.jaxb.elements.Subject;
import nl.b3p.csw.jaxb.elements.Title;
import nl.b3p.csw.jaxb.elements.Type;
import nl.b3p.csw.jaxb.terms.Abstract;
import nl.b3p.csw.jaxb.terms.AccessRights;
import nl.b3p.csw.jaxb.terms.Alternative;
import nl.b3p.csw.jaxb.terms.Audience;
import nl.b3p.csw.jaxb.terms.Available;
import nl.b3p.csw.jaxb.terms.BibliographicCitation;
import nl.b3p.csw.jaxb.terms.ConformsTo;
import nl.b3p.csw.jaxb.terms.Created;
import nl.b3p.csw.jaxb.terms.DateAccepted;
import nl.b3p.csw.jaxb.terms.DateCopyrighted;
import nl.b3p.csw.jaxb.terms.DateSubmitted;
import nl.b3p.csw.jaxb.terms.EducationLevel;
import nl.b3p.csw.jaxb.terms.Extent;
import nl.b3p.csw.jaxb.terms.HasFormat;
import nl.b3p.csw.jaxb.terms.HasPart;
import nl.b3p.csw.jaxb.terms.HasVersion;
import nl.b3p.csw.jaxb.terms.IsFormatOf;
import nl.b3p.csw.jaxb.terms.IsPartOf;
import nl.b3p.csw.jaxb.terms.IsReferencedBy;
import nl.b3p.csw.jaxb.terms.IsReplacedBy;
import nl.b3p.csw.jaxb.terms.IsRequiredBy;
import nl.b3p.csw.jaxb.terms.IsVersionOf;
import nl.b3p.csw.jaxb.terms.Issued;
import nl.b3p.csw.jaxb.terms.License;
import nl.b3p.csw.jaxb.terms.Mediator;
import nl.b3p.csw.jaxb.terms.Medium;
import nl.b3p.csw.jaxb.terms.Modified;
import nl.b3p.csw.jaxb.terms.Provenance;
import nl.b3p.csw.jaxb.terms.References;
import nl.b3p.csw.jaxb.terms.Replaces;
import nl.b3p.csw.jaxb.terms.Requires;
import nl.b3p.csw.jaxb.terms.RightsHolder;
import nl.b3p.csw.jaxb.terms.Spatial;
import nl.b3p.csw.jaxb.terms.TableOfContents;
import nl.b3p.csw.jaxb.terms.Temporal;
import nl.b3p.csw.jaxb.terms.Valid;


/**
 * 
 *             This type encapsulates all of the standard DCMI metadata terms,
 *             including the Dublin Core refinements; these terms may be mapped
 *             to the profile-specific information model.
 *          
 * 
 * <p>Java class for DCMIRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DCMIRecordType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/cat/csw/2.0.2}AbstractRecordType">
 *       &lt;sequence>
 *         &lt;group ref="{http://purl.org/dc/terms/}DCMI-terms"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DCMIRecordType", propOrder = {
    "dcElement"
})
@XmlSeeAlso({
    RecordType.class
})
public class DCMIRecordType
    extends AbstractRecordType
{

    @XmlElementRef(name = "DC-element", namespace = "http://purl.org/dc/elements/1.1/", type = DCElement.class)
    protected List<JAXBElement<SimpleLiteral>> dcElement;

    /**
     * Default no-arg constructor
     * 
     */
    public DCMIRecordType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DCMIRecordType(final List<JAXBElement<SimpleLiteral>> dcElement) {
        super();
        this.dcElement = dcElement;
    }

    /**
     * Gets the value of the dcElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dcElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDCElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coverage }
     * {@link Language }
     * {@link HasFormat }
     * {@link Replaces }
     * {@link ConformsTo }
     * {@link HasVersion }
     * {@link Subject }
     * {@link Issued }
     * {@link License }
     * {@link DateCopyrighted }
     * {@link Abstract }
     * {@link BibliographicCitation }
     * {@link Title }
     * {@link Alternative }
     * {@link Date }
     * {@link References }
     * {@link IsReferencedBy }
     * {@link HasPart }
     * {@link TableOfContents }
     * {@link Relation }
     * {@link DateSubmitted }
     * {@link Type }
     * {@link Contributor }
     * {@link Publisher }
     * {@link Rights }
     * {@link Temporal }
     * {@link IsRequiredBy }
     * {@link AccessRights }
     * {@link Mediator }
     * {@link EducationLevel }
     * {@link Created }
     * {@link Audience }
     * {@link DateAccepted }
     * {@link Format }
     * {@link IsPartOf }
     * {@link IsFormatOf }
     * {@link RightsHolder }
     * {@link IsVersionOf }
     * {@link Requires }
     * {@link Valid }
     * {@link Source }
     * {@link DCElement }
     * {@link Modified }
     * {@link IsReplacedBy }
     * {@link Medium }
     * {@link Creator }
     * {@link Available }
     * {@link Provenance }
     * {@link Identifier }
     * {@link Extent }
     * {@link Spatial }
     * {@link Description }
     * 
     * 
     */
    public List<JAXBElement<SimpleLiteral>> getDCElement() {
        if (dcElement == null) {
            dcElement = new ArrayList<JAXBElement<SimpleLiteral>>();
        }
        return this.dcElement;
    }

}
