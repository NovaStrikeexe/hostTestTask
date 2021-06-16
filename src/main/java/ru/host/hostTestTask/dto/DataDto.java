package ru.host.hostTestTask.dto;

import java.util.Date;

public class DataDto {
    private Long userId;
    private String cardNumber;
    private String lastName;
    private String firstName;
    private String middleName;
    private String snils;
    private String enp;
    private Date birthDate;
    private String remdResult;
    private String codeMo;

    public DataDto() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getSnils() {
        return this.snils;
    }

    public String getEnp() {
        return this.enp;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public String getRemdResult() {
        return this.remdResult;
    }

    public String getCodeMo() {
        return this.codeMo;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }

    public void setEnp(String enp) {
        this.enp = enp;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setRemdResult(String remdResult) {
        this.remdResult = remdResult;
    }

    public void setCodeMo(String codeMo) {
        this.codeMo = codeMo;
    }

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

    public String toString() {
        return "DataDto(userId=" + this.getUserId() + ", cardNumber=" + this.getCardNumber() + ", lastName=" + this.getLastName() + ", firstName=" + this.getFirstName() + ", middleName=" + this.getMiddleName() + ", snils=" + this.getSnils() + ", enp=" + this.getEnp() + ", birthDate=" + this.getBirthDate() + ", remdResult=" + this.getRemdResult() + ", codeMo=" + this.getCodeMo() + ")";
    }
}
