package ru.host.hostTestTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.host.hostTestTask.dto.UserDto;

import java.util.List;
@Repository
public interface UserInfoRepository extends JpaRepository<UserDto, Integer> {
    List<UserDto> findByUserId(Integer userID);

}
