package ru.host.hostTestTask.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@AllArgsConstructor
public class Patient {
    @Setter @Getter private String lastName;
    @Setter @Getter private String firstName;
    @Setter @Getter private String middleName;
    @Setter @Getter private String snils;
    @Setter @Getter private String enp;
    @Setter @Getter private LocalDate birthDate;
}
