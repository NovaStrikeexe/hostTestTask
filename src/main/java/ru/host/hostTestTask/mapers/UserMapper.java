package ru.host.hostTestTask.mapers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.host.hostTestTask.dto.UserDto;
import ru.host.hostTestTask.entities.User;

/**
 * UserMapper отвечает за контракт между UserDto & User
 */
@Mapper
public interface UserMapper {
    UserMapper INSTACE = Mappers.getMapper(UserMapper.class);

    UserDto toDto(User user);
}