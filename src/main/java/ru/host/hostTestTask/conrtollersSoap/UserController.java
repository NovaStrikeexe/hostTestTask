package ru.host.hostTestTask.conrtollersSoap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.host.hostTestTask.entities.User;
import ru.host.hostTestTask.serviceSoap.UserSoapService;

@Controller
public class UserController {
    private UserSoapService userSoapService;

    @Autowired
    public void setUserSoapService(UserSoapService userSoapService) {
        this.userSoapService = userSoapService;
    }

    String snils = "";

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public User getUser() {
        return userSoapService.getUser(snils);
    }
}
