package ru.host.hostTestTask.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.lang.String;

@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    @Setter @Getter private String lastName;//имя пользователя
    @Setter @Getter private String firstname;// фамилия
    @Setter @Getter private String middleName;// отчество
    @Setter @Getter private int userId;// Айдшник


}
