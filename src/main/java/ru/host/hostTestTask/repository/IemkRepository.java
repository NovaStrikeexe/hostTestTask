package ru.host.hostTestTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.host.hostTestTask.dto.PatientDto;

import java.util.List;
@Repository
public interface IemkRepository extends JpaRepository<PatientDto,Long> {
    List<PatientDto> findBySnilsOrAndLastName(String snils, String lastName);

}
