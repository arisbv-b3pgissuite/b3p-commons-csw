//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.04 at 05:13:28 PM CET 
//


package nl.b3p.csw.jaxb.filter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Spatial_CapabilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Spatial_CapabilitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeometryOperands" type="{http://www.opengis.net/ogc}GeometryOperandsType"/>
 *         &lt;element name="SpatialOperators" type="{http://www.opengis.net/ogc}SpatialOperatorsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Spatial_CapabilitiesType", propOrder = {
    "geometryOperands",
    "spatialOperators"
})
public class SpatialCapabilitiesType {

    @XmlElement(name = "GeometryOperands", required = true)
    protected GeometryOperandsType geometryOperands;
    @XmlElement(name = "SpatialOperators", required = true)
    protected SpatialOperatorsType spatialOperators;

    /**
     * Gets the value of the geometryOperands property.
     * 
     * @return
     *     possible object is
     *     {@link GeometryOperandsType }
     *     
     */
    public GeometryOperandsType getGeometryOperands() {
        return geometryOperands;
    }

    /**
     * Sets the value of the geometryOperands property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryOperandsType }
     *     
     */
    public void setGeometryOperands(GeometryOperandsType value) {
        this.geometryOperands = value;
    }

    /**
     * Gets the value of the spatialOperators property.
     * 
     * @return
     *     possible object is
     *     {@link SpatialOperatorsType }
     *     
     */
    public SpatialOperatorsType getSpatialOperators() {
        return spatialOperators;
    }

    /**
     * Sets the value of the spatialOperators property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialOperatorsType }
     *     
     */
    public void setSpatialOperators(SpatialOperatorsType value) {
        this.spatialOperators = value;
    }

}
