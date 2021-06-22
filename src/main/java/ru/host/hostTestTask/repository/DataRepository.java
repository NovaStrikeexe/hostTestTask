package ru.host.hostTestTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.host.hostTestTask.entities.SaveData;

/**
 * Репозиторий для работы с запросами по сохраниению данных в базе
 */
@Repository
public interface DataRepository extends JpaRepository<SaveData, Long> {
}
