
package com.payjar.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetTransactionResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetTransactionResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.payu.co.za/PayUMapLoader}PayUMapLoader">
 *       &lt;sequence>
 *         &lt;element name="displayMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payUReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pointOfFailure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestTrace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="successful" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetTransactionResponseMessage", namespace = "https://www.payu.co.za/SetTransactionResponseMessage", propOrder = {
    "displayMessage",
    "merchantReference",
    "payUReference",
    "pointOfFailure",
    "requestTrace",
    "resultCode",
    "resultMessage",
    "stage",
    "successful"
})
public class SetTransactionResponseMessage
    extends PayUMapLoader
{

    protected String displayMessage;
    protected String merchantReference;
    protected String payUReference;
    protected String pointOfFailure;
    protected String requestTrace;
    protected String resultCode;
    protected String resultMessage;
    protected String stage;
    protected boolean successful;

    /**
     * Gets the value of the displayMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayMessage() {
        return displayMessage;
    }

    /**
     * Sets the value of the displayMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayMessage(String value) {
        this.displayMessage = value;
    }

    /**
     * Gets the value of the merchantReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantReference() {
        return merchantReference;
    }

    /**
     * Sets the value of the merchantReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantReference(String value) {
        this.merchantReference = value;
    }

    /**
     * Gets the value of the payUReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayUReference() {
        return payUReference;
    }

    /**
     * Sets the value of the payUReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayUReference(String value) {
        this.payUReference = value;
    }

    /**
     * Gets the value of the pointOfFailure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfFailure() {
        return pointOfFailure;
    }

    /**
     * Sets the value of the pointOfFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfFailure(String value) {
        this.pointOfFailure = value;
    }

    /**
     * Gets the value of the requestTrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestTrace() {
        return requestTrace;
    }

    /**
     * Sets the value of the requestTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTrace(String value) {
        this.requestTrace = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the resultMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultMessage() {
        return resultMessage;
    }

    /**
     * Sets the value of the resultMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultMessage(String value) {
        this.resultMessage = value;
    }

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStage(String value) {
        this.stage = value;
    }

    /**
     * Gets the value of the successful property.
     * 
     */
    public boolean isSuccessful() {
        return successful;
    }

    /**
     * Sets the value of the successful property.
     * 
     */
    public void setSuccessful(boolean value) {
        this.successful = value;
    }

}
