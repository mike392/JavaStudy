//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.23 at 05:28:38 PM MSK 
//


package com.study.parser.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.study.parser.entity package. 
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

    private final static QName _Medicine_QNAME = new QName("http://www.entity.parser.study.com", "medicine");
    private final static QName _ForeignMedicine_QNAME = new QName("http://www.entity.parser.study.com", "foreign-medicine");
    private final static QName _DomesticMedicine_QNAME = new QName("http://www.entity.parser.study.com", "domestic-medicine");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.study.parser.entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Medicines }
     * 
     */
    public Medicines createMedicines() {
        return new Medicines();
    }

    /**
     * Create an instance of {@link Medicine }
     * 
     */
    public Medicine createMedicine() {
        return new Medicine();
    }

    /**
     * Create an instance of {@link DomesticMedicine }
     * 
     */
    public DomesticMedicine createDomesticMedicine() {
        return new DomesticMedicine();
    }

    /**
     * Create an instance of {@link ForeignMedicine }
     * 
     */
    public ForeignMedicine createForeignMedicine() {
        return new ForeignMedicine();
    }

    /**
     * Create an instance of {@link CertificationEnterprise }
     * 
     */
    public CertificationEnterprise createCertificationEnterprise() {
        return new CertificationEnterprise();
    }

    /**
     * Create an instance of {@link CertificateInfo }
     * 
     */
    public CertificateInfo createCertificateInfo() {
        return new CertificateInfo();
    }

    /**
     * Create an instance of {@link Package }
     * 
     */
    public Package createPackage() {
        return new Package();
    }

    /**
     * Create an instance of {@link Dosage }
     * 
     */
    public Dosage createDosage() {
        return new Dosage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Medicine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.entity.parser.study.com", name = "medicine")
    public JAXBElement<Medicine> createMedicine(Medicine value) {
        return new JAXBElement<Medicine>(_Medicine_QNAME, Medicine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForeignMedicine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.entity.parser.study.com", name = "foreign-medicine", substitutionHeadNamespace = "http://www.entity.parser.study.com", substitutionHeadName = "medicine")
    public JAXBElement<ForeignMedicine> createForeignMedicine(ForeignMedicine value) {
        return new JAXBElement<ForeignMedicine>(_ForeignMedicine_QNAME, ForeignMedicine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomesticMedicine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.entity.parser.study.com", name = "domestic-medicine", substitutionHeadNamespace = "http://www.entity.parser.study.com", substitutionHeadName = "medicine")
    public JAXBElement<DomesticMedicine> createDomesticMedicine(DomesticMedicine value) {
        return new JAXBElement<DomesticMedicine>(_DomesticMedicine_QNAME, DomesticMedicine.class, null, value);
    }

}
