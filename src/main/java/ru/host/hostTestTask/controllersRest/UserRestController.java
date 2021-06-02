package ru.host.hostTestTask.controllersRest;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.host.hostTestTask.dto.UserDto;
import ru.host.hostTestTask.repository.UserInfoRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class UserRestController {

    private final UserInfoRepository userInfoRepository;


    @GetMapping("/user")
    List<UserDto> all() {
        return userInfoRepository.findByUserId(1);
    }
}