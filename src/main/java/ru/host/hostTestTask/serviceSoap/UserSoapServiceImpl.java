package ru.host.hostTestTask.serviceSoap;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;
import ru.host.hostTestTask.conrtollersSoap.UserSoapManager;
import ru.host.hostTestTask.dto.UserDto;
import ru.host.hostTestTask.dtoSoap.UserDtoSoap;
import ru.host.hostTestTask.exceptions.EventException;
import ru.host.hostTestTask.repository.UserInfoRepository;

@Service
@Data
public class UserSoapServiceImpl implements UserSoapService {
    private final UserInfoRepository userInfoRepository;

    public UserSoapServiceImpl(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<UserDto> getUser(@RequestParam(value = "snils") String snils) {
        try {
            final UserDtoSoap userDtoSoap = UserSoapManager.getUser(snils);
            Long userId = Long.parseLong(userDtoSoap.getSnils());
            String lastName = userDtoSoap.getLastName();
            String firstname = userDtoSoap.getFirstname();
            String middleName = userDtoSoap.getMiddleName();
            return new ResponseEntity<UserDto>(new UserDto(userId, lastName, firstname, middleName), HttpStatus.OK);

        } catch (EventException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }
}
