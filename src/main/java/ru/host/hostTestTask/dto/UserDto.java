package ru.host.hostTestTask.dto;


/**
 *
 * UserDto - Класс для хранения данных используемых в слое представления типа User
 *
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

    /**
     * @param o Проверка на эквивалетность
     * @return Boolean (True/False)
     */
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserDto)) return false;
        final UserDto other = (UserDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
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
        return true;
    }

    /**
     * @param other
     * @return instanceof UserDto
     */
    protected boolean canEqual(final Object other) { return other instanceof UserDto; }

    /**
     * @return result(parameters converted to hashcode)
     */
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $lastName = this.getLastName();
        result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
        final Object $firstname = this.getFirstname();
        result = result * PRIME + ($firstname == null ? 43 : $firstname.hashCode());
        final Object $middleName = this.getMiddleName();
        result = result * PRIME + ($middleName == null ? 43 : $middleName.hashCode());
        return result;
    }

    /**
     * @return A String with the output of all data from Userdto
     */
    public String toString() {
        return "UserDto(userId=" + this.getUserId() + ", lastName=" + this.getLastName() + ", firstname=" + this.getFirstname() + ", middleName=" + this.getMiddleName() + ")";
    }

}
