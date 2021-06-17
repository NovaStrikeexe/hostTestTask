package ru.host.hostTestTask.serviceSoap;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.host.hostTestTask.dto.UserDto;

@Service
public interface UserSoapService {
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    ResponseEntity<UserDto> getUser(@RequestParam(value = "snils") String snils);
}
