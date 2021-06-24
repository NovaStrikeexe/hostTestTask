package ru.host.hostTestTask.serviceRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import ru.host.hostTestTask.clientsRest.IemkRestClient;
import ru.host.hostTestTask.dto.PatientListDto;
import ru.host.hostTestTask.exceptions.ResponseException;

/**
 * IemkRestServiceImpl - класс для расширения сервиса IemkRestService
 */
public class IemkRestServiceImpl implements IemkRestService{
    private IemkRestClient iemkRestClient;
    @Autowired
    public IemkRestServiceImpl(IemkRestClient iemkRestClient) {
        this.iemkRestClient = iemkRestClient;
    }
    @Override
    public ResponseEntity<PatientListDto> getPatients(
    @RequestParam(value = "patientSnils",required = false) String patientSnils,
    @RequestParam(value = "patientLastName",required = false) String patientLastName)
    {
        PatientListDto patientListDto;
        if(patientSnils != null && patientLastName !=null){
            patientListDto = iemkRestClient.getPatientBySnilsAndSnils(patientSnils,patientLastName);
        }
        else if(patientSnils!=null){
            patientListDto = iemkRestClient.getPatientBySnils(patientSnils);
        }
        else if (patientLastName!=null){
            patientListDto = iemkRestClient.getPatientByLastName(patientLastName);
        }
        else {
            throw new ResponseException(HttpStatus.BAD_REQUEST, "Parameters not entered");
        }

        if (patientListDto.getListPatientDto().isEmpty()){
            throw new ResponseException(HttpStatus.NOT_FOUND, "Patient with this parameters is not found");
        }
        return new ResponseEntity<>(patientListDto,HttpStatus.OK);
    }
}
