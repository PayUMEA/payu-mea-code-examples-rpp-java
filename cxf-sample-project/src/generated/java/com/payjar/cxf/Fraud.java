
package com.payjar.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fraud complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fraud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseManagerNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkFraudOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantWebSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcFingerPrint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fraud", propOrder = {
    "caseManagerNote",
    "checkFraudOverride",
    "merchantWebSite",
    "pcFingerPrint",
    "resultCode",
    "resultMessage"
})
public class Fraud {

    protected String caseManagerNote;
    protected String checkFraudOverride;
    protected String merchantWebSite;
    protected String pcFingerPrint;
    protected String resultCode;
    protected String resultMessage;

    /**
     * Gets the value of the caseManagerNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseManagerNote() {
        return caseManagerNote;
    }

    /**
     * Sets the value of the caseManagerNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseManagerNote(String value) {
        this.caseManagerNote = value;
    }

    /**
     * Gets the value of the checkFraudOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckFraudOverride() {
        return checkFraudOverride;
    }

    /**
     * Sets the value of the checkFraudOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckFraudOverride(String value) {
        this.checkFraudOverride = value;
    }

    /**
     * Gets the value of the merchantWebSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantWebSite() {
        return merchantWebSite;
    }

    /**
     * Sets the value of the merchantWebSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantWebSite(String value) {
        this.merchantWebSite = value;
    }

    /**
     * Gets the value of the pcFingerPrint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcFingerPrint() {
        return pcFingerPrint;
    }

    /**
     * Sets the value of the pcFingerPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcFingerPrint(String value) {
        this.pcFingerPrint = value;
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

}
