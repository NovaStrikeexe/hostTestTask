package ru.host.hostTestTask.serviceRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import ru.host.hostTestTask.dto.MoDto;
import ru.host.hostTestTask.dto.MoListDto;
import ru.host.hostTestTask.exceptions.ResponseException;
import ru.host.hostTestTask.repository.MoListRepository;

/**
 * MoListRestServiceImpl - класс для расширения сервиса MoListRestService
 */
public class MoListRestServiceImpl implements MoListRestService {
    private final MoListRepository moListRepository;

    @Autowired
    public MoListRestServiceImpl(MoListRepository moListRepository) {
        this.moListRepository = moListRepository;
    }
    @GetMapping("/mo")
    @Override
    public ResponseEntity<MoListDto> getMoListByIsShownTrue(Boolean is_shown) {
        final MoListDto moListDto = new MoListDto();
        moListRepository.findByIsShownTrue(true).forEach(mo -> moListDto.getListMoDto().add(new MoDto(mo.getNameshort(),
                mo.getOid(),mo.getIsShown())));
        if(moListDto.getListMoDto().isEmpty()){
            throw new ResponseException(HttpStatus.NOT_FOUND,"It is impossible to form the MO list with a positive display flag");
        }
        return new ResponseEntity<MoListDto>(moListDto, HttpStatus.OK);
    }
}
