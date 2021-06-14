package ru.host.hostTestTask.controllersRest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.host.hostTestTask.dto.UserDto;
import ru.host.hostTestTask.serviceSoap.UserSoapServiceImpl;

@RestController("UserRestController")
public class UserRestController {
    private final UserSoapServiceImpl userSoapServiceImpl;

    public UserRestController(UserSoapServiceImpl userSoapServiceImpl) {
        this.userSoapServiceImpl = userSoapServiceImpl;
    }

    @GetMapping("/user/{snils}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<UserDto> getUserSoapServiceImpl(@RequestParam(value = "snils")String snils) {
        return userSoapServiceImpl.getUser(snils);
    }



}
