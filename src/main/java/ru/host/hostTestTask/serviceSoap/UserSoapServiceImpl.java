package ru.host.hostTestTask.serviceSoap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;
import ru.host.hostTestTask.conrtollersSoap.SoapConnector;
import ru.host.hostTestTask.dto.UserDto;
import ru.host.hostTestTask.exceptions.SoapEventException;
import ru.hostco.reguser.types.GetUserRequestType;
import ru.hostco.reguser.types.GetUserResponseType;

import javax.transaction.Transactional;

/**
 * UserSoapServiceImpl - класс для расширения сервиса UserSoapService
 */
@Service
public class UserSoapServiceImpl implements UserSoapService {
    private final SoapConnector soapConnector;

    public UserSoapServiceImpl(SoapConnector soapConnector) {
        this.soapConnector = soapConnector;
    }
    @Transactional
    public ResponseEntity<UserDto> getUser(@RequestParam(value = "snils") String snils) {
        try {
            GetUserRequestType getUserRequestType = new GetUserRequestType();
            GetUserResponseType getUserResponseType;
            getUserRequestType.setSNILS(snils);
            getUserRequestType.setToken("D468E929-A94E-4F16-A7D2-DB414EC53071");
            getUserResponseType = (GetUserResponseType) soapConnector.callWebService("http://localhost:8088",getUserRequestType);
            UserDto userDto = new UserDto(
                    Long.parseLong(getUserResponseType.getSNILS()),
                    getUserResponseType.getLogin().getFirstname(),
                    getUserResponseType.getLogin().getLastname(),
                    getUserResponseType.getLogin().getMiddlename());
            return new ResponseEntity<>(userDto, HttpStatus.OK);

        } catch (SoapEventException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }
}
