package ru.host.hostTestTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.host.hostTestTask.dto.MoDto;

import java.util.List;
@Repository
public interface MoListRepository extends JpaRepository<MoDto, Long> {
    List<MoDto> findByIsShownTrue(Boolean is_shown);

}
