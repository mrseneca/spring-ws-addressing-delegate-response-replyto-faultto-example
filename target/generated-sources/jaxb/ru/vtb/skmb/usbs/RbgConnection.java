//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.29 at 10:10:24 PM MSK 
//


package ru.vtb.skmb.usbs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RbgConnection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RbgConnection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="connectionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="grbId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="connectionType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="connectionForm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RbgConnection", propOrder = {
    "connectionId",
    "grbId",
    "partCd",
    "connectionType",
    "connectionForm"
})
public class RbgConnection {

    @XmlElement(required = true)
    protected String connectionId;
    @XmlElement(required = true)
    protected String grbId;
    @XmlElement(required = true)
    protected String partCd;
    @XmlElement(required = true)
    protected String connectionType;
    @XmlElement(required = true)
    protected String connectionForm;

    /**
     * Gets the value of the connectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * Sets the value of the connectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionId(String value) {
        this.connectionId = value;
    }

    /**
     * Gets the value of the grbId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrbId() {
        return grbId;
    }

    /**
     * Sets the value of the grbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrbId(String value) {
        this.grbId = value;
    }

    /**
     * Gets the value of the partCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartCd() {
        return partCd;
    }

    /**
     * Sets the value of the partCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartCd(String value) {
        this.partCd = value;
    }

    /**
     * Gets the value of the connectionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionType() {
        return connectionType;
    }

    /**
     * Sets the value of the connectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionType(String value) {
        this.connectionType = value;
    }

    /**
     * Gets the value of the connectionForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionForm() {
        return connectionForm;
    }

    /**
     * Sets the value of the connectionForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionForm(String value) {
        this.connectionForm = value;
    }

}