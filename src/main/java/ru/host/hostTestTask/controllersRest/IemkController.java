package ru.host.hostTestTask.controllersRest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.host.hostTestTask.dto.PatientListDto;
import ru.host.hostTestTask.serviceRest.IemkRestService;

/**
 * IemkController - Класс отвечающий за запрос поиска пациента по параметрам "snils" и"lastName"
 */
@RestController
@EnableAutoConfiguration
public class IemkController{

    private final IemkRestService iemkRestService;

    public IemkController(IemkRestService iemkRestService) {
        this.iemkRestService = iemkRestService;
    }

    @GetMapping("/iemkSearch")
    public ResponseEntity<PatientListDto> searchPatients(
            @RequestParam(value = "patientSnils",required = false) String patientSnils,
            @RequestParam(value = "patientLastName",required = false) String patientLastName
    ) {
        return iemkRestService.getPatients(patientSnils,patientLastName);
    }

}
