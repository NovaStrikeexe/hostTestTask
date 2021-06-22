package ru.host.hostTestTask.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * MoListDto - Класс для хранения данных используемых в слое представления ввиде списка состоящего из элементов типа Mo
 */
public class MoListDto {
    private List<MoDto> listMoDto = new ArrayList<>();

    /**
     * Стандартный пустой конструктор
     */
    public MoListDto() {
    }

    /**
     * Стандартный конструктор класса
     * @param listMoDto
     */
    public MoListDto(List<MoDto> listMoDto) {
        this.listMoDto = listMoDto;
    }

    /**
     * @return listMoDto
     */
    public List<MoDto> getListMoDto() {
        return this.listMoDto;
    }

    /**
     * @param listMoDto
     */
    public void setListMoDto(List<MoDto> listMoDto) {
        this.listMoDto = listMoDto;
    }
    /**
     * @param o Проверка на эквивалетность
     * @return Boolean (True/False)
     */
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MoListDto)) return false;
        final MoListDto other = (MoListDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$listMoDto = this.getListMoDto();
        final Object other$listMoDto = other.getListMoDto();
        if (this$listMoDto == null ? other$listMoDto != null : !this$listMoDto.equals(other$listMoDto)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MoListDto;
    }
    /**
     * @return result(parameters converted to hashcode)
     */
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $listMoDto = this.getListMoDto();
        result = result * PRIME + ($listMoDto == null ? 43 : $listMoDto.hashCode());
        return result;
    }
    /**
     * @return A String with the output of all data from MoListDto
     */
    public String toString() {
        return "MoListDto(listMoDto=" + this.getListMoDto() + ")";
    }
}
