package ru.host.hostTestTask.controllersRest;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.host.hostTestTask.dto.DataDto;
import ru.host.hostTestTask.repository.DataRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class DataController {
    private DataRepository dataRepository;
    @GetMapping("/data")
    List<DataDto> all(){
        //return dataRepository.saveAllData();
        return null;
    }

}
