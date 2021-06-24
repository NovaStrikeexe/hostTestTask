package ru.host.hostTestTask.serviceRest;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import ru.host.hostTestTask.entities.SaveData;
import ru.host.hostTestTask.exceptions.ResponseException;
import ru.host.hostTestTask.repository.DataRepository;

import java.util.Objects;

@Service
@Data
public class DataRestServiceImpl implements DataRestService {
    final private DataRepository dataRepository;
    private Object SaveData;

    public DataRestServiceImpl(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }
    @Override
    public void SaveAllData(SaveData saveData) {
        if(Objects.nonNull(saveData.getId())){
            dataRepository.save(saveData);
        }
        else {
            throw new ResponseException(HttpStatus.BAD_REQUEST,"It looks like UserId is null");
        }

    }
}
