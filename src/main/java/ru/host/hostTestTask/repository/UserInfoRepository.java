package ru.host.hostTestTask.repository;
//Продумать необходимость его еще раз при необходимости удалить (просто убрать)
import org.springframework.data.jpa.repository.JpaRepository;
import ru.host.hostTestTask.dto.UserInfoDto;

import java.util.List;

public interface UserInfoRepository extends JpaRepository<UserInfoDto, Integer> {
    List<UserInfoDto> findAllByUserId(Integer userID);
}
