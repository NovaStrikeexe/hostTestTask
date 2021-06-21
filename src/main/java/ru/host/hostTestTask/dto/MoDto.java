package ru.host.hostTestTask.dto;

/**
 *
 */
public class MoDto {
    /**
     *
     */
    private String shortName;
    /**
     *
     */
    private String codeMo;
    /**
     *
     */
    private Boolean isShown;

    /**
     *
     */
    public MoDto() {
    }

    /**
     * @param shortName
     * @param codeMo
     * @param isShown
     */
    public MoDto(String shortName, String codeMo, Boolean isShown) {
        this.shortName = shortName;
        this.codeMo = codeMo;
        this.isShown = isShown;
    }

    /**
     * @return
     */
    public String getShortName() {
        return this.shortName;
    }

    /**
     * @return
     */
    public String getCodeMo() {
        return this.codeMo;
    }

    /**
     * @return
     */
    public Boolean getIsShown() {
        return this.isShown;
    }

    /**
     * @param shortName
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * @param codeMo
     */
    public void setCodeMo(String codeMo) {
        this.codeMo = codeMo;
    }

    /**
     * @param isShown
     */
    public void setIsShown(Boolean isShown) {
        this.isShown = isShown;
    }

    /**
     * @param o
     * @return
     */
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MoDto)) return false;
        final MoDto other = (MoDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$shortName = this.getShortName();
        final Object other$shortName = other.getShortName();
        if (this$shortName == null ? other$shortName != null : !this$shortName.equals(other$shortName)) return false;
        final Object this$codeMo = this.getCodeMo();
        final Object other$codeMo = other.getCodeMo();
        if (this$codeMo == null ? other$codeMo != null : !this$codeMo.equals(other$codeMo)) return false;
        final Object this$isShown = this.getIsShown();
        final Object other$isShown = other.getIsShown();
        if (this$isShown == null ? other$isShown != null : !this$isShown.equals(other$isShown)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MoDto;
    }

    /**
     * @return
     */
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $shortName = this.getShortName();
        result = result * PRIME + ($shortName == null ? 43 : $shortName.hashCode());
        final Object $codeMo = this.getCodeMo();
        result = result * PRIME + ($codeMo == null ? 43 : $codeMo.hashCode());
        final Object $isShown = this.getIsShown();
        result = result * PRIME + ($isShown == null ? 43 : $isShown.hashCode());
        return result;
    }

    /**
     * @return
     */
    public String toString() {
        return "MoDto(shortName=" + this.getShortName() + ", codeMo=" + this.getCodeMo() + ", isShown=" + this.getIsShown() + ")";
    }
}
