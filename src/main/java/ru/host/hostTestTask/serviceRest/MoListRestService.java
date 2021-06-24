package ru.host.hostTestTask.serviceRest;

import org.springframework.http.ResponseEntity;
import ru.host.hostTestTask.dto.MoListDto;

/**
 * MoListRestService - Сервис для поиска данных (Оснавная логика MoController )
 */
public interface MoListRestService {
    ResponseEntity<MoListDto> getMoListByIsShownTrue(Boolean isShown);
}
