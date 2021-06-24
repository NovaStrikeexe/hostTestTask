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
}
