//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.29 at 10:10:24 PM MSK 
//


package ru.vtb.skmb.usbs;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.vtb.skmb.usbs package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.vtb.skmb.usbs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRelatedPartiesEBM }
     * 
     */
    public GetRelatedPartiesEBM createGetRelatedPartiesEBM() {
        return new GetRelatedPartiesEBM();
    }

    /**
     * Create an instance of {@link PartyIdentification }
     * 
     */
    public PartyIdentification createPartyIdentification() {
        return new PartyIdentification();
    }

    /**
     * Create an instance of {@link GetRelatedPartiesResponseEBM }
     * 
     */
    public GetRelatedPartiesResponseEBM createGetRelatedPartiesResponseEBM() {
        return new GetRelatedPartiesResponseEBM();
    }

    /**
     * Create an instance of {@link RbgGroup }
     * 
     */
    public RbgGroup createRbgGroup() {
        return new RbgGroup();
    }

    /**
     * Create an instance of {@link RbgConnection }
     * 
     */
    public RbgConnection createRbgConnection() {
        return new RbgConnection();
    }

    /**
     * Create an instance of {@link RbgIndividual }
     * 
     */
    public RbgIndividual createRbgIndividual() {
        return new RbgIndividual();
    }

    /**
     * Create an instance of {@link RbgLegalEntity }
     * 
     */
    public RbgLegalEntity createRbgLegalEntity() {
        return new RbgLegalEntity();
    }

}
