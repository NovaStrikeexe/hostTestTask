package ru.host.hostTestTask.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Patient")
public class Patient {
    @Id
    private Long id;

}
