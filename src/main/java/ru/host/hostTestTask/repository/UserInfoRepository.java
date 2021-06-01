package ru.host.hostTestTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.host.hostTestTask.dto.UserInfoDto;

import java.util.List;
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfoDto, Integer> {
    List<UserInfoDto> findByUserId(Integer userID);

}
