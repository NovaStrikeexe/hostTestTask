package ru.host.hostTestTask.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
public class Data {
    @Setter @Getter private int userId;
    @Setter @Getter private String cardNumber;
    @Setter @Getter private String lastName;
    @Setter @Getter private String firstName;
    @Setter @Getter private String middleName;
    @Setter @Getter private String snils;
    @Setter @Getter private String enp;
    @Setter @Getter private LocalDate birthDate;
    @Setter @Getter private String remdResult;
    @Setter @Getter  private String codeMo;
}
