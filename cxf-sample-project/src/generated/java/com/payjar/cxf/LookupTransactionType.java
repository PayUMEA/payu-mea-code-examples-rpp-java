
package com.payjar.cxf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lookupTransactionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="lookupTransactionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAYMENT_METHODS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "lookupTransactionType")
@XmlEnum
public enum LookupTransactionType {

    PAYMENT_METHODS;

    public String value() {
        return name();
    }

    public static LookupTransactionType fromValue(String v) {
        return valueOf(v);
    }

}
