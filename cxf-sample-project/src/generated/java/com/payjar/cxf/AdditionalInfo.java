
package com.payjar.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for additionalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="additionalInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.payu.co.za/PayUMapLoader}PayUMapLoader">
 *       &lt;sequence>
 *         &lt;element name="callCenterRepId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="demoMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="devicePlatform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notificationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payUReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="redirectChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secure3d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showBudget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supportedPaymentMethods" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traceReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionalMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additionalInfo", propOrder = {
    "callCenterRepId",
    "cancelUrl",
    "demoMode",
    "deviceId",
    "devicePlatform",
    "merchantReference",
    "notificationUrl",
    "payUReference",
    "redirectChannel",
    "returnUrl",
    "secure3D",
    "showBudget",
    "supportedPaymentMethods",
    "traceReference",
    "transactionalCode",
    "transactionalMessage",
    "transactionalStatus"
})
public class AdditionalInfo
    extends PayUMapLoader
{

    protected String callCenterRepId;
    protected String cancelUrl;
    protected String demoMode;
    protected String deviceId;
    protected String devicePlatform;
    protected String merchantReference;
    protected String notificationUrl;
    protected String payUReference;
    protected String redirectChannel;
    protected String returnUrl;
    @XmlElement(name = "secure3d")
    protected String secure3D;
    protected String showBudget;
    protected String supportedPaymentMethods;
    protected String traceReference;
    protected String transactionalCode;
    protected String transactionalMessage;
    protected String transactionalStatus;

    /**
     * Gets the value of the callCenterRepId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCenterRepId() {
        return callCenterRepId;
    }

    /**
     * Sets the value of the callCenterRepId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCenterRepId(String value) {
        this.callCenterRepId = value;
    }

    /**
     * Gets the value of the cancelUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelUrl() {
        return cancelUrl;
    }

    /**
     * Sets the value of the cancelUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelUrl(String value) {
        this.cancelUrl = value;
    }

    /**
     * Gets the value of the demoMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemoMode() {
        return demoMode;
    }

    /**
     * Sets the value of the demoMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemoMode(String value) {
        this.demoMode = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the devicePlatform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevicePlatform() {
        return devicePlatform;
    }

    /**
     * Sets the value of the devicePlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevicePlatform(String value) {
        this.devicePlatform = value;
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
     * Gets the value of the notificationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationUrl() {
        return notificationUrl;
    }

    /**
     * Sets the value of the notificationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationUrl(String value) {
        this.notificationUrl = value;
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
     * Gets the value of the redirectChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectChannel() {
        return redirectChannel;
    }

    /**
     * Sets the value of the redirectChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectChannel(String value) {
        this.redirectChannel = value;
    }

    /**
     * Gets the value of the returnUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * Sets the value of the returnUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnUrl(String value) {
        this.returnUrl = value;
    }

    /**
     * Gets the value of the secure3D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecure3D() {
        return secure3D;
    }

    /**
     * Sets the value of the secure3D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecure3D(String value) {
        this.secure3D = value;
    }

    /**
     * Gets the value of the showBudget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowBudget() {
        return showBudget;
    }

    /**
     * Sets the value of the showBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowBudget(String value) {
        this.showBudget = value;
    }

    /**
     * Gets the value of the supportedPaymentMethods property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportedPaymentMethods() {
        return supportedPaymentMethods;
    }

    /**
     * Sets the value of the supportedPaymentMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportedPaymentMethods(String value) {
        this.supportedPaymentMethods = value;
    }

    /**
     * Gets the value of the traceReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceReference() {
        return traceReference;
    }

    /**
     * Sets the value of the traceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceReference(String value) {
        this.traceReference = value;
    }

    /**
     * Gets the value of the transactionalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionalCode() {
        return transactionalCode;
    }

    /**
     * Sets the value of the transactionalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionalCode(String value) {
        this.transactionalCode = value;
    }

    /**
     * Gets the value of the transactionalMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionalMessage() {
        return transactionalMessage;
    }

    /**
     * Sets the value of the transactionalMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionalMessage(String value) {
        this.transactionalMessage = value;
    }

    /**
     * Gets the value of the transactionalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionalStatus() {
        return transactionalStatus;
    }

    /**
     * Sets the value of the transactionalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionalStatus(String value) {
        this.transactionalStatus = value;
    }

}
