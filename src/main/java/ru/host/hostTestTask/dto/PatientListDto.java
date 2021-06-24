package ru.host.hostTestTask.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * PatientListDto - Класс для хранения данных используемых в слое представления ввиде списка состоящего из элементов типа Patient
 */
public class PatientListDto {
    private List<PatientDto> listPatientDto = new ArrayList<>();

    /**
     * Стандартынй пустой конструктор
     */
    public PatientListDto() {
    }

    /**
     * Стандартынй конструкор класса
     * @param listPatientDto
     */
    public PatientListDto(List<PatientDto> listPatientDto) {
        this.listPatientDto = listPatientDto;
    }

    /**
     * @return listPatientDto
     */
    public List<PatientDto> getListPatientDto() {
        return this.listPatientDto;
    }

    /**
     * @param listPatientDto
     */
    public void setListPatientDto(List<PatientDto> listPatientDto) {
        this.listPatientDto = listPatientDto;
    }
    /**
     * @param o Проверка на эквивалетность
     * @return Boolean (True/False)
     */
}
