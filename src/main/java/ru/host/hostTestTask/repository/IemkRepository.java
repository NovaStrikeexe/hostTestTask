package ru.host.hostTestTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.host.hostTestTask.dto.PatientDto;

import java.util.List;

public interface IemkRepository extends JpaRepository<PatientDto,Integer> {
    List<PatientDto> findBySnilsOrAndLastName(String snils, String lastName);

    List<PatientDto> findBySnilsOrAndLastName();
}
