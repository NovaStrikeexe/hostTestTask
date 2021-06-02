package ru.host.hostTestTask.dto;

import lombok.Data;
import ru.host.hostTestTask.entities.Gender;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
public class SoapUserDto {
    private Long userId;
    private String lastName;//имя пользователя
    private String firstname;// фамилия
    private String middleName;// отчество
    private Gender gender;
    private String snils;
    private Date birthdate;

}
