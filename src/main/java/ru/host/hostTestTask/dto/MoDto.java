package ru.host.hostTestTask.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class MoDto {
    @Setter @Getter private String shortName;
    @Setter @Getter private String codeMo;
    @Setter @Getter private Boolean isShown;
}
