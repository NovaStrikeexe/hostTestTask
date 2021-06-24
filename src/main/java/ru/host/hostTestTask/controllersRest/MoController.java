package ru.host.hostTestTask.controllersRest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.host.hostTestTask.dto.MoListDto;
import ru.host.hostTestTask.serviceRest.MoListRestService;

/**
 * MoController - класс отвечающий за запрос поиска MO по "признаку отображения в приложении": isShown
 */
@RestController("MoController")
public class MoController {
    private final MoListRestService moListRestService;

    public MoController(MoListRestService moListRestService) {
        this.moListRestService = moListRestService;
    }

    @RequestMapping("/mo")
    public ResponseEntity<MoListDto> getMo(){
        return moListRestService.getMoListByIsShownTrue(Boolean.TRUE);
    }
}
