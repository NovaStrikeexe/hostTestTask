package ru.host.hostTestTask.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PatientDto {
    private String lastName;
    private String firstName;
    private String middleName;
    private String snils;
    private String enp;
    private LocalDate birthDate;
}
