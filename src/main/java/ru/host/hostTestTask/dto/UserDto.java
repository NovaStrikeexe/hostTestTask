package ru.host.hostTestTask.dto;

import lombok.Data;

@Data
public class UserDto {
    private String lastName;//имя пользователя
    private String firstname;// фамилия
    private String middleName;// отчество
    private Long userId;// Айдшник


}
