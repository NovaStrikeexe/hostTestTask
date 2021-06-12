package ru.host.hostTestTask.controllersRest;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.host.hostTestTask.dto.PatientDto;
import ru.host.hostTestTask.repository.IemkRepository;

import java.util.List;

@RestController("IemkController")
@RequestMapping("/iemk")
@Data
public class IemkController{
    private final IemkRepository iemkRepository;


    List<PatientDto> all() {
        //return iemkRepository.findBySnilsOrAndLastName("12345678790", "1234");
        return null;
    }
}
