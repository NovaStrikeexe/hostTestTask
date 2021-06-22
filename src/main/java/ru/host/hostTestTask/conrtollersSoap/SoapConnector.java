package ru.host.hostTestTask.conrtollersSoap;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class SoapConnector extends WebServiceGatewaySupport {

    /**
     * @param url
     * @param request
     * @return
     */
    public Object callWebService(String url, Object request){
        return getWebServiceTemplate().marshalSendAndReceive(url, request);
    }
}