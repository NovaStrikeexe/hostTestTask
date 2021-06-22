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
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PatientListDto)) return false;
        final PatientListDto other = (PatientListDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$listPatientDto = this.getListPatientDto();
        final Object other$listPatientDto = other.getListPatientDto();
        if (this$listPatientDto == null ? other$listPatientDto != null : !this$listPatientDto.equals(other$listPatientDto))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PatientListDto;
    }
    /**
     * @return result(parameters converted to hashcode)
     */
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $listPatientDto = this.getListPatientDto();
        result = result * PRIME + ($listPatientDto == null ? 43 : $listPatientDto.hashCode());
        return result;
    }
    /**
     * @return A String with the output of all data from PatientListDto
     */
    public String toString() {
        return "PatientListDto(listPatientDto=" + this.getListPatientDto() + ")";
    }
}
