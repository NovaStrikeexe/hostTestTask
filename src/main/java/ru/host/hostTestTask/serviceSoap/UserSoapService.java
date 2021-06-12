package ru.host.hostTestTask.serviceSoap;

import org.springframework.stereotype.Service;
import ru.host.hostTestTask.entities.User;

@Service
public interface UserSoapService {
    User getUser(String snils);
}
