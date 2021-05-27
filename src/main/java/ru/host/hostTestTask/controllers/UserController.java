package ru.host.hostTestTask.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.host.hostTestTask.dto.Patient;

import java.time.LocalDate;

@RestController
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserController {
    @GetMapping("/user")
    public String getUserInfo(){
        final String lname,fname,mName,snils,enp;
        final LocalDate bDate;
        Patient patient = new Patient();
        return null; /*Заглушка*/
        /*переделать после*/
    }

}

