
package org.webservice.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.webservice.service package. 
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

    private final static QName _GetHashCodeResponse_QNAME = new QName("http://Service.webService.org/", "getHashCodeResponse");
    private final static QName _GetHashCode_QNAME = new QName("http://Service.webService.org/", "getHashCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.webservice.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHashCodeResponse }
     * 
     */
    public GetHashCodeResponse createGetHashCodeResponse() {
        return new GetHashCodeResponse();
    }

    /**
     * Create an instance of {@link GetHashCode }
     * 
     */
    public GetHashCode createGetHashCode() {
        return new GetHashCode();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHashCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.webService.org/", name = "getHashCodeResponse")
    public JAXBElement<GetHashCodeResponse> createGetHashCodeResponse(GetHashCodeResponse value) {
        return new JAXBElement<GetHashCodeResponse>(_GetHashCodeResponse_QNAME, GetHashCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHashCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.webService.org/", name = "getHashCode")
    public JAXBElement<GetHashCode> createGetHashCode(GetHashCode value) {
        return new JAXBElement<GetHashCode>(_GetHashCode_QNAME, GetHashCode.class, null, value);
    }

}
