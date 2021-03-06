//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.06.10 at 04:19:23 PM CEST 
//


package nl.b3p.csw.jaxb.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * A base for derived types used to specify complex types containing an array of objects, by unspecified UML association - either composition or aggregation.  An instance of this type contains elements representing Objects.
 * 
 * Ideally this type would be derived by extension of AssociationType.  
 * However, this leads to a non-deterministic content model, since both the base and the extension have minOccurs="0", and is thus prohibited in XML Schema.
 * 
 * <p>Java class for ArrayAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayAssociationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}_Object" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayAssociationType", propOrder = {
    "object"
})
public class ArrayAssociationType {

    @XmlElementRef(name = "_Object", namespace = "http://www.opengis.net/gml", type = Object.class)
    protected List<JAXBElement<?>> object;

    /**
     * Default no-arg constructor
     * 
     */
    public ArrayAssociationType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ArrayAssociationType(final List<JAXBElement<?>> object) {
        this.object = object;
    }

    /**
     * Gets the value of the object property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the object property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Curve }
     * {@link AbstractGeometry }
     * {@link Array }
     * {@link GML }
     * {@link Solid }
     * {@link TriangulatedSurface }
     * {@link OrientableSurface }
     * {@link Polygon }
     * {@link BaseUnit }
     * {@link GeometricPrimitive }
     * {@link GenericMetaData }
     * {@link DefinitionCollection }
     * {@link LineString }
     * {@link ConventionalUnit }
     * {@link DefinitionProxy }
     * {@link MultiPoint }
     * {@link MultiSurface }
     * {@link Point }
     * {@link AbstractCurve }
     * {@link Surface }
     * {@link Bag }
     * {@link Dictionary }
     * {@link MultiLineString }
     * {@link DerivedUnit }
     * {@link MultiSolid }
     * {@link UnitDefinition }
     * {@link MultiGeometry }
     * {@link AbstractSurface }
     * {@link LinearRing }
     * {@link OrientableCurve }
     * {@link PolyhedralSurface }
     * {@link MetaData }
     * {@link Definition }
     * {@link Tin }
     * {@link AbstractRing }
     * {@link MultiCurve }
     * {@link AbstractSolid }
     * {@link Ring }
     * {@link MultiPolygon }
     * {@link GeometricAggregate }
     * 
     * 
     */
    public List<JAXBElement<?>> getObject() {
        if (object == null) {
            object = new ArrayList<JAXBElement<?>>();
        }
        return this.object;
    }

}
