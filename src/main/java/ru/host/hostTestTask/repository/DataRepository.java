package ru.host.hostTestTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import ru.host.hostTestTask.entities.SaveData;

/**
 * Репозиторий для работы с запросами по сохраниению данных типа "user"
 */
@Repository
public interface DataRepository extends JpaRepository<SaveData, Long> {
    @Override
    @NonNull
    <S extends SaveData> S save(S s);
}
