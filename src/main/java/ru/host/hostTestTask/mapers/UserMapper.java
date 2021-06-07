package ru.host.hostTestTask.mapers;

import lombok.Data;
import ru.host.hostTestTask.dto.UserDto;
import ru.host.hostTestTask.entities.User;

/**
 * UserMapper отвечает за контракт между UserDto & User
 */
@Data
public class UserMapper {
    public static User userMapper(UserDto userDto) {
        User user = new User();
        user.setUserId(userDto.getUserId());
        user.setLastName(user.getLastName());
        user.setFirstname(userDto.getFirstname());
        user.setMiddleName(user.getMiddleName());
        return user;
    }

    public static UserDto userDtoMapper(User user) {
        UserDto userDto = new UserDto();
        user.setUserId(userDto.getUserId());
        user.setLastName(user.getLastName());
        user.setMiddleName(userDto.getMiddleName());
        return userDto;
    }
}
