package ru.host.hostTestTask.serviceSoap;

import org.springframework.stereotype.Service;
import ru.host.hostTestTask.entities.User;

import java.util.List;

@Service
public interface UserSoapService {
    User getUser(String snils);
}
