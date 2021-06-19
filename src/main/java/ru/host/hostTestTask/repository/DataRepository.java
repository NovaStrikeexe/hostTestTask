package ru.host.hostTestTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.host.hostTestTask.entities.SaveData;

import java.util.Date;
import java.util.List;

@Repository
public interface DataRepository extends JpaRepository<SaveData, Long> {
    List<SaveData> SaveAllData(Long userId, String cardNumber, String lastName, String firstName, String middleName, String snils, String enp, Date birthDate, String remdResult, String codeMo);
}
