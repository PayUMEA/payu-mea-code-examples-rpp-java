
package com.payjar.cxf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for walletBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="walletBalance">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.payu.co.za/PayUMapLoader}PayUMapLoader">
 *       &lt;sequence>
 *         &lt;element name="Balance" type="{http://soap.api.controller.web.payjar.com/}balance" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "walletBalance", propOrder = {
    "balance"
})
public class WalletBalance
    extends PayUMapLoader
{

    @XmlElement(name = "Balance")
    protected List<Balance> balance;

    /**
     * Gets the value of the balance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Balance }
     * 
     * 
     */
    public List<Balance> getBalance() {
        if (balance == null) {
            balance = new ArrayList<Balance>();
        }
        return this.balance;
    }

}
