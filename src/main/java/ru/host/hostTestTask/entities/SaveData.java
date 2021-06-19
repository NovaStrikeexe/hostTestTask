package ru.host.hostTestTask.entities;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "datasave", schema = "archivist")
@Data
@NoArgsConstructor
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

}
