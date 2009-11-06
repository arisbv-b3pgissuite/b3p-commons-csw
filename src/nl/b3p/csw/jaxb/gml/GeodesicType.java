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
 * A Geodesic consists of two distinct
 *    positions joined by a geodesic curve. The control points of
 *    a Geodesic shall lie on the geodesic between its start
 *    point and end points. Between these two points, a geodesic
 *    curve defined from ellipsoid or geoid model used by the
 *    co-ordinate reference systems may be used to interpolate
 *    other positions. Any other point in the controlPoint array
 *    must fall on this geodesic.
 * 
 * <p>Java class for GeodesicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeodesicType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}GeodesicStringType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeodesicType")
public class GeodesicType
    extends GeodesicStringType
{


}
