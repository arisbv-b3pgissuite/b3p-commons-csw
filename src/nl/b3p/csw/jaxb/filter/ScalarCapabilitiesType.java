//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.06 at 09:10:32 PM CET 
//


package nl.b3p.csw.jaxb.filter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Scalar_CapabilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Scalar_CapabilitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/ogc}LogicalOperators" minOccurs="0"/>
 *         &lt;element name="ComparisonOperators" type="{http://www.opengis.net/ogc}ComparisonOperatorsType" minOccurs="0"/>
 *         &lt;element name="ArithmeticOperators" type="{http://www.opengis.net/ogc}ArithmeticOperatorsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Scalar_CapabilitiesType", propOrder = {
    "logicalOperators",
    "comparisonOperators",
    "arithmeticOperators"
})
public class ScalarCapabilitiesType {

    @XmlElement(name = "LogicalOperators")
    protected LogicalOperators logicalOperators;
    @XmlElement(name = "ComparisonOperators")
    protected ComparisonOperatorsType comparisonOperators;
    @XmlElement(name = "ArithmeticOperators")
    protected ArithmeticOperatorsType arithmeticOperators;

    /**
     * Gets the value of the logicalOperators property.
     * 
     * @return
     *     possible object is
     *     {@link LogicalOperators }
     *     
     */
    public LogicalOperators getLogicalOperators() {
        return logicalOperators;
    }

    /**
     * Sets the value of the logicalOperators property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalOperators }
     *     
     */
    public void setLogicalOperators(LogicalOperators value) {
        this.logicalOperators = value;
    }

    /**
     * Gets the value of the comparisonOperators property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonOperatorsType }
     *     
     */
    public ComparisonOperatorsType getComparisonOperators() {
        return comparisonOperators;
    }

    /**
     * Sets the value of the comparisonOperators property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonOperatorsType }
     *     
     */
    public void setComparisonOperators(ComparisonOperatorsType value) {
        this.comparisonOperators = value;
    }

    /**
     * Gets the value of the arithmeticOperators property.
     * 
     * @return
     *     possible object is
     *     {@link ArithmeticOperatorsType }
     *     
     */
    public ArithmeticOperatorsType getArithmeticOperators() {
        return arithmeticOperators;
    }

    /**
     * Sets the value of the arithmeticOperators property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArithmeticOperatorsType }
     *     
     */
    public void setArithmeticOperators(ArithmeticOperatorsType value) {
        this.arithmeticOperators = value;
    }

}
