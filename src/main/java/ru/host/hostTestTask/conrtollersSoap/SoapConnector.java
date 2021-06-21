package ru.host.hostTestTask.conrtollersSoap;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SoapConnector extends WebServiceGatewaySupport {

    public Object callWebService(String url, Object request){
        return getWebServiceTemplate().marshalSendAndReceive(url, request);
    }
}