
package com.payjar.cxf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLookupTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLookupTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Safekey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lookupTransactionType" type="{http://soap.api.controller.web.payjar.com/}lookupTransactionType" minOccurs="0"/>
 *         &lt;element name="Customfield" type="{http://soap.api.controller.web.payjar.com/}customField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLookupTransaction", propOrder = {
    "api",
    "safekey",
    "lookupTransactionType",
    "customfield"
})
public class GetLookupTransaction {

    @XmlElement(name = "Api")
    protected String api;
    @XmlElement(name = "Safekey")
    protected String safekey;
    protected LookupTransactionType lookupTransactionType;
    @XmlElement(name = "Customfield")
    protected List<CustomField> customfield;

    /**
     * Gets the value of the api property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApi() {
        return api;
    }

    /**
     * Sets the value of the api property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApi(String value) {
        this.api = value;
    }

    /**
     * Gets the value of the safekey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafekey() {
        return safekey;
    }

    /**
     * Sets the value of the safekey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafekey(String value) {
        this.safekey = value;
    }

    /**
     * Gets the value of the lookupTransactionType property.
     * 
     * @return
     *     possible object is
     *     {@link LookupTransactionType }
     *     
     */
    public LookupTransactionType getLookupTransactionType() {
        return lookupTransactionType;
    }

    /**
     * Sets the value of the lookupTransactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupTransactionType }
     *     
     */
    public void setLookupTransactionType(LookupTransactionType value) {
        this.lookupTransactionType = value;
    }

    /**
     * Gets the value of the customfield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customfield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomfield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomField }
     * 
     * 
     */
    public List<CustomField> getCustomfield() {
        if (customfield == null) {
            customfield = new ArrayList<CustomField>();
        }
        return this.customfield;
    }

}
