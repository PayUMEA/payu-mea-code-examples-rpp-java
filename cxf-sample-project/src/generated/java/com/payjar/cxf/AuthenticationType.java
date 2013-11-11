
package com.payjar.cxf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authenticationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="authenticationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="HANDSHAKE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "authenticationType")
@XmlEnum
public enum AuthenticationType {

    NA,
    HANDSHAKE;

    public String value() {
        return name();
    }

    public static AuthenticationType fromValue(String v) {
        return valueOf(v);
    }

}
