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

    /**
     * @param o Проверка на эквивалетность
     * @return Boolean (True/False)
     */
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DataDto)) return false;
        final DataDto other = (DataDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final Object this$cardNumber = this.getCardNumber();
        final Object other$cardNumber = other.getCardNumber();
        if (this$cardNumber == null ? other$cardNumber != null : !this$cardNumber.equals(other$cardNumber))
            return false;
        final Object this$lastName = this.getLastName();
        final Object other$lastName = other.getLastName();
        if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
        final Object this$firstName = this.getFirstName();
        final Object other$firstName = other.getFirstName();
        if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) return false;
        final Object this$middleName = this.getMiddleName();
        final Object other$middleName = other.getMiddleName();
        if (this$middleName == null ? other$middleName != null : !this$middleName.equals(other$middleName))
            return false;
        final Object this$snils = this.getSnils();
        final Object other$snils = other.getSnils();
        if (this$snils == null ? other$snils != null : !this$snils.equals(other$snils)) return false;
        final Object this$enp = this.getEnp();
        final Object other$enp = other.getEnp();
        if (this$enp == null ? other$enp != null : !this$enp.equals(other$enp)) return false;
        final Object this$birthDate = this.getBirthDate();
        final Object other$birthDate = other.getBirthDate();
        if (this$birthDate == null ? other$birthDate != null : !this$birthDate.equals(other$birthDate)) return false;
        final Object this$remdResult = this.getRemdResult();
        final Object other$remdResult = other.getRemdResult();
        if (this$remdResult == null ? other$remdResult != null : !this$remdResult.equals(other$remdResult))
            return false;
        final Object this$codeMo = this.getCodeMo();
        final Object other$codeMo = other.getCodeMo();
        if (this$codeMo == null ? other$codeMo != null : !this$codeMo.equals(other$codeMo)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DataDto;
    }

    /**
     * @return result(parameters converted to hashcode)
     */
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $cardNumber = this.getCardNumber();
        result = result * PRIME + ($cardNumber == null ? 43 : $cardNumber.hashCode());
        final Object $lastName = this.getLastName();
        result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
        final Object $firstName = this.getFirstName();
        result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
        final Object $middleName = this.getMiddleName();
        result = result * PRIME + ($middleName == null ? 43 : $middleName.hashCode());
        final Object $snils = this.getSnils();
        result = result * PRIME + ($snils == null ? 43 : $snils.hashCode());
        final Object $enp = this.getEnp();
        result = result * PRIME + ($enp == null ? 43 : $enp.hashCode());
        final Object $birthDate = this.getBirthDate();
        result = result * PRIME + ($birthDate == null ? 43 : $birthDate.hashCode());
        final Object $remdResult = this.getRemdResult();
        result = result * PRIME + ($remdResult == null ? 43 : $remdResult.hashCode());
        final Object $codeMo = this.getCodeMo();
        result = result * PRIME + ($codeMo == null ? 43 : $codeMo.hashCode());
        return result;
    }

    /**
     * @return A String with the output of all data from Userdto
     */
    public String toString() {
        return "DataDto(userId=" + this.getUserId() + ", cardNumber=" + this.getCardNumber() + ", lastName=" + this.getLastName() + ", firstName=" + this.getFirstName() + ", middleName=" + this.getMiddleName() + ", snils=" + this.getSnils() + ", enp=" + this.getEnp() + ", birthDate=" + this.getBirthDate() + ", remdResult=" + this.getRemdResult() + ", codeMo=" + this.getCodeMo() + ")";
    }
}
