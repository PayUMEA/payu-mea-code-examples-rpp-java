
package com.payjar.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shippingDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shippingDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shippingAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingPostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingStateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shppingFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shippingDetails", propOrder = {
    "shippingAddress1",
    "shippingAddress2",
    "shippingAddressCity",
    "shippingCountryCode",
    "shippingEmail",
    "shippingFax",
    "shippingId",
    "shippingLastName",
    "shippingMethod",
    "shippingPhone",
    "shippingPostCode",
    "shippingStateCode",
    "shppingFirstName"
})
public class ShippingDetails {

    protected String shippingAddress1;
    protected String shippingAddress2;
    protected String shippingAddressCity;
    protected String shippingCountryCode;
    protected String shippingEmail;
    protected String shippingFax;
    protected String shippingId;
    protected String shippingLastName;
    protected String shippingMethod;
    protected String shippingPhone;
    protected String shippingPostCode;
    protected String shippingStateCode;
    protected String shppingFirstName;

    /**
     * Gets the value of the shippingAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddress1() {
        return shippingAddress1;
    }

    /**
     * Sets the value of the shippingAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddress1(String value) {
        this.shippingAddress1 = value;
    }

    /**
     * Gets the value of the shippingAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddress2() {
        return shippingAddress2;
    }

    /**
     * Sets the value of the shippingAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddress2(String value) {
        this.shippingAddress2 = value;
    }

    /**
     * Gets the value of the shippingAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddressCity() {
        return shippingAddressCity;
    }

    /**
     * Sets the value of the shippingAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddressCity(String value) {
        this.shippingAddressCity = value;
    }

    /**
     * Gets the value of the shippingCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCountryCode() {
        return shippingCountryCode;
    }

    /**
     * Sets the value of the shippingCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCountryCode(String value) {
        this.shippingCountryCode = value;
    }

    /**
     * Gets the value of the shippingEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingEmail() {
        return shippingEmail;
    }

    /**
     * Sets the value of the shippingEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingEmail(String value) {
        this.shippingEmail = value;
    }

    /**
     * Gets the value of the shippingFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingFax() {
        return shippingFax;
    }

    /**
     * Sets the value of the shippingFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingFax(String value) {
        this.shippingFax = value;
    }

    /**
     * Gets the value of the shippingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingId() {
        return shippingId;
    }

    /**
     * Sets the value of the shippingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingId(String value) {
        this.shippingId = value;
    }

    /**
     * Gets the value of the shippingLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingLastName() {
        return shippingLastName;
    }

    /**
     * Sets the value of the shippingLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingLastName(String value) {
        this.shippingLastName = value;
    }

    /**
     * Gets the value of the shippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Sets the value of the shippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethod(String value) {
        this.shippingMethod = value;
    }

    /**
     * Gets the value of the shippingPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingPhone() {
        return shippingPhone;
    }

    /**
     * Sets the value of the shippingPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingPhone(String value) {
        this.shippingPhone = value;
    }

    /**
     * Gets the value of the shippingPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingPostCode() {
        return shippingPostCode;
    }

    /**
     * Sets the value of the shippingPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingPostCode(String value) {
        this.shippingPostCode = value;
    }

    /**
     * Gets the value of the shippingStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingStateCode() {
        return shippingStateCode;
    }

    /**
     * Sets the value of the shippingStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingStateCode(String value) {
        this.shippingStateCode = value;
    }

    /**
     * Gets the value of the shppingFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShppingFirstName() {
        return shppingFirstName;
    }

    /**
     * Sets the value of the shppingFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShppingFirstName(String value) {
        this.shppingFirstName = value;
    }

}
