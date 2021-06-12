package ru.host.hostTestTask.serviceSoap;

import org.springframework.stereotype.Service;
import ru.host.hostTestTask.conrtollersSoap.UserController;
import ru.host.hostTestTask.entities.User;
import ru.host.hostTestTask.repository.UserInfoRepository;

@Service
public class UserSoapServiceImpl implements UserSoapService {
    private UserInfoRepository userInfoRepository;

    @Override
    public User getUser(String snils) {
        return (User) userInfoRepository.findBySnils(snils);
    }
}
