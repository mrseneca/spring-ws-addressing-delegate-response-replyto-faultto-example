package com.memorynotfound.client;

import com.memorynotfound.beer.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.addressing.client.ActionCallback;
import org.springframework.ws.soap.addressing.core.EndpointReference;
import ru.vtb.skmb.usbs.GetRelatedPartiesEBM;
import ru.vtb.skmb.usbs.GetRelatedPartiesResponseEBM;

import java.net.URI;
import java.net.URISyntaxException;

public class BeerClient extends WebServiceGatewaySupport {

    public void sendGetBeerRequest(GetRelatedPartiesEBM id) throws URISyntaxException {


        ActionCallback callback = new ActionCallback(
                new URI("http://skmb.vtb.ru/getRelatedPartiesEBM"));
        callback.setReplyTo(new EndpointReference(
                new URI("http://localhost:8080/response")));
        callback.setFaultTo(new EndpointReference(
                new URI("http://localhost:8080/fault")));

        getWebServiceTemplate().marshalSendAndReceive(id, callback);
    }
}