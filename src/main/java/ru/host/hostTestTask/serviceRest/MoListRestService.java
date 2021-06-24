package ru.host.hostTestTask.serviceRest;

import org.springframework.http.ResponseEntity;
import ru.host.hostTestTask.dto.MoListDto;

public interface MoListRestService {
    public ResponseEntity<MoListDto> getMoListByIsShownTrue(Boolean isShown);
}
