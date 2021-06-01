package ru.host.hostTestTask.controllersRest;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.host.hostTestTask.dto.PatientDto;
import ru.host.hostTestTask.repository.IemkRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class IemkController {
    private final IemkRepository iemkRepository;

    @GetMapping("/iemk")
    List<PatientDto> all() {
        return iemkRepository.findBySnilsOrAndLastName("12345678790", "1234");

    }
}
