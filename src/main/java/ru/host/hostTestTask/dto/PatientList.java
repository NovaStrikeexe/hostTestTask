package ru.host.hostTestTask.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class PatientList {
    @Setter @Getter private List<Patient> listPatient = new ArrayList<>();
}
