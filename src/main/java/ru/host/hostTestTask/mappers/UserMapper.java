package ru.host.hostTestTask.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.host.hostTestTask.dto.UserDto;
import ru.host.hostTestTask.dtoSoap.UserDtoSoap;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDtoSoap toDto(UserDto userDto);
}
