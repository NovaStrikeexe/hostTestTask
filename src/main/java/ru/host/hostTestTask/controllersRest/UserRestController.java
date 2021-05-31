package ru.host.hostTestTask.controllersRest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.host.hostTestTask.dto.UserInfoDto;

@RestController
@RequestMapping("/user")
public class UserRestController {
    @GetMapping()
    public ResponseEntity<UserInfoDto> userInfoDtoResponseEntity(@RequestParam(value = "snils") String snils) {

        // HttpStatus userStatus = null;


    }
}

