package ru.host.hostTestTask.controllersRest;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.host.hostTestTask.dto.MoListDto;
import ru.host.hostTestTask.repository.MoListRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class MoController {
    private final MoListRepository moListRepository;

    @GetMapping("/mo")
    List<MoListDto> all() {
        return null;
        //return moListRepository.findByIsShownTrue();
    }

}
