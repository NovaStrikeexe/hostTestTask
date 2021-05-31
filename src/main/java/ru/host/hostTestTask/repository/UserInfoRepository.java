package ru.host.hostTestTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.host.hostTestTask.dto.UserInfoDto;

import java.util.List;

public interface UserInfoRepository extends JpaRepository<UserInfoDto, Integer> {
    List<UserInfoDto> findByUserId(Integer userID);

    List<UserInfoDto> findByUserId();
}
