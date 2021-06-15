package ru.host.hostTestTask.serviceRest;

import org.springframework.stereotype.Service;
import ru.host.hostTestTask.entities.SaveData;

@Service
public interface DataRestService {
    public void SaveAllData(SaveData saveData);
}
