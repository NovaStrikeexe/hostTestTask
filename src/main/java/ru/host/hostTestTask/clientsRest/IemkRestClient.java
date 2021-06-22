package ru.host.hostTestTask.clientsRest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.host.hostTestTask.dto.PatientListDto;

@FeignClient(value = "IemkRestClient", url = "${app.REST.RestURL}")
public interface IemkRestClient {
    @RequestMapping(method = RequestMethod.GET,
            value = "iemk?patientSnils={snils}&patientLastName={lastNane}")
    PatientListDto getPatientBySnilsAndSnils(@PathVariable("snils")String snils,@PathVariable("lastName")String lastNane);
    @RequestMapping(method = RequestMethod.GET,
            value = "iemk?patientSnils={snils}")
    PatientListDto getPatientBySnils(@PathVariable("snils")String snils);
    @RequestMapping(method = RequestMethod.GET,
            value = "iemk?patientLastName={lastNane}")
    PatientListDto getPatientByLastName(@PathVariable("lastName")String lastNane);
}
