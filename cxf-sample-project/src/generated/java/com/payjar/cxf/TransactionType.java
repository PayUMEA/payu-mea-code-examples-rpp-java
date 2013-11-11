
package com.payjar.cxf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transactionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOOKUP"/>
 *     &lt;enumeration value="EFFECT_STAGING"/>
 *     &lt;enumeration value="RESERVE"/>
 *     &lt;enumeration value="RESERVE_CANCEL"/>
 *     &lt;enumeration value="PAYMENT"/>
 *     &lt;enumeration value="FINALIZE"/>
 *     &lt;enumeration value="BALANCE"/>
 *     &lt;enumeration value="MINI_STATEMENT"/>
 *     &lt;enumeration value="REGISTER"/>
 *     &lt;enumeration value="CREDIT"/>
 *     &lt;enumeration value="PARTIAL_CREDIT"/>
 *     &lt;enumeration value="TRANSFER"/>
 *     &lt;enumeration value="VERIFY_TRANSACTION"/>
 *     &lt;enumeration value="REGISTER_LINK"/>
 *     &lt;enumeration value="TOPUP_RESERVE"/>
 *     &lt;enumeration value="TOPUP_FINALIZE"/>
 *     &lt;enumeration value="TOPUP_CANCEL"/>
 *     &lt;enumeration value="TOPUP"/>
 *     &lt;enumeration value="PAYOUT"/>
 *     &lt;enumeration value="COLLECT"/>
 *     &lt;enumeration value="ACCOUNT_LOOKUP"/>
 *     &lt;enumeration value="RECURRING_PAYMENT"/>
 *     &lt;enumeration value="RECURRING_PAYMENT_SETUP"/>
 *     &lt;enumeration value="DEBIT_ORDER"/>
 *     &lt;enumeration value="DEBIT_ORDER_SETUP"/>
 *     &lt;enumeration value="SUBSCRIPTION_PAYMENT"/>
 *     &lt;enumeration value="SUBSCRIPTION_PAYMENT_SETUP"/>
 *     &lt;enumeration value="RECURRING_TOKENISE"/>
 *     &lt;enumeration value="REDEEM_UKASH_VOUCHER"/>
 *     &lt;enumeration value="ADD_CREDITCARD"/>
 *     &lt;enumeration value="EVENT_CARDPURCHASE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "transactionType")
@XmlEnum
public enum TransactionType {

    LOOKUP,
    EFFECT_STAGING,
    RESERVE,
    RESERVE_CANCEL,
    PAYMENT,
    FINALIZE,
    BALANCE,
    MINI_STATEMENT,
    REGISTER,
    CREDIT,
    PARTIAL_CREDIT,
    TRANSFER,
    VERIFY_TRANSACTION,
    REGISTER_LINK,
    TOPUP_RESERVE,
    TOPUP_FINALIZE,
    TOPUP_CANCEL,
    TOPUP,
    PAYOUT,
    COLLECT,
    ACCOUNT_LOOKUP,
    RECURRING_PAYMENT,
    RECURRING_PAYMENT_SETUP,
    DEBIT_ORDER,
    DEBIT_ORDER_SETUP,
    SUBSCRIPTION_PAYMENT,
    SUBSCRIPTION_PAYMENT_SETUP,
    RECURRING_TOKENISE,
    REDEEM_UKASH_VOUCHER,
    ADD_CREDITCARD,
    EVENT_CARDPURCHASE;

    public String value() {
        return name();
    }

    public static TransactionType fromValue(String v) {
        return valueOf(v);
    }

}
