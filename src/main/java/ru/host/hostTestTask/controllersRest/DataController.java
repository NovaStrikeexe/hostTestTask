package ru.host.hostTestTask.controllersRest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import ru.host.hostTestTask.dto.DataDto;
import ru.host.hostTestTask.repository.DataRepository;

import java.util.List;

@RestController("DataController")
@RequestMapping("/data")
@RequiredArgsConstructor
public class DataController extends WebServiceGatewaySupport {
    private DataRepository dataRepository;
    List<DataDto> all(){
        //return dataRepository.saveAllData();
        return null;
    }

}
