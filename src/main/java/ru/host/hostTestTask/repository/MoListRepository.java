package ru.host.hostTestTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.host.hostTestTask.dto.MoListDto;
import java.util.List;

public interface MoListRepository extends JpaRepository<MoListDto,Integer> {
    @Query(value = "SELECT * FROM ref_mo where is_show like TRUE")
    List<MoListDto> MoListDto(boolean isShown);
}
