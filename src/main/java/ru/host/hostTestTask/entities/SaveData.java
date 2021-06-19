package ru.host.hostTestTask.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "datasave", schema = "archivist")
public class SaveData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "userId", nullable = false)
    private Long userId;
    @Column(name = "cardNumber", length = 30)
    private String cardNumber;
    @Column(name = "lastName", length = 30)
    private String lastName;//имя пользователя
    @Column(name = "firstName", length = 30)
    private String firstname;// фамилия
    @Column(name = "middleName", length = 30)
    private String middleName;// отчество
    @Column(name = "snils", length = 30)
    private String snils;
    @Column(name = "enp", length = 30)
    private String enp;
    @Temporal(TemporalType.DATE)
    private Date birthdate;
    @Column(name = "remdResult", length = 30)
    private String remdResult;
    @Column(name = "codeMo", length = 30)
    private String codeMo;
    @Column(name = "date_insert",nullable = false)
    private Date dateInsert;
    @Column(name = "date_update",nullable = false)
    private Date dateUpdate;

    public SaveData(Long id, Long userId, String cardNumber, String lastName, String firstname, String middleName, String snils, String enp, Date birthdate, String remdResult, String codeMo, Date dateInsert, Date dateUpdate) {
        this.id = id;
        this.userId = userId;
        this.cardNumber = cardNumber;
        this.lastName = lastName;
        this.firstname = firstname;
        this.middleName = middleName;
        this.snils = snils;
        this.enp = enp;
        this.birthdate = birthdate;
        this.remdResult = remdResult;
        this.codeMo = codeMo;
        this.dateInsert = dateInsert;
        this.dateUpdate = dateUpdate;
    }

    public SaveData() {
    }

    public Long getId() {
        return this.id;
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

    public String getFirstname() {
        return this.firstname;
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

    public Date getBirthdate() {
        return this.birthdate;
    }

    public String getRemdResult() {
        return this.remdResult;
    }

    public String getCodeMo() {
        return this.codeMo;
    }

    public Date getDateInsert() {
        return this.dateInsert;
    }

    public Date getDateUpdate() {
        return this.dateUpdate;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setRemdResult(String remdResult) {
        this.remdResult = remdResult;
    }

    public void setCodeMo(String codeMo) {
        this.codeMo = codeMo;
    }

    public void setDateInsert(Date dateInsert) {
        this.dateInsert = dateInsert;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SaveData)) return false;
        final SaveData other = (SaveData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
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
        final Object this$firstname = this.getFirstname();
        final Object other$firstname = other.getFirstname();
        if (this$firstname == null ? other$firstname != null : !this$firstname.equals(other$firstname)) return false;
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
        final Object this$birthdate = this.getBirthdate();
        final Object other$birthdate = other.getBirthdate();
        if (this$birthdate == null ? other$birthdate != null : !this$birthdate.equals(other$birthdate)) return false;
        final Object this$remdResult = this.getRemdResult();
        final Object other$remdResult = other.getRemdResult();
        if (this$remdResult == null ? other$remdResult != null : !this$remdResult.equals(other$remdResult))
            return false;
        final Object this$codeMo = this.getCodeMo();
        final Object other$codeMo = other.getCodeMo();
        if (this$codeMo == null ? other$codeMo != null : !this$codeMo.equals(other$codeMo)) return false;
        final Object this$dateInsert = this.getDateInsert();
        final Object other$dateInsert = other.getDateInsert();
        if (this$dateInsert == null ? other$dateInsert != null : !this$dateInsert.equals(other$dateInsert))
            return false;
        final Object this$dateUpdate = this.getDateUpdate();
        final Object other$dateUpdate = other.getDateUpdate();
        if (this$dateUpdate == null ? other$dateUpdate != null : !this$dateUpdate.equals(other$dateUpdate))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SaveData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $cardNumber = this.getCardNumber();
        result = result * PRIME + ($cardNumber == null ? 43 : $cardNumber.hashCode());
        final Object $lastName = this.getLastName();
        result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
        final Object $firstname = this.getFirstname();
        result = result * PRIME + ($firstname == null ? 43 : $firstname.hashCode());
        final Object $middleName = this.getMiddleName();
        result = result * PRIME + ($middleName == null ? 43 : $middleName.hashCode());
        final Object $snils = this.getSnils();
        result = result * PRIME + ($snils == null ? 43 : $snils.hashCode());
        final Object $enp = this.getEnp();
        result = result * PRIME + ($enp == null ? 43 : $enp.hashCode());
        final Object $birthdate = this.getBirthdate();
        result = result * PRIME + ($birthdate == null ? 43 : $birthdate.hashCode());
        final Object $remdResult = this.getRemdResult();
        result = result * PRIME + ($remdResult == null ? 43 : $remdResult.hashCode());
        final Object $codeMo = this.getCodeMo();
        result = result * PRIME + ($codeMo == null ? 43 : $codeMo.hashCode());
        final Object $dateInsert = this.getDateInsert();
        result = result * PRIME + ($dateInsert == null ? 43 : $dateInsert.hashCode());
        final Object $dateUpdate = this.getDateUpdate();
        result = result * PRIME + ($dateUpdate == null ? 43 : $dateUpdate.hashCode());
        return result;
    }

    public String toString() {
        return "SaveData(id=" + this.getId() + ", userId=" + this.getUserId() + ", cardNumber=" + this.getCardNumber() + ", lastName=" + this.getLastName() + ", firstname=" + this.getFirstname() + ", middleName=" + this.getMiddleName() + ", snils=" + this.getSnils() + ", enp=" + this.getEnp() + ", birthdate=" + this.getBirthdate() + ", remdResult=" + this.getRemdResult() + ", codeMo=" + this.getCodeMo() + ", dateInsert=" + this.getDateInsert() + ", dateUpdate=" + this.getDateUpdate() + ")";
    }
}
