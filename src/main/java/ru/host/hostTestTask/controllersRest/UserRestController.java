package ru.host.hostTestTask.controllersRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.host.hostTestTask.dto.UserDto;
import ru.host.hostTestTask.serviceSoap.UserSoapService;

/**
 * RestController отвечает обработку запроса по пользователю
 */
@RestController
public class UserRestController {

    /**
     * UserSoapService отвечает обработку запроса(основная логика)
     */
    private final UserSoapService userSoapService;
    /**
     * @param userSoapService
     */
    @Autowired
    public UserRestController(UserSoapService userSoapService) {
        this.userSoapService = userSoapService;
    }

    /**
     * @param snils
     * @return userSoapService.getUser(snils);
     */
    @GetMapping("/userRest")
    public ResponseEntity<UserDto> getUser(@RequestParam(value = "snils")String snils) {
        return userSoapService.getUser(snils);
    }

}
