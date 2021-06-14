package ru.host.hostTestTask.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {
    private Long userId;// Айдшник
    private String lastName;//имя пользователя
    private String firstname;// фамилия
    private String middleName;// отчество

}
