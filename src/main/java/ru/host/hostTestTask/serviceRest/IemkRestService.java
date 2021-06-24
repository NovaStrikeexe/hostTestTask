package ru.host.hostTestTask.serviceRest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import ru.host.hostTestTask.dto.PatientListDto;

/**
 * IemkRestService - Сервис для поиска данных (Оснавная логика IemkController )
 */
@Service
public interface IemkRestService {
    ResponseEntity<PatientListDto> getPatients(
            @RequestParam(value = "patientSnils", required = false) String patientSnils,
            @RequestParam(value = "patientLastName", required = false) String patientLastName
    );
}
