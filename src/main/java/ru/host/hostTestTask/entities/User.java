package ru.host.hostTestTask.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "USER", schema = "archivist")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Column(name = "Last_Name", length = 30, nullable = true)
    private String lastName;//имя пользователя

    @Column(name = "First_Name", length = 30, nullable = true)
    private String firstname;// фамилия

    @Column(name = "Middle_Name", length = 30, nullable = true)
    private String middleName;// отчество
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "Snils", length = 30, nullable = true)
    private String snils;

    @Temporal(TemporalType.DATE)
    private Date birthdate;

}

