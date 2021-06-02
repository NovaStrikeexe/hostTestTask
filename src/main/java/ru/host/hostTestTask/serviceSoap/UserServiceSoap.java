package ru.host.hostTestTask.serviceSoap;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Service
@Scope(value = "session")
@Component(value = "userServiceSoap")
public class UserServiceSoap extends WebServiceGatewaySupport {
    public Object callWebService(String url, Object request){
        return getWebServiceTemplate().marshalSendAndReceive(url, request);
    }

}
