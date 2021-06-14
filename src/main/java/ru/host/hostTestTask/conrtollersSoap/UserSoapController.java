package ru.host.hostTestTask.conrtollersSoap;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import ru.hostco.reguser.types.GetUserRequestType;
import ru.hostco.reguser.types.GetUserResponseType;
import ru.hostco.reguser.types.ObjectFactory;

@Controller("UserController")
@RequestMapping("/user")
@RequiredArgsConstructor
@Data
public class UserSoapController extends WebServiceGatewaySupport {
    final String soapToken = "D468E929-A94E-4F16-A7D2-DB414EC53071";
    final String soapUrl = "http://www.hostco.ru/reguser";
    final String getUser = "/getUser";

    public GetUserResponseType getUser(String snils) {
        ObjectFactory objectFactory = new ObjectFactory();
        GetUserRequestType getUserRequestType = objectFactory.createGetUserRequestType();
        getUserRequestType.setSNILS(snils);
        getUserRequestType.setToken(soapToken);
        return (GetUserResponseType) getWebServiceTemplate().marshalSendAndReceive(getUserRequestType, new SoapActionCallback(soapUrl + getUser));
    }
}