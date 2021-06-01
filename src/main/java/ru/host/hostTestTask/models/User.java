package ru.host.hostTestTask.models;

import lombok.Data;

import java.time.LocalDate;
@Data
public class User {
    private String lastName;//имя пользователя
    private String firstname;// фамилия
    private String middleName;// отчество
    private String snils;
    private LocalDate birthdate;
    private Boolean gender;
    private Integer userId;
}

