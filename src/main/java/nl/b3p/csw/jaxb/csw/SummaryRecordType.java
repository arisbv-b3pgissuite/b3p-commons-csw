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
import javax.xml.bind.annotation.XmlType;
import nl.b3p.csw.jaxb.elements.Format;
import nl.b3p.csw.jaxb.elements.Identifier;
import nl.b3p.csw.jaxb.elements.Relation;
import nl.b3p.csw.jaxb.elements.SimpleLiteral;
import nl.b3p.csw.jaxb.elements.Subject;
import nl.b3p.csw.jaxb.elements.Title;
import nl.b3p.csw.jaxb.elements.Type;
import nl.b3p.csw.jaxb.ows.BoundingBox;
import nl.b3p.csw.jaxb.ows.BoundingBoxType;
import nl.b3p.csw.jaxb.ows.WGS84BoundingBox;
import nl.b3p.csw.jaxb.terms.Abstract;
import nl.b3p.csw.jaxb.terms.Alternative;
import nl.b3p.csw.jaxb.terms.BibliographicCitation;
import nl.b3p.csw.jaxb.terms.ConformsTo;
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
import nl.b3p.csw.jaxb.terms.Medium;
import nl.b3p.csw.jaxb.terms.Modified;
import nl.b3p.csw.jaxb.terms.References;
import nl.b3p.csw.jaxb.terms.Replaces;
import nl.b3p.csw.jaxb.terms.Requires;
import nl.b3p.csw.jaxb.terms.Spatial;


/**
 * 
 *             This type defines a summary representation of the common record
 *             format.  It extends AbstractRecordType to include the core
 *             properties.
 *          
 * 
 * <p>Java class for SummaryRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryRecordType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/cat/csw/2.0.2}AbstractRecordType">
 *       &lt;sequence>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}identifier" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}title" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}type" minOccurs="0"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}subject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}format" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}relation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://purl.org/dc/terms/}modified" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://purl.org/dc/terms/}abstract" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://purl.org/dc/terms/}spatial" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows}BoundingBox" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryRecordType", propOrder = {
    "identifier",
    "title",
    "type",
    "subject",
    "format",
    "relation",
    "modified",
    "_abstract",
    "spatial",
    "boundingBox"
})
public class SummaryRecordType
    extends AbstractRecordType
{

    @XmlElementRef(name = "identifier", namespace = "http://purl.org/dc/elements/1.1/", type = Identifier.class)
    protected List<JAXBElement<SimpleLiteral>> identifier;
    @XmlElementRef(name = "title", namespace = "http://purl.org/dc/elements/1.1/", type = Title.class)
    protected List<JAXBElement<SimpleLiteral>> title;
    @XmlElementRef(name = "type", namespace = "http://purl.org/dc/elements/1.1/", type = Type.class)
    protected Type type;
    @XmlElementRef(name = "subject", namespace = "http://purl.org/dc/elements/1.1/", type = Subject.class)
    protected List<Subject> subject;
    @XmlElementRef(name = "format", namespace = "http://purl.org/dc/elements/1.1/", type = Format.class)
    protected List<JAXBElement<SimpleLiteral>> format;
    @XmlElementRef(name = "relation", namespace = "http://purl.org/dc/elements/1.1/", type = Relation.class)
    protected List<JAXBElement<SimpleLiteral>> relation;
    @XmlElementRef(name = "modified", namespace = "http://purl.org/dc/terms/", type = Modified.class)
    protected List<Modified> modified;
    @XmlElementRef(name = "abstract", namespace = "http://purl.org/dc/terms/", type = Abstract.class)
    protected List<Abstract> _abstract;
    @XmlElementRef(name = "spatial", namespace = "http://purl.org/dc/terms/", type = Spatial.class)
    protected List<Spatial> spatial;
    @XmlElementRef(name = "BoundingBox", namespace = "http://www.opengis.net/ows", type = BoundingBox.class)
    protected List<JAXBElement<? extends BoundingBoxType>> boundingBox;

    /**
     * Default no-arg constructor
     * 
     */
    public SummaryRecordType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SummaryRecordType(final List<JAXBElement<SimpleLiteral>> identifier, final List<JAXBElement<SimpleLiteral>> title, final Type type, final List<Subject> subject, final List<JAXBElement<SimpleLiteral>> format, final List<JAXBElement<SimpleLiteral>> relation, final List<Modified> modified, final List<Abstract> _abstract, final List<Spatial> spatial, final List<JAXBElement<? extends BoundingBoxType>> boundingBox) {
        super();
        this.identifier = identifier;
        this.title = title;
        this.type = type;
        this.subject = subject;
        this.format = format;
        this.relation = relation;
        this.modified = modified;
        this._abstract = _abstract;
        this.spatial = spatial;
        this.boundingBox = boundingBox;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BibliographicCitation }
     * {@link Identifier }
     * 
     * 
     */
    public List<JAXBElement<SimpleLiteral>> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<JAXBElement<SimpleLiteral>>();
        }
        return this.identifier;
    }

    /**
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Alternative }
     * {@link Title }
     * 
     * 
     */
    public List<JAXBElement<SimpleLiteral>> getTitle() {
        if (title == null) {
            title = new ArrayList<JAXBElement<SimpleLiteral>>();
        }
        return this.title;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setType(Type value) {
        this.type = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subject }
     * 
     * 
     */
    public List<Subject> getSubject() {
        if (subject == null) {
            subject = new ArrayList<Subject>();
        }
        return this.subject;
    }

    /**
     * Gets the value of the format property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the format property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Medium }
     * {@link Extent }
     * {@link Format }
     * 
     * 
     */
    public List<JAXBElement<SimpleLiteral>> getFormat() {
        if (format == null) {
            format = new ArrayList<JAXBElement<SimpleLiteral>>();
        }
        return this.format;
    }

    /**
     * Gets the value of the relation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Requires }
     * {@link HasFormat }
     * {@link IsReplacedBy }
     * {@link Replaces }
     * {@link IsRequiredBy }
     * {@link ConformsTo }
     * {@link References }
     * {@link HasVersion }
     * {@link IsReferencedBy }
     * {@link IsPartOf }
     * {@link IsFormatOf }
     * {@link HasPart }
     * {@link Relation }
     * {@link IsVersionOf }
     * 
     * 
     */
    public List<JAXBElement<SimpleLiteral>> getRelation() {
        if (relation == null) {
            relation = new ArrayList<JAXBElement<SimpleLiteral>>();
        }
        return this.relation;
    }

    /**
     * Gets the value of the modified property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modified property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModified().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Modified }
     * 
     * 
     */
    public List<Modified> getModified() {
        if (modified == null) {
            modified = new ArrayList<Modified>();
        }
        return this.modified;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Abstract }
     * 
     * 
     */
    public List<Abstract> getAbstract() {
        if (_abstract == null) {
            _abstract = new ArrayList<Abstract>();
        }
        return this._abstract;
    }

    /**
     * Gets the value of the spatial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spatial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpatial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Spatial }
     * 
     * 
     */
    public List<Spatial> getSpatial() {
        if (spatial == null) {
            spatial = new ArrayList<Spatial>();
        }
        return this.spatial;
    }

    /**
     * Gets the value of the boundingBox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boundingBox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundingBox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WGS84BoundingBox }
     * {@link BoundingBox }
     * 
     * 
     */
    public List<JAXBElement<? extends BoundingBoxType>> getBoundingBox() {
        if (boundingBox == null) {
            boundingBox = new ArrayList<JAXBElement<? extends BoundingBoxType>>();
        }
        return this.boundingBox;
    }

}
