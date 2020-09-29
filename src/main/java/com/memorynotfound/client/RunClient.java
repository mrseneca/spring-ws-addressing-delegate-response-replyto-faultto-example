package com.memorynotfound.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.vtb.skmb.usbs.GetRelatedPartiesEBM;
import ru.vtb.skmb.usbs.PartyIdentification;

import java.net.URISyntaxException;

public class RunClient {

    public static void main(String[] args) throws URISyntaxException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoapClientConfig.class);
        BeerClient client = context.getBean(BeerClient.class);
        GetRelatedPartiesEBM id = new GetRelatedPartiesEBM();
        PartyIdentification pi = new PartyIdentification();
        pi.setID("123456");
        pi.setPartyClass("Person");
        id.setPartyIdentification(pi);


        client.sendGetBeerRequest(id);
        System.out.println("getBeerRequest handled by replyTo");

    }

}
