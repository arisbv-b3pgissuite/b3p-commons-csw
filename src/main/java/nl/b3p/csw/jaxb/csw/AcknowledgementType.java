//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.06.10 at 04:19:23 PM CEST 
//


package nl.b3p.csw.jaxb.csw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This is a general acknowledgement response message for all requests 
 *          that may be processed in an asynchronous manner.
 *          EchoedRequest - Echoes the submitted request message
 *          RequestId     - identifier for polling purposes (if no response 
 *                          handler is available, or the URL scheme is
 *                          unsupported)
 * 
 * <p>Java class for AcknowledgementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcknowledgementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EchoedRequest" type="{http://www.opengis.net/cat/csw/2.0.2}EchoedRequestType"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="timeStamp" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcknowledgementType", propOrder = {
    "echoedRequest",
    "requestId"
})
public class AcknowledgementType {

    @XmlElement(name = "EchoedRequest", required = true)
    protected EchoedRequestType echoedRequest;
    @XmlElement(name = "RequestId")
    @XmlSchemaType(name = "anyURI")
    protected String requestId;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**
     * Default no-arg constructor
     * 
     */
    public AcknowledgementType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AcknowledgementType(final EchoedRequestType echoedRequest, final String requestId, final XMLGregorianCalendar timeStamp) {
        this.echoedRequest = echoedRequest;
        this.requestId = requestId;
        this.timeStamp = timeStamp;
    }

    /**
     * Gets the value of the echoedRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EchoedRequestType }
     *     
     */
    public EchoedRequestType getEchoedRequest() {
        return echoedRequest;
    }

    /**
     * Sets the value of the echoedRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EchoedRequestType }
     *     
     */
    public void setEchoedRequest(EchoedRequestType value) {
        this.echoedRequest = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

}
