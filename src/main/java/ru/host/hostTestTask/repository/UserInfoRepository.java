package ru.host.hostTestTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.host.hostTestTask.entities.User;

import java.util.List;

@Repository
public interface UserInfoRepository extends JpaRepository<User, Long> {
    List<User> findBySnils(String snils);

}
