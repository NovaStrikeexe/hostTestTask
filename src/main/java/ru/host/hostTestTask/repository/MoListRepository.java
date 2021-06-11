package ru.host.hostTestTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.host.hostTestTask.entities.Mo;

import java.util.List;

public interface MoListRepository extends JpaRepository<Mo, Long> {
    List<Mo> findByIsShownTrue(Boolean is_shown);

}
