package ru.host.hostTestTask.dto;

import java.time.LocalDate;

/**
 * PatientDto - Класс для хранения данных используемых в слое представления типа Patient
 */
public class PatientDto {
    /**
     * Фамилия
     */
    private String lastName;
    /**
     * Имя
     */
    private String firstName;
    /**
     * Отчество
     */
    private String middleName;
    /**
     * СНИЛС
     */
    private String snils;
    /**
     * полис ОМС
     */
    private String enp;
    /**
     * Дата рождения
     */
    private LocalDate birthDate;

    /**
     * Стандартный пустой конструктор
     */
    public PatientDto() {
    }

    /**
     * Стандартный конструктор класса
     *
     * @param lastName
     * @param firstName
     * @param middleName
     * @param snils
     * @param enp
     * @param birthDate
     */
    public PatientDto(String lastName, String firstName, String middleName, String snils, String enp, LocalDate birthDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.snils = snils;
        this.enp = enp;
        this.birthDate = birthDate;
    }

    /**
     * @return lastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * @return firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * @return middleName
     */
    public String getMiddleName() {
        return this.middleName;
    }

    /**
     * @return snils
     */
    public String getSnils() {
        return this.snils;
    }

    /**
     * @return enp
     */
    public String getEnp() {
        return this.enp;
    }

    /**
     * @return birthDate
     */
    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    /**
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param middleName
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * @param snils
     */
    public void setSnils(String snils) {
        this.snils = snils;
    }

    /**
     * @param enp
     */
    public void setEnp(String enp) {
        this.enp = enp;
    }

    /**
     * @param birthDate
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

}
