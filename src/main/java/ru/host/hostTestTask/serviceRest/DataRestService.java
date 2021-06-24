package ru.host.hostTestTask.serviceRest;

import org.springframework.stereotype.Service;
import ru.host.hostTestTask.entities.SaveData;

@Service
public interface DataRestService {
    void SaveAllData(SaveData saveData);
}
