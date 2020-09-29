package com.memorynotfound.server;

import com.memorynotfound.beer.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.addressing.server.annotation.Action;
import ru.vtb.skmb.usbs.GetRelatedPartiesEBM;
import ru.vtb.skmb.usbs.GetRelatedPartiesResponseEBM;

@Endpoint
public class BeerEndpoint {

    @Action("http://skmb.vtb.ru/getRelatedPartiesEBM")
    public @ResponsePayload GetRelatedPartiesResponseEBM getRelatedPartiesEBM(@RequestPayload GetRelatedPartiesEBM request) {
    GetRelatedPartiesResponseEBM response = new GetRelatedPartiesResponseEBM();
    response.setPartyIdentification(request.getPartyIdentification());
    return response;
    }
}
