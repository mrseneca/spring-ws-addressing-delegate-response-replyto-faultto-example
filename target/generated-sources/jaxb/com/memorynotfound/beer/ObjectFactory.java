//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.29 at 10:10:24 PM MSK 
//


package com.memorynotfound.beer;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.memorynotfound.beer package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.memorynotfound.beer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBeerRequest }
     * 
     */
    public GetBeerRequest createGetBeerRequest() {
        return new GetBeerRequest();
    }

    /**
     * Create an instance of {@link GetBeerResponse }
     * 
     */
    public GetBeerResponse createGetBeerResponse() {
        return new GetBeerResponse();
    }

    /**
     * Create an instance of {@link Beer }
     * 
     */
    public Beer createBeer() {
        return new Beer();
    }

}
