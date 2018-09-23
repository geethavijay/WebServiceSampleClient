
package com.sample.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recordUpdateStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="recordUpdateStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="RETRY"/>
 *     &lt;enumeration value="FAILURE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "recordUpdateStatus")
@XmlEnum
public enum RecordUpdateStatus {

    SUCCESS,
    RETRY,
    FAILURE;

    public String value() {
        return name();
    }

    public static RecordUpdateStatus fromValue(String v) {
        return valueOf(v);
    }

}
