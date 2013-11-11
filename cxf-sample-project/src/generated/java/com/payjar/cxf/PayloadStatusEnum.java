
package com.payjar.cxf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payloadStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="payloadStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="STAGED"/>
 *     &lt;enumeration value="PROCESSING"/>
 *     &lt;enumeration value="SUCCESSFUL"/>
 *     &lt;enumeration value="FAILED"/>
 *     &lt;enumeration value="TIMEOUT"/>
 *     &lt;enumeration value="EXPIRED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "payloadStatusEnum")
@XmlEnum
public enum PayloadStatusEnum {

    NEW,
    STAGED,
    PROCESSING,
    SUCCESSFUL,
    FAILED,
    TIMEOUT,
    EXPIRED;

    public String value() {
        return name();
    }

    public static PayloadStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
