package ru.host.hostTestTask.controllersRest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.host.hostTestTask.dto.UserInfoDto;
import ru.host.hostTestTask.repository.UserInfoRepository;

import java.util.List;

@RestController
public class UserRestController {
    private final UserInfoRepository userInfoRepository;

    public UserRestController(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }
    @GetMapping("/user")
    List<UserInfoDto> all(){
        return userInfoRepository.findByUserId();
    }
}