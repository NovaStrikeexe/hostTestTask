package ru.host.hostTestTask.serviceSoap;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;
import ru.host.hostTestTask.conrtollersSoap.UserSoapManager;
import ru.host.hostTestTask.dto.UserDto;
import ru.host.hostTestTask.dtoSoap.UserDtoSoap;
import ru.host.hostTestTask.exceptions.EventException;

import javax.transaction.Transactional;

@Service
public class UserSoapServiceImpl implements UserSoapService {
    @Transactional
    public ResponseEntity<UserDto> getUser(@RequestParam(value = "snils") String snils) {
        try {
            final UserDtoSoap userDtoSoap = UserSoapManager.getUser(snils);
            Long userId = Long.parseLong(userDtoSoap.getSnils());
            String lastName = userDtoSoap.getLastName();
            String firstname = userDtoSoap.getFirstname();
            String middleName = userDtoSoap.getMiddleName();
            return new ResponseEntity<>(new UserDto(userId, lastName, firstname, middleName), HttpStatus.OK);

        } catch (EventException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }
}
