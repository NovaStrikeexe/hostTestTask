package ru.host.hostTestTask.dto;

/**
 * MoDto - Класс для хранения данных используемых в слое представления типа Mo
 */
public class MoDto {
    /**
     * Краткое название Медицинской Организации
     */
    private String shortName;
    /**
     * Код Медицинской Организации
     */
    private String codeMo;
    /**
     * Параметр отбражения в приложении
     */
    private Boolean isShown;

    /**
     * Стадартный пустой конструктор
     */
    public MoDto() {
    }

    /**
     * Стандартный конструктор класса
     * @param shortName
     * @param codeMo
     * @param isShown
     */
    public MoDto(String shortName, String codeMo, Boolean isShown) {
        this.shortName = shortName;
        this.codeMo = codeMo;
        this.isShown = isShown;
    }

    /**
     * @return shortName
     */
    public String getShortName() {
        return this.shortName;
    }

    /**
     * @return codeMo
     */
    public String getCodeMo() {
        return this.codeMo;
    }

    /**
     * @return isShown
     */
    public Boolean getIsShown() {
        return this.isShown;
    }

    /**
     * @param shortName
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * @param codeMo
     */
    public void setCodeMo(String codeMo) {
        this.codeMo = codeMo;
    }

    /**
     * @param isShown
     */
    public void setIsShown(Boolean isShown) {
        this.isShown = isShown;
    }
}
