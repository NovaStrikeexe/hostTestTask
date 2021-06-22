package ru.host.hostTestTask.entities;

import javax.persistence.*;

/**
 * Класс сущности MO(Медициская Организация) отвечающий за работу с базой с таблицей: ref_mo, в схеме archivist
 */
@Entity
@Table(name = "ref_mo", schema = "archivist")
public class Mo {
    @Column(name = "oid")
    private String oid;
    @Column(name = "version")
    private String version;
    @Column(name = "namefull")
    private String namefull;
    @Column(name = "nameshort")
    private String nameshort;
    @Id
    @Column(name = "guid", nullable = false)
    private Long guid;
    @Column(name = "is_shown")
    private Boolean isShown;

    public Mo() { }

    public String getOid() {
        return this.oid;
    }

    public String getVersion() {
        return this.version;
    }

    public String getNamefull() {
        return this.namefull;
    }

    public String getNameshort() {
        return this.nameshort;
    }

    public Long getGuid() {
        return this.guid;
    }

    public Boolean getIsShown() {
        return this.isShown;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setNamefull(String namefull) {
        this.namefull = namefull;
    }

    public void setNameshort(String nameshort) {
        this.nameshort = nameshort;
    }

    public void setGuid(Long guid) {
        this.guid = guid;
    }

    public void setIsShown(Boolean isShown) {
        this.isShown = isShown;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Mo)) return false;
        final Mo other = (Mo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$oid = this.getOid();
        final Object other$oid = other.getOid();
        if (this$oid == null ? other$oid != null : !this$oid.equals(other$oid)) return false;
        final Object this$version = this.getVersion();
        final Object other$version = other.getVersion();
        if (this$version == null ? other$version != null : !this$version.equals(other$version)) return false;
        final Object this$namefull = this.getNamefull();
        final Object other$namefull = other.getNamefull();
        if (this$namefull == null ? other$namefull != null : !this$namefull.equals(other$namefull)) return false;
        final Object this$nameshort = this.getNameshort();
        final Object other$nameshort = other.getNameshort();
        if (this$nameshort == null ? other$nameshort != null : !this$nameshort.equals(other$nameshort)) return false;
        final Object this$guid = this.getGuid();
        final Object other$guid = other.getGuid();
        if (this$guid == null ? other$guid != null : !this$guid.equals(other$guid)) return false;
        final Object this$isShown = this.getIsShown();
        final Object other$isShown = other.getIsShown();
        if (this$isShown == null ? other$isShown != null : !this$isShown.equals(other$isShown)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Mo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $oid = this.getOid();
        result = result * PRIME + ($oid == null ? 43 : $oid.hashCode());
        final Object $version = this.getVersion();
        result = result * PRIME + ($version == null ? 43 : $version.hashCode());
        final Object $namefull = this.getNamefull();
        result = result * PRIME + ($namefull == null ? 43 : $namefull.hashCode());
        final Object $nameshort = this.getNameshort();
        result = result * PRIME + ($nameshort == null ? 43 : $nameshort.hashCode());
        final Object $guid = this.getGuid();
        result = result * PRIME + ($guid == null ? 43 : $guid.hashCode());
        final Object $isShown = this.getIsShown();
        result = result * PRIME + ($isShown == null ? 43 : $isShown.hashCode());
        return result;
    }

    public String toString() {
        return "Mo(oid=" + this.getOid() + ", version=" + this.getVersion() + ", namefull=" + this.getNamefull() + ", nameshort=" + this.getNameshort() + ", guid=" + this.getGuid() + ", isShown=" + this.getIsShown() + ")";
    }
}
