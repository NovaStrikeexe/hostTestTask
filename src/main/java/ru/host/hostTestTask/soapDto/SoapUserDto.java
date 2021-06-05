package ru.host.hostTestTask.soapDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.hostco.reguser.types.DocumentsType;
import ru.hostco.reguser.types.GetUserResponseType;
import ru.hostco.reguser.types.LoginStrictType;

import javax.xml.datatype.XMLGregorianCalendar;

/*
 * Класс под работу с Soap через инфу из запроса /getUser
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
        final LoginStrictType loginStrictType = getUserResponseType.getLogin();
        this.snils = loginStrictType.getSNILS();
        this.lastName = loginStrictType.getLastname();
        this.firstname = loginStrictType.getFirstname();
        this.middleName = loginStrictType.getMiddlename();
        this.birthdate = loginStrictType.getBirthDate();
        this.Phone = loginStrictType.getPhone();
        this.email = loginStrictType.getEmail();
        this.gender = loginStrictType.getGender();
        this.PolicyNumber = loginStrictType.getPolicyNumber();
        this.documentsType = loginStrictType.getDocuments();


    }
}
