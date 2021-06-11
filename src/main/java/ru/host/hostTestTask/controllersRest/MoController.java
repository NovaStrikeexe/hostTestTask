package ru.host.hostTestTask.controllersRest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import ru.host.hostTestTask.dto.MoListDto;
import ru.host.hostTestTask.entities.Mo;
import ru.host.hostTestTask.repository.MoListRepository;
// TODO https://stackoverflow.com/questions/26549379/when-use-responseentityt-and-restcontroller-for-spring-restful-applications
@RestController("MoController")
public class MoController extends WebServiceGatewaySupport {
    private final MoListRepository moListRepository;

    MoController(MoListRepository moListRepository) {
        this.moListRepository = moListRepository;
    }

    public ResponseEntity<Mo> getMo(){
        final MoListDto  moListDto = new MoListDto();
        return null;
    }
}
