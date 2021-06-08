package ru.host.hostTestTask.serviceSoap;

import org.springframework.stereotype.Service;
import ru.host.hostTestTask.conrtollersSoap.UserController;

@Service
public interface UserSoapService {
    UserController getUser(String snils);
}
