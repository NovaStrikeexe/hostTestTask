package ru.host.hostTestTask.controllersRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.host.hostTestTask.dto.UserDto;
import ru.host.hostTestTask.serviceSoap.UserSoapService;

@RestController
public class UserRestController {

    private final UserSoapService userSoapService;
    @Autowired
    public UserRestController(UserSoapService userSoapService) {
        this.userSoapService = userSoapService;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<UserDto> getUser(@RequestParam(value = "snils")String snils) {
        return userSoapService.getUser(snils);
    }

}
