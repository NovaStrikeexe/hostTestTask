package ru.host.hostTestTask.serviceSoap;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "session")
@Component(value = "userServiceSoap")
public class UserServiceSoap {

}
