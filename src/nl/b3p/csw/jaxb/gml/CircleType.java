//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.06 at 06:26:33 PM CET 
//


package nl.b3p.csw.jaxb.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A Circle is an arc whose ends coincide to form a simple closed loop. The "start" and "end" bearing are equal and shall be the bearing for the first controlPoint listed. The three control points must be distinct non-co-linear points for the Circle to be unambiguously defined. The arc is simply extended past the third control point until the first control point is encountered.
 * 
 * <p>Java class for CircleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CircleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}ArcType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CircleType")
public class CircleType
    extends ArcType
{


}
