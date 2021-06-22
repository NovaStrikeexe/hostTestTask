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

    /**
     * @param o Проверка на эквивалетность
     * @return Boolean (True/False)
     */
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PatientDto)) return false;
        final PatientDto other = (PatientDto) o;
        if (!other.canEqual((Object) this)) return false;
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
        return true;
    }


    protected boolean canEqual(final Object other) {
        return other instanceof PatientDto;
    }

    /**
     * @return result(parameters converted to hashcode)
     */
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
        return result;
    }
    /**
     * @return A String with the output of all data from PatientDto
     */
    public String toString() {
        return "PatientDto(lastName=" + this.getLastName() + ", firstName=" + this.getFirstName() + ", middleName=" + this.getMiddleName() + ", snils=" + this.getSnils() + ", enp=" + this.getEnp() + ", birthDate=" + this.getBirthDate() + ")";
    }
}
