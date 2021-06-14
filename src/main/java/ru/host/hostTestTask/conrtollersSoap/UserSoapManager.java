package ru.host.hostTestTask.conrtollersSoap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.host.hostTestTask.dtoSoap.SoapUserDto;
import ru.host.hostTestTask.exceptions.EventException;
import ru.hostco.reguser.types.GetUserResponseType;

@Component
public class UserSoapManager {
    @Autowired
    void setUserController(UserSoapController userSoapController){
        UserSoapManager.userSoapController = userSoapController;
    }
    private static UserSoapController userSoapController;
    public static SoapUserDto getUser(String snils){
        final GetUserResponseType getUserResponseType = userSoapController.getUser(snils);
        if(getUserResponseType.getError().getErrorCode() != 0){
            throw new EventException(getUserResponseType.getError().getErrorText());
        }
        return new SoapUserDto(getUserResponseType);
    }
}
