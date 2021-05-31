package ru.host.hostTestTask.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MoListDto {
    private List<MoDto> listMoDto = new ArrayList<>();
}
