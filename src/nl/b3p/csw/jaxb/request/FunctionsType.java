//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.02 at 03:33:50 PM CEST 
//


package nl.b3p.csw.jaxb.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunctionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FunctionNames" type="{http://www.opengis.net/ogc}FunctionNamesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionsType", namespace = "http://www.opengis.net/ogc", propOrder = {
    "functionNames"
})
public class FunctionsType {

    @XmlElement(name = "FunctionNames", namespace = "http://www.opengis.net/ogc", required = true)
    protected FunctionNamesType functionNames;

    /**
     * Gets the value of the functionNames property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionNamesType }
     *     
     */
    public FunctionNamesType getFunctionNames() {
        return functionNames;
    }

    /**
     * Sets the value of the functionNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionNamesType }
     *     
     */
    public void setFunctionNames(FunctionNamesType value) {
        this.functionNames = value;
    }

}
