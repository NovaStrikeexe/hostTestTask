package ru.host.hostTestTask.entities;


import javax.persistence.*;

import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "ref_mo", schema = "archivist")
@Data
public class SaveData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "id", nullable = false)
    private Long userId;
    @Column(name = "cardNumber", length = 30)
    private String cardNumber;
    @Column(name = "Last_Name", length = 30)
    private String lastName;//имя пользователя
    @Column(name = "First_Name", length = 30)
    private String firstname;// фамилия
    @Column(name = "Middle_Name", length = 30)
    private String middleName;// отчество
    @Temporal(TemporalType.DATE)
    private LocalDate birthdate;
    @Column(name = "remdResult", length = 30)
    private String remdResult;
    @Column(name = "codeMo", length = 30)
    private String codeMo;

}
