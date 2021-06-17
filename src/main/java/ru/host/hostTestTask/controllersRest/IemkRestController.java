package ru.host.hostTestTask.controllersRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.host.hostTestTask.dto.PatientListDto;
import ru.host.hostTestTask.serviceRest.IemkRestService;

@RestController
public class IemkRestController {
    private final IemkRestService iemkRestService;
    @Autowired
    public IemkRestController(IemkRestService iemkRestService) {
        this.iemkRestService = iemkRestService;
    }

    @RequestMapping(value = "/iemk", method = RequestMethod.GET)
    public ResponseEntity<PatientListDto> getPatient(@RequestParam(value = "snils")String snils,
                                                     @RequestParam(value = "lastName")String lastName){
        return iemkRestService.getPatients(snils, lastName);
    }
}
