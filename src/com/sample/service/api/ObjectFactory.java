
package com.sample.service.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sample.service.api package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateEmployeeRecordResponse_QNAME = new QName("http://api.service.sample.com/", "updateEmployeeRecordResponse");
    private final static QName _UpdateEmployeeRecord_QNAME = new QName("http://api.service.sample.com/", "updateEmployeeRecord");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sample.service.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateEmployeeRecord }
     * 
     */
    public UpdateEmployeeRecord createUpdateEmployeeRecord() {
        return new UpdateEmployeeRecord();
    }

    /**
     * Create an instance of {@link UpdateEmployeeRecordResponse }
     * 
     */
    public UpdateEmployeeRecordResponse createUpdateEmployeeRecordResponse() {
        return new UpdateEmployeeRecordResponse();
    }

    /**
     * Create an instance of {@link EmpRecordUpdateReq }
     * 
     */
    public EmpRecordUpdateReq createEmpRecordUpdateReq() {
        return new EmpRecordUpdateReq();
    }

    /**
     * Create an instance of {@link EmpRecordUpdateRes }
     * 
     */
    public EmpRecordUpdateRes createEmpRecordUpdateRes() {
        return new EmpRecordUpdateRes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmployeeRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.sample.com/", name = "updateEmployeeRecordResponse")
    public JAXBElement<UpdateEmployeeRecordResponse> createUpdateEmployeeRecordResponse(UpdateEmployeeRecordResponse value) {
        return new JAXBElement<UpdateEmployeeRecordResponse>(_UpdateEmployeeRecordResponse_QNAME, UpdateEmployeeRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmployeeRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.sample.com/", name = "updateEmployeeRecord")
    public JAXBElement<UpdateEmployeeRecord> createUpdateEmployeeRecord(UpdateEmployeeRecord value) {
        return new JAXBElement<UpdateEmployeeRecord>(_UpdateEmployeeRecord_QNAME, UpdateEmployeeRecord.class, null, value);
    }

}
