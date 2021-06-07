package ru.host.hostTestTask.conrtollersSoap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import ru.hostco.reguser.ObjectFactory;
import ru.hostco.reguser.types.GetUserRequestType;
import ru.hostco.reguser.types.GetUserResponseType;

@Controller
public class UserController extends WebServiceGatewaySupport {
    private String snils;
    private String soapToken;
    @RequestMapping(value = "user", method = RequestMethod.GET)
    public GetUserResponseType getUser(String snils) {
        ObjectFactory objectFactory = new ObjectFactory();
        GetUserRequestType getUserRequestType = objectFactory.createGetUserRequest();
        getUserRequestType.setSNILS(snils);
        getUserRequestType.setToken(soapToken);
        return null;
    }
}
