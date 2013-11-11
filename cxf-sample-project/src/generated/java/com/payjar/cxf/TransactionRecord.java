
package com.payjar.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionRecord">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.payu.co.za/PayUMapLoader}PayUMapLoader">
 *       &lt;sequence>
 *         &lt;element name="anonymousUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deductionDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="managedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurrences" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statementDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionRecord", propOrder = {
    "anonymousUser",
    "deductionDay",
    "frequency",
    "managedBy",
    "recurrences",
    "startDate",
    "statementDescription"
})
public class TransactionRecord
    extends PayUMapLoader
{

    protected String anonymousUser;
    protected String deductionDay;
    protected String frequency;
    protected String managedBy;
    protected String recurrences;
    protected String startDate;
    protected String statementDescription;

    /**
     * Gets the value of the anonymousUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnonymousUser() {
        return anonymousUser;
    }

    /**
     * Sets the value of the anonymousUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnonymousUser(String value) {
        this.anonymousUser = value;
    }

    /**
     * Gets the value of the deductionDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeductionDay() {
        return deductionDay;
    }

    /**
     * Sets the value of the deductionDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeductionDay(String value) {
        this.deductionDay = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the managedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagedBy() {
        return managedBy;
    }

    /**
     * Sets the value of the managedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagedBy(String value) {
        this.managedBy = value;
    }

    /**
     * Gets the value of the recurrences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrences() {
        return recurrences;
    }

    /**
     * Sets the value of the recurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrences(String value) {
        this.recurrences = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the statementDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementDescription() {
        return statementDescription;
    }

    /**
     * Sets the value of the statementDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementDescription(String value) {
        this.statementDescription = value;
    }

}
