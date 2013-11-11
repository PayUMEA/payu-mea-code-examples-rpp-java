
package com.payjar.cxf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiVersion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiVersion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ONE_ZERO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiVersion")
@XmlEnum
public enum ApiVersion {

    ONE_ZERO;

    public String value() {
        return name();
    }

    public static ApiVersion fromValue(String v) {
        return valueOf(v);
    }

}
