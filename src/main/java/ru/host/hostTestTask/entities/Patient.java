package ru.host.hostTestTask.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PATIENT", schema = "archivist")
@Data
public class Patient {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    @Column(name = "Last_Name", length = 30, nullable = true)
    private String lastName;

    @Column(name = "First_Name", length = 30, nullable = true)
    private String firstName;

    @Column(name = "Middle_Name", length = 30, nullable = true)
    private String middleName;

    @Column(name = "Snils", length = 20, nullable = true)
    private String snils;

    @Column(name = "Enp", length = 20, nullable = true)
    private String enp;

    @Temporal(TemporalType.DATE)
    private Date birthDate;


}
