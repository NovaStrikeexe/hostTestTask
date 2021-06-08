package ru.host.hostTestTask.serviceSoap;

import org.springframework.stereotype.Service;
import ru.host.hostTestTask.conrtollersSoap.UserController;
import ru.host.hostTestTask.entities.User;
import ru.host.hostTestTask.repository.UserInfoRepository;

@Service
public class UserSoapServiceImpl implements UserSoapService {
    private UserInfoRepository userInfoRepository;

    @Override
    public UserController getUser(String snils) {
        return (UserController) userInfoRepository.findBySnils(snils);
    }
}
