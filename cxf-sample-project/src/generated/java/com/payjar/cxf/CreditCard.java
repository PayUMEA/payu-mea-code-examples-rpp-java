
package com.payjar.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creditCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditCard">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.api.controller.web.payjar.com/}iPaymentMethod">
 *       &lt;sequence>
 *         &lt;element name="amountInCents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="budgetPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardExpiry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cvv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fraudIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gatewayCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gatewayReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameOnCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verified" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditCard", propOrder = {
    "amountInCents",
    "budgetPeriod",
    "cardExpiry",
    "cardNumber",
    "cvv",
    "description",
    "fraudIndex",
    "gatewayCode",
    "gatewayReference",
    "information",
    "nameOnCard",
    "verified"
})
public class CreditCard
    extends IPaymentMethod
{

    protected String amountInCents;
    protected String budgetPeriod;
    protected String cardExpiry;
    protected String cardNumber;
    protected String cvv;
    protected String description;
    protected String fraudIndex;
    protected String gatewayCode;
    protected String gatewayReference;
    protected String information;
    protected String nameOnCard;
    protected String verified;

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
     * Gets the value of the budgetPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetPeriod() {
        return budgetPeriod;
    }

    /**
     * Sets the value of the budgetPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetPeriod(String value) {
        this.budgetPeriod = value;
    }

    /**
     * Gets the value of the cardExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpiry() {
        return cardExpiry;
    }

    /**
     * Sets the value of the cardExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpiry(String value) {
        this.cardExpiry = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cvv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvv() {
        return cvv;
    }

    /**
     * Sets the value of the cvv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvv(String value) {
        this.cvv = value;
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
     * Gets the value of the fraudIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudIndex() {
        return fraudIndex;
    }

    /**
     * Sets the value of the fraudIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudIndex(String value) {
        this.fraudIndex = value;
    }

    /**
     * Gets the value of the gatewayCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayCode() {
        return gatewayCode;
    }

    /**
     * Sets the value of the gatewayCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayCode(String value) {
        this.gatewayCode = value;
    }

    /**
     * Gets the value of the gatewayReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayReference() {
        return gatewayReference;
    }

    /**
     * Sets the value of the gatewayReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayReference(String value) {
        this.gatewayReference = value;
    }

    /**
     * Gets the value of the information property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformation() {
        return information;
    }

    /**
     * Sets the value of the information property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformation(String value) {
        this.information = value;
    }

    /**
     * Gets the value of the nameOnCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOnCard() {
        return nameOnCard;
    }

    /**
     * Sets the value of the nameOnCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOnCard(String value) {
        this.nameOnCard = value;
    }

    /**
     * Gets the value of the verified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerified() {
        return verified;
    }

    /**
     * Sets the value of the verified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerified(String value) {
        this.verified = value;
    }

}
