package ru.host.hostTestTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.host.hostTestTask.entities.Mo;

import java.util.List;

/**
 *
 */
@Repository
public interface MoListRepository extends JpaRepository<Mo, Long> {
    List<Mo> findByIsShownTrue(Boolean isShown);
}
