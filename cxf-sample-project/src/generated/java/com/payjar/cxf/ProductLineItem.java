
package com.payjar.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientStateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productLineItem", propOrder = {
    "amount",
    "costAmount",
    "description",
    "giftMessage",
    "productCode",
    "quantity",
    "recipientAddress1",
    "recipientAddress2",
    "recipientCity",
    "recipientCountryCode",
    "recipientEmail",
    "recipientFirstName",
    "recipientLastName",
    "recipientPhone",
    "recipientPostalCode",
    "recipientStateCode",
    "shippingNumber",
    "sku"
})
public class ProductLineItem {

    protected String amount;
    protected String costAmount;
    protected String description;
    protected String giftMessage;
    protected String productCode;
    protected String quantity;
    protected String recipientAddress1;
    protected String recipientAddress2;
    protected String recipientCity;
    protected String recipientCountryCode;
    protected String recipientEmail;
    protected String recipientFirstName;
    protected String recipientLastName;
    protected String recipientPhone;
    protected String recipientPostalCode;
    protected String recipientStateCode;
    protected String shippingNumber;
    protected String sku;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the costAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostAmount() {
        return costAmount;
    }

    /**
     * Sets the value of the costAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostAmount(String value) {
        this.costAmount = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the giftMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftMessage() {
        return giftMessage;
    }

    /**
     * Sets the value of the giftMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftMessage(String value) {
        this.giftMessage = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the recipientAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientAddress1() {
        return recipientAddress1;
    }

    /**
     * Sets the value of the recipientAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientAddress1(String value) {
        this.recipientAddress1 = value;
    }

    /**
     * Gets the value of the recipientAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientAddress2() {
        return recipientAddress2;
    }

    /**
     * Sets the value of the recipientAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientAddress2(String value) {
        this.recipientAddress2 = value;
    }

    /**
     * Gets the value of the recipientCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientCity() {
        return recipientCity;
    }

    /**
     * Sets the value of the recipientCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientCity(String value) {
        this.recipientCity = value;
    }

    /**
     * Gets the value of the recipientCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientCountryCode() {
        return recipientCountryCode;
    }

    /**
     * Sets the value of the recipientCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientCountryCode(String value) {
        this.recipientCountryCode = value;
    }

    /**
     * Gets the value of the recipientEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientEmail() {
        return recipientEmail;
    }

    /**
     * Sets the value of the recipientEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientEmail(String value) {
        this.recipientEmail = value;
    }

    /**
     * Gets the value of the recipientFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientFirstName() {
        return recipientFirstName;
    }

    /**
     * Sets the value of the recipientFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientFirstName(String value) {
        this.recipientFirstName = value;
    }

    /**
     * Gets the value of the recipientLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientLastName() {
        return recipientLastName;
    }

    /**
     * Sets the value of the recipientLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientLastName(String value) {
        this.recipientLastName = value;
    }

    /**
     * Gets the value of the recipientPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientPhone() {
        return recipientPhone;
    }

    /**
     * Sets the value of the recipientPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientPhone(String value) {
        this.recipientPhone = value;
    }

    /**
     * Gets the value of the recipientPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientPostalCode() {
        return recipientPostalCode;
    }

    /**
     * Sets the value of the recipientPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientPostalCode(String value) {
        this.recipientPostalCode = value;
    }

    /**
     * Gets the value of the recipientStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientStateCode() {
        return recipientStateCode;
    }

    /**
     * Sets the value of the recipientStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientStateCode(String value) {
        this.recipientStateCode = value;
    }

    /**
     * Gets the value of the shippingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingNumber() {
        return shippingNumber;
    }

    /**
     * Sets the value of the shippingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingNumber(String value) {
        this.shippingNumber = value;
    }

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSku(String value) {
        this.sku = value;
    }

}
