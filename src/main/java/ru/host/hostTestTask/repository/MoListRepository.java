package ru.host.hostTestTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.host.hostTestTask.dto.MoListDto;

import java.util.List;

public interface MoListRepository extends JpaRepository<MoListDto, Integer> {
    List<MoListDto> findByIsShownTrue(Boolean is_shown);
}
