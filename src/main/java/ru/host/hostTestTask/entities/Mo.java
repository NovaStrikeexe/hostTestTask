package ru.host.hostTestTask.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@NamedQuery(name = "ref_mo.findByIsShownTrue",query = "select m from ref_mo m where m.is_shown = TRUE ")
@Table(name = "ref_mo", schema = "archivist")
@Data
@NoArgsConstructor
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

}
