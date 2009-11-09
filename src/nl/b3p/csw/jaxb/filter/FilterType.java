//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.06 at 09:10:32 PM CET 
//


package nl.b3p.csw.jaxb.filter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
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
 *         &lt;element ref="{http://www.opengis.net/ogc}AbstractId" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterType", propOrder = {
    "equals",
    "disjoint",
    "touches",
    "within",
    "overlaps",
    "crosses",
    "intersects",
    "contains",
    "dWithin",
    "beyond",
    "bbox",
    "propertyIsEqualTo",
    "propertyIsNotEqualTo",
    "propertyIsLessThan",
    "propertyIsGreaterThan",
    "propertyIsLessThanOrEqualTo",
    "propertyIsGreaterThanOrEqualTo",
    "propertyIsLike",
    "propertyIsNull",
    "propertyIsBetween",
    "and",
    "or",
    "not",
    "abstractId"
})
public class FilterType {

    @XmlElement(name = "Equals")
    protected BinarySpatialOpType equals;
    @XmlElement(name = "Disjoint")
    protected BinarySpatialOpType disjoint;
    @XmlElement(name = "Touches")
    protected BinarySpatialOpType touches;
    @XmlElement(name = "Within")
    protected BinarySpatialOpType within;
    @XmlElement(name = "Overlaps")
    protected BinarySpatialOpType overlaps;
    @XmlElement(name = "Crosses")
    protected BinarySpatialOpType crosses;
    @XmlElement(name = "Intersects")
    protected BinarySpatialOpType intersects;
    @XmlElement(name = "Contains")
    protected BinarySpatialOpType contains;
    @XmlElement(name = "DWithin")
    protected DistanceBufferType dWithin;
    @XmlElement(name = "Beyond")
    protected DistanceBufferType beyond;
    @XmlElement(name = "BBOX")
    protected BBOXType bbox;
    @XmlElement(name = "PropertyIsEqualTo")
    protected BinaryComparisonOpType propertyIsEqualTo;
    @XmlElement(name = "PropertyIsNotEqualTo")
    protected BinaryComparisonOpType propertyIsNotEqualTo;
    @XmlElement(name = "PropertyIsLessThan")
    protected BinaryComparisonOpType propertyIsLessThan;
    @XmlElement(name = "PropertyIsGreaterThan")
    protected BinaryComparisonOpType propertyIsGreaterThan;
    @XmlElement(name = "PropertyIsLessThanOrEqualTo")
    protected BinaryComparisonOpType propertyIsLessThanOrEqualTo;
    @XmlElement(name = "PropertyIsGreaterThanOrEqualTo")
    protected BinaryComparisonOpType propertyIsGreaterThanOrEqualTo;
    @XmlElement(name = "PropertyIsLike")
    protected PropertyIsLikeType propertyIsLike;
    @XmlElement(name = "PropertyIsNull")
    protected PropertyIsNullType propertyIsNull;
    @XmlElement(name = "PropertyIsBetween")
    protected PropertyIsBetweenType propertyIsBetween;
    @XmlElement(name = "And")
    protected BinaryLogicOpType and;
    @XmlElement(name = "Or")
    protected BinaryLogicOpType or;
    @XmlElement(name = "Not")
    protected UnaryLogicOpType not;
    @XmlElementRef(name = "AbstractId", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractIdType>> abstractId;

    /**
     * Gets the value of the equals property.
     * 
     * @return
     *     possible object is
     *     {@link BinarySpatialOpType }
     *     
     */
    public BinarySpatialOpType getEquals() {
        return equals;
    }

    /**
     * Sets the value of the equals property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinarySpatialOpType }
     *     
     */
    public void setEquals(BinarySpatialOpType value) {
        this.equals = value;
    }

    /**
     * Gets the value of the disjoint property.
     * 
     * @return
     *     possible object is
     *     {@link BinarySpatialOpType }
     *     
     */
    public BinarySpatialOpType getDisjoint() {
        return disjoint;
    }

    /**
     * Sets the value of the disjoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinarySpatialOpType }
     *     
     */
    public void setDisjoint(BinarySpatialOpType value) {
        this.disjoint = value;
    }

    /**
     * Gets the value of the touches property.
     * 
     * @return
     *     possible object is
     *     {@link BinarySpatialOpType }
     *     
     */
    public BinarySpatialOpType getTouches() {
        return touches;
    }

    /**
     * Sets the value of the touches property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinarySpatialOpType }
     *     
     */
    public void setTouches(BinarySpatialOpType value) {
        this.touches = value;
    }

    /**
     * Gets the value of the within property.
     * 
     * @return
     *     possible object is
     *     {@link BinarySpatialOpType }
     *     
     */
    public BinarySpatialOpType getWithin() {
        return within;
    }

    /**
     * Sets the value of the within property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinarySpatialOpType }
     *     
     */
    public void setWithin(BinarySpatialOpType value) {
        this.within = value;
    }

    /**
     * Gets the value of the overlaps property.
     * 
     * @return
     *     possible object is
     *     {@link BinarySpatialOpType }
     *     
     */
    public BinarySpatialOpType getOverlaps() {
        return overlaps;
    }

    /**
     * Sets the value of the overlaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinarySpatialOpType }
     *     
     */
    public void setOverlaps(BinarySpatialOpType value) {
        this.overlaps = value;
    }

    /**
     * Gets the value of the crosses property.
     * 
     * @return
     *     possible object is
     *     {@link BinarySpatialOpType }
     *     
     */
    public BinarySpatialOpType getCrosses() {
        return crosses;
    }

    /**
     * Sets the value of the crosses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinarySpatialOpType }
     *     
     */
    public void setCrosses(BinarySpatialOpType value) {
        this.crosses = value;
    }

    /**
     * Gets the value of the intersects property.
     * 
     * @return
     *     possible object is
     *     {@link BinarySpatialOpType }
     *     
     */
    public BinarySpatialOpType getIntersects() {
        return intersects;
    }

    /**
     * Sets the value of the intersects property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinarySpatialOpType }
     *     
     */
    public void setIntersects(BinarySpatialOpType value) {
        this.intersects = value;
    }

    /**
     * Gets the value of the contains property.
     * 
     * @return
     *     possible object is
     *     {@link BinarySpatialOpType }
     *     
     */
    public BinarySpatialOpType getContains() {
        return contains;
    }

    /**
     * Sets the value of the contains property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinarySpatialOpType }
     *     
     */
    public void setContains(BinarySpatialOpType value) {
        this.contains = value;
    }

    /**
     * Gets the value of the dWithin property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceBufferType }
     *     
     */
    public DistanceBufferType getDWithin() {
        return dWithin;
    }

    /**
     * Sets the value of the dWithin property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceBufferType }
     *     
     */
    public void setDWithin(DistanceBufferType value) {
        this.dWithin = value;
    }

    /**
     * Gets the value of the beyond property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceBufferType }
     *     
     */
    public DistanceBufferType getBeyond() {
        return beyond;
    }

    /**
     * Sets the value of the beyond property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceBufferType }
     *     
     */
    public void setBeyond(DistanceBufferType value) {
        this.beyond = value;
    }

    /**
     * Gets the value of the bbox property.
     * 
     * @return
     *     possible object is
     *     {@link BBOXType }
     *     
     */
    public BBOXType getBBOX() {
        return bbox;
    }

    /**
     * Sets the value of the bbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link BBOXType }
     *     
     */
    public void setBBOX(BBOXType value) {
        this.bbox = value;
    }

    /**
     * Gets the value of the propertyIsEqualTo property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryComparisonOpType }
     *     
     */
    public BinaryComparisonOpType getPropertyIsEqualTo() {
        return propertyIsEqualTo;
    }

    /**
     * Sets the value of the propertyIsEqualTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryComparisonOpType }
     *     
     */
    public void setPropertyIsEqualTo(BinaryComparisonOpType value) {
        this.propertyIsEqualTo = value;
    }

    /**
     * Gets the value of the propertyIsNotEqualTo property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryComparisonOpType }
     *     
     */
    public BinaryComparisonOpType getPropertyIsNotEqualTo() {
        return propertyIsNotEqualTo;
    }

    /**
     * Sets the value of the propertyIsNotEqualTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryComparisonOpType }
     *     
     */
    public void setPropertyIsNotEqualTo(BinaryComparisonOpType value) {
        this.propertyIsNotEqualTo = value;
    }

    /**
     * Gets the value of the propertyIsLessThan property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryComparisonOpType }
     *     
     */
    public BinaryComparisonOpType getPropertyIsLessThan() {
        return propertyIsLessThan;
    }

    /**
     * Sets the value of the propertyIsLessThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryComparisonOpType }
     *     
     */
    public void setPropertyIsLessThan(BinaryComparisonOpType value) {
        this.propertyIsLessThan = value;
    }

    /**
     * Gets the value of the propertyIsGreaterThan property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryComparisonOpType }
     *     
     */
    public BinaryComparisonOpType getPropertyIsGreaterThan() {
        return propertyIsGreaterThan;
    }

    /**
     * Sets the value of the propertyIsGreaterThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryComparisonOpType }
     *     
     */
    public void setPropertyIsGreaterThan(BinaryComparisonOpType value) {
        this.propertyIsGreaterThan = value;
    }

    /**
     * Gets the value of the propertyIsLessThanOrEqualTo property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryComparisonOpType }
     *     
     */
    public BinaryComparisonOpType getPropertyIsLessThanOrEqualTo() {
        return propertyIsLessThanOrEqualTo;
    }

    /**
     * Sets the value of the propertyIsLessThanOrEqualTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryComparisonOpType }
     *     
     */
    public void setPropertyIsLessThanOrEqualTo(BinaryComparisonOpType value) {
        this.propertyIsLessThanOrEqualTo = value;
    }

    /**
     * Gets the value of the propertyIsGreaterThanOrEqualTo property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryComparisonOpType }
     *     
     */
    public BinaryComparisonOpType getPropertyIsGreaterThanOrEqualTo() {
        return propertyIsGreaterThanOrEqualTo;
    }

    /**
     * Sets the value of the propertyIsGreaterThanOrEqualTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryComparisonOpType }
     *     
     */
    public void setPropertyIsGreaterThanOrEqualTo(BinaryComparisonOpType value) {
        this.propertyIsGreaterThanOrEqualTo = value;
    }

    /**
     * Gets the value of the propertyIsLike property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyIsLikeType }
     *     
     */
    public PropertyIsLikeType getPropertyIsLike() {
        return propertyIsLike;
    }

    /**
     * Sets the value of the propertyIsLike property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyIsLikeType }
     *     
     */
    public void setPropertyIsLike(PropertyIsLikeType value) {
        this.propertyIsLike = value;
    }

    /**
     * Gets the value of the propertyIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyIsNullType }
     *     
     */
    public PropertyIsNullType getPropertyIsNull() {
        return propertyIsNull;
    }

    /**
     * Sets the value of the propertyIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyIsNullType }
     *     
     */
    public void setPropertyIsNull(PropertyIsNullType value) {
        this.propertyIsNull = value;
    }

    /**
     * Gets the value of the propertyIsBetween property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyIsBetweenType }
     *     
     */
    public PropertyIsBetweenType getPropertyIsBetween() {
        return propertyIsBetween;
    }

    /**
     * Sets the value of the propertyIsBetween property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyIsBetweenType }
     *     
     */
    public void setPropertyIsBetween(PropertyIsBetweenType value) {
        this.propertyIsBetween = value;
    }

    /**
     * Gets the value of the and property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryLogicOpType }
     *     
     */
    public BinaryLogicOpType getAnd() {
        return and;
    }

    /**
     * Sets the value of the and property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryLogicOpType }
     *     
     */
    public void setAnd(BinaryLogicOpType value) {
        this.and = value;
    }

    /**
     * Gets the value of the or property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryLogicOpType }
     *     
     */
    public BinaryLogicOpType getOr() {
        return or;
    }

    /**
     * Sets the value of the or property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryLogicOpType }
     *     
     */
    public void setOr(BinaryLogicOpType value) {
        this.or = value;
    }

    /**
     * Gets the value of the not property.
     * 
     * @return
     *     possible object is
     *     {@link UnaryLogicOpType }
     *     
     */
    public UnaryLogicOpType getNot() {
        return not;
    }

    /**
     * Sets the value of the not property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnaryLogicOpType }
     *     
     */
    public void setNot(UnaryLogicOpType value) {
        this.not = value;
    }

    /**
     * Gets the value of the abstractId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link GmlObjectIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link FeatureIdType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractIdType>> getAbstractId() {
        if (abstractId == null) {
            abstractId = new ArrayList<JAXBElement<? extends AbstractIdType>>();
        }
        return this.abstractId;
    }

}
