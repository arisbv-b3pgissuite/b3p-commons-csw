//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.06 at 06:26:33 PM CET 
//


package nl.b3p.csw.jaxb.filter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BinaryLogicOpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BinaryLogicOpType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="2">
 *         &lt;element name="Equals" type="{http://www.opengis.net/ogc}BinarySpatialOpType"/>
 *         &lt;element name="Disjoint" type="{http://www.opengis.net/ogc}BinarySpatialOpType"/>
 *         &lt;element name="Touches" type="{http://www.opengis.net/ogc}BinarySpatialOpType"/>
 *         &lt;element name="Within" type="{http://www.opengis.net/ogc}BinarySpatialOpType"/>
 *         &lt;element name="Overlaps" type="{http://www.opengis.net/ogc}BinarySpatialOpType"/>
 *         &lt;element name="Crosses" type="{http://www.opengis.net/ogc}BinarySpatialOpType"/>
 *         &lt;element name="Intersects" type="{http://www.opengis.net/ogc}BinarySpatialOpType"/>
 *         &lt;element name="Contains" type="{http://www.opengis.net/ogc}BinarySpatialOpType"/>
 *         &lt;element name="DWithin" type="{http://www.opengis.net/ogc}DistanceBufferType"/>
 *         &lt;element name="Beyond" type="{http://www.opengis.net/ogc}DistanceBufferType"/>
 *         &lt;element name="BBOX" type="{http://www.opengis.net/ogc}BBOXType"/>
 *         &lt;element name="PropertyIsEqualTo" type="{http://www.opengis.net/ogc}BinaryComparisonOpType"/>
 *         &lt;element name="PropertyIsNotEqualTo" type="{http://www.opengis.net/ogc}BinaryComparisonOpType"/>
 *         &lt;element name="PropertyIsLessThan" type="{http://www.opengis.net/ogc}BinaryComparisonOpType"/>
 *         &lt;element name="PropertyIsGreaterThan" type="{http://www.opengis.net/ogc}BinaryComparisonOpType"/>
 *         &lt;element name="PropertyIsLessThanOrEqualTo" type="{http://www.opengis.net/ogc}BinaryComparisonOpType"/>
 *         &lt;element name="PropertyIsGreaterThanOrEqualTo" type="{http://www.opengis.net/ogc}BinaryComparisonOpType"/>
 *         &lt;element name="PropertyIsLike" type="{http://www.opengis.net/ogc}PropertyIsLikeType"/>
 *         &lt;element name="PropertyIsNull" type="{http://www.opengis.net/ogc}PropertyIsNullType"/>
 *         &lt;element name="PropertyIsBetween" type="{http://www.opengis.net/ogc}PropertyIsBetweenType"/>
 *         &lt;element name="And" type="{http://www.opengis.net/ogc}BinaryLogicOpType"/>
 *         &lt;element name="Or" type="{http://www.opengis.net/ogc}BinaryLogicOpType"/>
 *         &lt;element name="Not" type="{http://www.opengis.net/ogc}UnaryLogicOpType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryLogicOpType", propOrder = {
    "equalsOrDisjointOrTouches"
})
public class BinaryLogicOpType {

    @XmlElementRefs({
        @XmlElementRef(name = "BBOX", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "PropertyIsGreaterThan", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "PropertyIsLessThan", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "PropertyIsEqualTo", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "Or", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "And", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "PropertyIsNotEqualTo", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "Crosses", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "Intersects", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "PropertyIsLike", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "Disjoint", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "PropertyIsLessThanOrEqualTo", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "DWithin", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "Contains", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "Overlaps", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "PropertyIsGreaterThanOrEqualTo", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "Touches", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "Not", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "Beyond", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "PropertyIsNull", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "PropertyIsBetween", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "Equals", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "Within", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> equalsOrDisjointOrTouches;

    /**
     * Gets the value of the equalsOrDisjointOrTouches property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equalsOrDisjointOrTouches property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEqualsOrDisjointOrTouches().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BBOXType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinaryLogicOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinaryLogicOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link PropertyIsLikeType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link DistanceBufferType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link DistanceBufferType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnaryLogicOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link PropertyIsNullType }{@code >}
     * {@link JAXBElement }{@code <}{@link PropertyIsBetweenType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getEqualsOrDisjointOrTouches() {
        if (equalsOrDisjointOrTouches == null) {
            equalsOrDisjointOrTouches = new ArrayList<JAXBElement<?>>();
        }
        return this.equalsOrDisjointOrTouches;
    }

}
