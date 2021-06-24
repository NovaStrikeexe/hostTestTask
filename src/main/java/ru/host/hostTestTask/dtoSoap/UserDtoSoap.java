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

    public UserDtoSoap() {
    }

    public UserDtoSoap(String snils, String lastName, String firstname, String middleName, XMLGregorianCalendar birthdate, String phone, String email, Integer gender, String policyNumber, DocumentsType documentsType) {
        this.snils = snils;
        this.lastName = lastName;
        this.firstname = firstname;
        this.middleName = middleName;
        this.birthdate = birthdate;
        Phone = phone;
        this.email = email;
        this.gender = gender;
        PolicyNumber = policyNumber;
        this.documentsType = documentsType;
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
}
