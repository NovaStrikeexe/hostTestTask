package ru.host.hostTestTask.dto;

import java.util.ArrayList;
import java.util.List;

public class PatientListDto {
    private List<PatientDto> listPatientDto = new ArrayList<>();

    public PatientListDto() {
    }

    public List<PatientDto> getListPatientDto() {
        return this.listPatientDto;
    }

    public void setListPatientDto(List<PatientDto> listPatientDto) {
        this.listPatientDto = listPatientDto;
    }

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

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $listPatientDto = this.getListPatientDto();
        result = result * PRIME + ($listPatientDto == null ? 43 : $listPatientDto.hashCode());
        return result;
    }

    public String toString() {
        return "PatientListDto(listPatientDto=" + this.getListPatientDto() + ")";
    }
}
