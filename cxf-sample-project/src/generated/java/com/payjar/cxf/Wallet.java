
package com.payjar.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wallet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wallet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.api.controller.web.payjar.com/}iPaymentMethod">
 *       &lt;sequence>
 *         &lt;element name="amountInCents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cashBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loayltyBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loyaltyAmountInCents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sufficientFunds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WalletBalance" type="{http://soap.api.controller.web.payjar.com/}walletBalance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wallet", propOrder = {
    "amountInCents",
    "cardBalance",
    "cashBalance",
    "loayltyBalance",
    "loyaltyAmountInCents",
    "sufficientFunds",
    "walletBalance"
})
public class Wallet
    extends IPaymentMethod
{

    protected String amountInCents;
    protected String cardBalance;
    protected String cashBalance;
    protected String loayltyBalance;
    protected String loyaltyAmountInCents;
    protected String sufficientFunds;
    @XmlElement(name = "WalletBalance")
    protected WalletBalance walletBalance;

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
     * Gets the value of the cardBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBalance() {
        return cardBalance;
    }

    /**
     * Sets the value of the cardBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBalance(String value) {
        this.cardBalance = value;
    }

    /**
     * Gets the value of the cashBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashBalance() {
        return cashBalance;
    }

    /**
     * Sets the value of the cashBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashBalance(String value) {
        this.cashBalance = value;
    }

    /**
     * Gets the value of the loayltyBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoayltyBalance() {
        return loayltyBalance;
    }

    /**
     * Sets the value of the loayltyBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoayltyBalance(String value) {
        this.loayltyBalance = value;
    }

    /**
     * Gets the value of the loyaltyAmountInCents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyAmountInCents() {
        return loyaltyAmountInCents;
    }

    /**
     * Sets the value of the loyaltyAmountInCents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyAmountInCents(String value) {
        this.loyaltyAmountInCents = value;
    }

    /**
     * Gets the value of the sufficientFunds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSufficientFunds() {
        return sufficientFunds;
    }

    /**
     * Sets the value of the sufficientFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSufficientFunds(String value) {
        this.sufficientFunds = value;
    }

    /**
     * Gets the value of the walletBalance property.
     * 
     * @return
     *     possible object is
     *     {@link WalletBalance }
     *     
     */
    public WalletBalance getWalletBalance() {
        return walletBalance;
    }

    /**
     * Sets the value of the walletBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link WalletBalance }
     *     
     */
    public void setWalletBalance(WalletBalance value) {
        this.walletBalance = value;
    }

}
