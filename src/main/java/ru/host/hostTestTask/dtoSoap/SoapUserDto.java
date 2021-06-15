package ru.host.hostTestTask.dtoSoap;

import ru.hostco.reguser.types.DocumentsType;
import ru.hostco.reguser.types.GetUserResponseType;

import javax.xml.datatype.XMLGregorianCalendar;

/*
 * Класс под работу с Soap через инфу из запроса /getUser (из ru.hostco.reguser.types)
 * Есть два вариант как производить с ними работу maven и напрямую
 * Первый вариант необходим тк это временные файлы
 * TODO перед отпровкой тз подготовить архив с данным пакетом
 * */
public class SoapUserDto {
    private String snils;
    private String lastName;//имя пользователя
    private String firstname;// фамилия
    private String middleName;// отчество
    private XMLGregorianCalendar birthdate;
    private String Phone;
    private String email;
    private Integer gender;
    private String PolicyNumber;
    private DocumentsType documentsType;

    public SoapUserDto(GetUserResponseType getUserResponseType) {
    }


    public String getSnils() {
        return this.snils;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public XMLGregorianCalendar getBirthdate() {
        return this.birthdate;
    }

    public String getPhone() {
        return this.Phone;
    }

    public String getEmail() {
        return this.email;
    }

    public Integer getGender() {
        return this.gender;
    }

    public String getPolicyNumber() {
        return this.PolicyNumber;
    }

    public DocumentsType getDocumentsType() {
        return this.documentsType;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setBirthdate(XMLGregorianCalendar birthdate) {
        this.birthdate = birthdate;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setPolicyNumber(String PolicyNumber) {
        this.PolicyNumber = PolicyNumber;
    }

    public void setDocumentsType(DocumentsType documentsType) {
        this.documentsType = documentsType;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SoapUserDto)) return false;
        final SoapUserDto other = (SoapUserDto) o;
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
        return other instanceof SoapUserDto;
    }

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

    public String toString() {
        return "SoapUserDto(snils=" + this.getSnils() + ", lastName=" + this.getLastName() + ", firstname=" + this.getFirstname() + ", middleName=" + this.getMiddleName() + ", birthdate=" + this.getBirthdate() + ", Phone=" + this.getPhone() + ", email=" + this.getEmail() + ", gender=" + this.getGender() + ", PolicyNumber=" + this.getPolicyNumber() + ", documentsType=" + this.getDocumentsType() + ")";
    }
}
