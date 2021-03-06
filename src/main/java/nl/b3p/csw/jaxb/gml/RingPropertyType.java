//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.06.10 at 04:19:23 PM CEST 
//


package nl.b3p.csw.jaxb.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulates a ring to represent properties in features or geometry collections.
 * 
 * <p>Java class for RingPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RingPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}Ring"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RingPropertyType", propOrder = {
    "ring"
})
public class RingPropertyType {

    @XmlElementRef(name = "Ring", namespace = "http://www.opengis.net/gml", type = Ring.class)
    protected Ring ring;

    /**
     * Default no-arg constructor
     * 
     */
    public RingPropertyType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RingPropertyType(final Ring ring) {
        this.ring = ring;
    }

    /**
     * Gets the value of the ring property.
     * 
     * @return
     *     possible object is
     *     {@link Ring }
     *     
     */
    public Ring getRing() {
        return ring;
    }

    /**
     * Sets the value of the ring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ring }
     *     
     */
    public void setRing(Ring value) {
        this.ring = value;
    }

}
