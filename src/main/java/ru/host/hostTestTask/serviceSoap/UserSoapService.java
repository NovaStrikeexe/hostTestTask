package ru.host.hostTestTask.serviceSoap;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import ru.host.hostTestTask.dto.UserDto;

@Service
public interface UserSoapService {
    ResponseEntity<UserDto> getUser(@RequestParam(value = "snils") String snils);
}
