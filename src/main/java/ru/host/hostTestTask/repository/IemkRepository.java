package ru.host.hostTestTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.host.hostTestTask.entities.Patient;

import java.util.List;
@Repository
public interface IemkRepository extends JpaRepository<Patient,Long> {
    List<Patient> findBySnilsOrAndLastName(String snils, String lastName);

}
