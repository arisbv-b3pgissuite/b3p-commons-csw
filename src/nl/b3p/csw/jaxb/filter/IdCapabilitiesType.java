//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.11 at 06:55:45 PM CET 
//


package nl.b3p.csw.jaxb.filter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Id_CapabilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Id_CapabilitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.opengis.net/ogc}EID"/>
 *         &lt;element ref="{http://www.opengis.net/ogc}FID"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Id_CapabilitiesType", propOrder = {
    "eidOrFID"
})
public class IdCapabilitiesType {

    @XmlElements({
        @XmlElement(name = "FID", type = FID.class),
        @XmlElement(name = "EID", type = EID.class)
    })
    protected List<Object> eidOrFID;

    /**
     * Default no-arg constructor
     * 
     */
    public IdCapabilitiesType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IdCapabilitiesType(final List<Object> eidOrFID) {
        this.eidOrFID = eidOrFID;
    }

    /**
     * Gets the value of the eidOrFID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eidOrFID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEIDOrFID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FID }
     * {@link EID }
     * 
     * 
     */
    public List<Object> getEIDOrFID() {
        if (eidOrFID == null) {
            eidOrFID = new ArrayList<Object>();
        }
        return this.eidOrFID;
    }

}