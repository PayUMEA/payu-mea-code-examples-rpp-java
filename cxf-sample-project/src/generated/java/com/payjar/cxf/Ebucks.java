
package com.payjar.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ebucks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ebucks">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.api.controller.web.payjar.com/}iPaymentMethod">
 *       &lt;sequence>
 *         &lt;element name="amountInCents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ebucksErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ebucksMerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ebucksMerchantReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ebucksReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ebucksToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ebucksValidity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ebucksValueGranted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ebucks", propOrder = {
    "amountInCents",
    "ebucksErrorCode",
    "ebucksMerchantId",
    "ebucksMerchantReference",
    "ebucksReference",
    "ebucksToken",
    "ebucksValidity",
    "ebucksValueGranted"
})
public class Ebucks
    extends IPaymentMethod
{

    protected String amountInCents;
    protected String ebucksErrorCode;
    protected String ebucksMerchantId;
    protected String ebucksMerchantReference;
    protected String ebucksReference;
    protected String ebucksToken;
    protected String ebucksValidity;
    protected String ebucksValueGranted;

    /**
     * Gets the value of the amountInCents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountInCents() {
        return amountInCents;
    }

    /**
     * Sets the value of the amountInCents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountInCents(String value) {
        this.amountInCents = value;
    }

    /**
     * Gets the value of the ebucksErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbucksErrorCode() {
        return ebucksErrorCode;
    }

    /**
     * Sets the value of the ebucksErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbucksErrorCode(String value) {
        this.ebucksErrorCode = value;
    }

    /**
     * Gets the value of the ebucksMerchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbucksMerchantId() {
        return ebucksMerchantId;
    }

    /**
     * Sets the value of the ebucksMerchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbucksMerchantId(String value) {
        this.ebucksMerchantId = value;
    }

    /**
     * Gets the value of the ebucksMerchantReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbucksMerchantReference() {
        return ebucksMerchantReference;
    }

    /**
     * Sets the value of the ebucksMerchantReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbucksMerchantReference(String value) {
        this.ebucksMerchantReference = value;
    }

    /**
     * Gets the value of the ebucksReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbucksReference() {
        return ebucksReference;
    }

    /**
     * Sets the value of the ebucksReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbucksReference(String value) {
        this.ebucksReference = value;
    }

    /**
     * Gets the value of the ebucksToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbucksToken() {
        return ebucksToken;
    }

    /**
     * Sets the value of the ebucksToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbucksToken(String value) {
        this.ebucksToken = value;
    }

    /**
     * Gets the value of the ebucksValidity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbucksValidity() {
        return ebucksValidity;
    }

    /**
     * Sets the value of the ebucksValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbucksValidity(String value) {
        this.ebucksValidity = value;
    }

    /**
     * Gets the value of the ebucksValueGranted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbucksValueGranted() {
        return ebucksValueGranted;
    }

    /**
     * Sets the value of the ebucksValueGranted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbucksValueGranted(String value) {
        this.ebucksValueGranted = value;
    }

}
