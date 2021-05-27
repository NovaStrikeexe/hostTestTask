package ru.host.hostTestTask.controllersRest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.host.hostTestTask.dto.PatientDto;

import java.time.LocalDate;

@RestController
public class UserRestController {
    @GetMapping("/user")

    public String getUserInfo(){
        final String lname,fname,mName,snils,enp;
        final LocalDate bDate;
        PatientDto patientDto = new PatientDto();
        return "user";
    }

}

