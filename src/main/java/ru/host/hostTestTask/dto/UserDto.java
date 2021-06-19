package ru.host.hostTestTask.dto;


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

    public UserDto(Long userId, String lastName, String firstname, String middleName) {
    }

    public Long getUserId() {
        return this.userId;
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

    public void setUserId(Long userId) {
        this.userId = userId;
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

    protected boolean canEqual(final Object other) {
        return other instanceof UserDto;
    }

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

    public String toString() {
        return "UserDto(userId=" + this.getUserId() + ", lastName=" + this.getLastName() + ", firstname=" + this.getFirstname() + ", middleName=" + this.getMiddleName() + ")";
    }

}
