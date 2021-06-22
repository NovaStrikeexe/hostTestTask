package ru.host.hostTestTask.dtoSoap;

import ru.hostco.reguser.types.DocumentsType;
import ru.hostco.reguser.types.GetUserResponseType;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Класс под работу с Soap через инфомацию из запроса /getUser (${app.SOAP.URL})
 */
public class UserDtoSoap {
    /**
     * СНИЛС
     */
    private String snils;
    /**
     *  Фамилия
     */
    private String lastName;
    /**
     * Имя
     */
    private String firstname;
    /**
     * Отчество
     */
    private String middleName;
    /**
     * Дата рождения
     */
    private XMLGregorianCalendar birthdate;
    /**
     * Номер мобильного телефона
     */
    private String Phone;
    /**
     * электронная почта
     */
    private String email;
    /**
     * Пол
     */
    private Integer gender;
    /**
     * Номер полиса
     */
    private String PolicyNumber;
    /**
     * Документы
     */
    private DocumentsType documentsType;

    /**
     * @param getUserResponseType
     */
    public UserDtoSoap(GetUserResponseType getUserResponseType) {
    }
    /**
     * @return snils
     */
    public String getSnils() {
        return this.snils;
    }

    /**
     * @return lastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * @return firstname
     */
    public String getFirstname() {
        return this.firstname;
    }

    /**
     * @return middleName
     */
    public String getMiddleName() {
        return this.middleName;
    }

    /**
     * @return birthdate
     */
    public XMLGregorianCalendar getBirthdate() {
        return this.birthdate;
    }

    /**
     * @return Phone
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return gender
     */
    public Integer getGender() {
        return this.gender;
    }

    /**
     * @return PolicyNumber
     */
    public String getPolicyNumber() {
        return this.PolicyNumber;
    }

    /**
     * @return documentsType
     */
    public DocumentsType getDocumentsType() {
        return this.documentsType;
    }

    /**
     * @param snils
     */
    public void setSnils(String snils) {
        this.snils = snils;
    }

    /**
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @param middleName
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * @param birthdate
     */
    public void setBirthdate(XMLGregorianCalendar birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @param Phone
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param gender
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * @param PolicyNumber
     */
    public void setPolicyNumber(String PolicyNumber) {
        this.PolicyNumber = PolicyNumber;
    }

    /**
     * @param documentsType
     */
    public void setDocumentsType(DocumentsType documentsType) {
        this.documentsType = documentsType;
    }

    /**
     * @param o Проверка на эквивалетность
     * @return Boolean (True/False)
     */
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserDtoSoap)) return false;
        final UserDtoSoap other = (UserDtoSoap) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$snils = this.getSnils();
        final Object other$snils = other.getSnils();
        if (this$snils == null ? other$snils != null : !this$snils.equals(other$snils)) return false;
        final Object this$lastName = this.getLastName();
        final Object other$lastName = other.getLastName();
        if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
        final Object this$firstname = this.getFirstname();
        final Object other$firstname = other.getFirstname();
        if (this$firstname == null ? other$firstname != null : !this$firstname.equals(other$firstname)) return false;
        final Object this$middleName = this.getMiddleName();
        final Object other$middleName = other.getMiddleName();
        if (this$middleName == null ? other$middleName != null : !this$middleName.equals(other$middleName))
            return false;
        final Object this$birthdate = this.getBirthdate();
        final Object other$birthdate = other.getBirthdate();
        if (this$birthdate == null ? other$birthdate != null : !this$birthdate.equals(other$birthdate)) return false;
        final Object this$Phone = this.getPhone();
        final Object other$Phone = other.getPhone();
        if (this$Phone == null ? other$Phone != null : !this$Phone.equals(other$Phone)) return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        final Object this$gender = this.getGender();
        final Object other$gender = other.getGender();
        if (this$gender == null ? other$gender != null : !this$gender.equals(other$gender)) return false;
        final Object this$PolicyNumber = this.getPolicyNumber();
        final Object other$PolicyNumber = other.getPolicyNumber();
        if (this$PolicyNumber == null ? other$PolicyNumber != null : !this$PolicyNumber.equals(other$PolicyNumber))
            return false;
        final Object this$documentsType = this.getDocumentsType();
        final Object other$documentsType = other.getDocumentsType();
        if (this$documentsType == null ? other$documentsType != null : !this$documentsType.equals(other$documentsType))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserDtoSoap;
    }

    /**
     * @return result(parameters converted to hashcode)
     */
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $snils = this.getSnils();
        result = result * PRIME + ($snils == null ? 43 : $snils.hashCode());
        final Object $lastName = this.getLastName();
        result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
        final Object $firstname = this.getFirstname();
        result = result * PRIME + ($firstname == null ? 43 : $firstname.hashCode());
        final Object $middleName = this.getMiddleName();
        result = result * PRIME + ($middleName == null ? 43 : $middleName.hashCode());
        final Object $birthdate = this.getBirthdate();
        result = result * PRIME + ($birthdate == null ? 43 : $birthdate.hashCode());
        final Object $Phone = this.getPhone();
        result = result * PRIME + ($Phone == null ? 43 : $Phone.hashCode());
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        final Object $gender = this.getGender();
        result = result * PRIME + ($gender == null ? 43 : $gender.hashCode());
        final Object $PolicyNumber = this.getPolicyNumber();
        result = result * PRIME + ($PolicyNumber == null ? 43 : $PolicyNumber.hashCode());
        final Object $documentsType = this.getDocumentsType();
        result = result * PRIME + ($documentsType == null ? 43 : $documentsType.hashCode());
        return result;
    }

    /**
     * @return A String with the output of all data from SoapUserDto
     */
    public String toString() {
        return "SoapUserDto(snils=" + this.getSnils() + ", lastName=" + this.getLastName() + ", firstname=" + this.getFirstname() + ", middleName=" + this.getMiddleName() + ", birthdate=" + this.getBirthdate() + ", Phone=" + this.getPhone() + ", email=" + this.getEmail() + ", gender=" + this.getGender() + ", PolicyNumber=" + this.getPolicyNumber() + ", documentsType=" + this.getDocumentsType() + ")";
    }
}
