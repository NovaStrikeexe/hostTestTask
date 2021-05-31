package ru.host.hostTestTask.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
public class MoDto {
    @Setter @Getter private String shortName;
    @Setter @Getter private String codeMo;
    @Setter @Getter private Boolean isShown;
}
