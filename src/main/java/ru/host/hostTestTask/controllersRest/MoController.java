package ru.host.hostTestTask.controllersRest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.host.hostTestTask.dto.MoListDto;
import ru.host.hostTestTask.entities.Mo;
import ru.host.hostTestTask.repository.MoListRepository;
// TODO https://stackoverflow.com/questions/26549379/when-use-responseentityt-and-restcontroller-for-spring-restful-applications
@RestController("MoController")
public class MoController {
    private final String ERROR_404 = "The list of medical organizations CANNOT be displayed!";
    private final String ERROR_200 = "Everything is okey, the list of medical organizations(mo) is displayed.";
    private final MoListRepository moListRepository;
    MoController(MoListRepository moListRepository) {
        this.moListRepository = moListRepository;
    }

    public ResponseEntity<Mo> getMo(){
        final MoListDto  moListDto = new MoListDto();
        //moListRepository.findByIsShownTrue(true).
        //                forEach(moListRepository -> moListDto.getListMoDto().add(moListRepository));
        return null;
    }
}
