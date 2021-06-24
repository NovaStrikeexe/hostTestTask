package ru.host.hostTestTask.dto;

import java.util.Date;

/**
 * DataDto - Класс для хранения данных используемых в слое представления типа User
 */
public class DataDto {
    /**
     *  уникальный номер пользователя
     */
    private Long userId;
    /**
     *  номер медицинской карты
     */
    private String cardNumber;
    /**
     * фамилия
     */
    private String lastName;
    /**
     * имя
     */
    private String firstName;
    /**
     * отчество
     */
    private String middleName;
    /**
     * номер СНИЛС
     */
    private String snils;
    /**
     * полис ОМС
     */
    private String enp;
    /**
     * дата рождения
     */
    private Date birthDate;
    /**
     * результат отправки в рэмд
     */
    private String remdResult;
    /**
     * код МО
     */
    private String codeMo;

    /**
     * Пустой конструкор класса
     */
    public DataDto() {
    }

    /**
     * Стандартный конструктор класса
     * @param userId
     * @param cardNumber
     * @param lastName
     * @param firstName
     * @param middleName
     * @param snils
     * @param enp
     * @param birthDate
     * @param remdResult
     * @param codeMo
     */
    public DataDto(Long userId, String cardNumber, String lastName, String firstName, String middleName, String snils, String enp, Date birthDate, String remdResult, String codeMo) {
        this.userId = userId;
        this.cardNumber = cardNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.snils = snils;
        this.enp = enp;
        this.birthDate = birthDate;
        this.remdResult = remdResult;
        this.codeMo = codeMo;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * @return cardNumber
     */
    public String getCardNumber() {
        return this.cardNumber;
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
    public String getSnils() { return this.snils; }

    /**
     * @return enp
     */
    public String getEnp() {
        return this.enp;
    }

    /**
     * @return birthDate
     */
    public Date getBirthDate() {
        return this.birthDate;
    }

    /**
     * @return remdResult
     */
    public String getRemdResult() { return this.remdResult; }

    /**
     * @return codeMo
     */
    public String getCodeMo() {
        return this.codeMo;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
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
    public void setSnils(String snils) { this.snils = snils; }

    /**
     * @param enp
     */
    public void setEnp(String enp) {
        this.enp = enp;
    }

    /**
     * @param birthDate
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @param remdResult
     */
    public void setRemdResult(String remdResult) {
        this.remdResult = remdResult;
    }

    /**
     * @param codeMo
     */
    public void setCodeMo(String codeMo) {
        this.codeMo = codeMo;
    }

}
