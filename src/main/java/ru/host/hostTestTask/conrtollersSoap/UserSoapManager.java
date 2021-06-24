package ru.host.hostTestTask.conrtollersSoap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.host.hostTestTask.dtoSoap.UserDtoSoap;
import ru.host.hostTestTask.exceptions.SoapEventException;
import ru.hostco.reguser.types.GetUserResponseType;

/**
 * UserSoapManager - Класс обработчик результат запроса
 */
@Component
public class UserSoapManager {
    /**
     * @param userSoapController
     */
    @Autowired
    void setUserController(UserSoapController userSoapController){
        UserSoapManager.userSoapController = userSoapController;
    }
    private static UserSoapController userSoapController;

    /**
     * @param snils
     * @return UserDtoSoap
     */
    public static UserDtoSoap getUser(String snils){
        final GetUserResponseType getUserResponseType = userSoapController.getUser(snils);
        if(getUserResponseType.getError().getErrorCode() != 200){
            throw new SoapEventException(getUserResponseType.getError().getErrorText());
        }
        return new UserDtoSoap(getUserResponseType);
    }
}
