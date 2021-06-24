package ru.host.hostTestTask.dto;


/**
 * UserDto - Класс для хранения данных используемых в слое представления типа User
 */
public class UserDto {

    /**
     * userId = Уникальный номер пользователея
     */
    private Long userId;
    /**
     * lastName = Фамилия пользователя
     */
    private String lastName;
    /**
     * firstName = Имя пользователя
     */
    private String firstname;
    /**
     * middleName = Отчество пользователя
     */
    private String middleName;

    /**
     * Стандартный конструктор класса
     * @param userId
     * @param lastName
     * @param firstname
     * @param middleName
     */

    public UserDto(Long userId, String lastName, String firstname, String middleName) {
        this.userId = userId;
        this.lastName = lastName;
        this.firstname = firstname;
        this.middleName = middleName;
    }

    /**
     * Пустой конструктор класса
     */
    public UserDto() {
    }

    /*Блок геттеров*/

    /**
     * @return userID
     */
    public Long getUserId() { return this.userId; }

    /**
     * @return lastName
     */
    public String getLastName() { return this.lastName; }

    /**
     * @return firstName
     */
    public String getFirstname() { return this.firstname; }

    /**
     * @return middleName
     */
    public String getMiddleName() { return this.middleName; }

    /*Блок сеттеров*/

    /**
     * @param userId
     */
    public void setUserId(Long userId) { this.userId = userId; }

    /**
     * @param lastName
     */
    public void setLastName(String lastName) { this.lastName = lastName; }

    /**
     * @param firstname
     */
    public void setFirstname(String firstname) { this.firstname = firstname; }

    /**
     * @param middleName
     */
    public void setMiddleName(String middleName) { this.middleName = middleName; }



}
