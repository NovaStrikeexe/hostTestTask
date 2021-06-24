package ru.host.hostTestTask.controllersRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.host.hostTestTask.entities.SaveData;
import ru.host.hostTestTask.serviceRest.DataRestService;

/**
 * DataController - Класс для сохранения данных пользователя
 */
@RestController
public class DataController  {
    private final DataRestService dataRestService;
    @Autowired
    public DataController(DataRestService dataRestService) {
        this.dataRestService = dataRestService;
    }
    @PostMapping("/dataSave")
    public void saveUserData(SaveData saveData){
        dataRestService.SaveAllData(saveData);
    }
}
