package ru.host.hostTestTask.serviceRest;

import org.springframework.stereotype.Service;
import ru.host.hostTestTask.entities.SaveData;

/**
 * DataRestService - Сервис для сохранения данных (Оснавная логика DataController )
 */
@Service
public interface DataRestService {
    void SaveAllData(SaveData saveData);
}
