package ru.host.hostTestTask.controllersRest;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.host.hostTestTask.dto.UserDto;
import ru.host.hostTestTask.entities.User;
import ru.host.hostTestTask.mapers.UserMapper;
import ru.host.hostTestTask.repository.UserInfoRepository;
import ru.host.hostTestTask.serviceSoap.UserSoapService;

@RestController("UserRestController")
@Data
public class UserRestController {
    private final UserInfoRepository userInfoRepository;
    private final UserSoapService userSoapService;

    public UserRestController(UserInfoRepository userInfoRepository, UserSoapService userSoapService) {
        this.userInfoRepository = userInfoRepository;
        this.userSoapService = userSoapService;
    }

    @GetMapping("/user")
    public UserDto getUser(String snils){
        User user = userSoapService.getUser(snils);
        return UserMapper.INSTACE.toDto(user);
    }
}
