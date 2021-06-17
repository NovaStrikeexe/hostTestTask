package ru.host.hostTestTask.serviceRest;

import ru.host.hostTestTask.dto.MoListDto;
import ru.host.hostTestTask.entities.Mo;

public interface MoListRestService {
    public Mo getMoListByIsShownTrue(Boolean is_shown);

}
