package ru.host.hostTestTask.controllersRest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.host.hostTestTask.dto.PatientDto;
import ru.host.hostTestTask.repository.IemkRepository;

import java.util.List;

@RestController
public class IemkController {
    private final IemkRepository iemkRepository;

    public IemkController(IemkRepository iemkRepository) {
        this.iemkRepository = iemkRepository;
    }
    @GetMapping("/iemk")
    List<PatientDto> all(){
        return iemkRepository.findBySnilsOrAndLastName();

    }
}
