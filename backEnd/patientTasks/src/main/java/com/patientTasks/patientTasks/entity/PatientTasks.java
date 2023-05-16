package com.patientTasks.patientTasks.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patientTasks")
public class PatientTasks {
    @Id
    @GeneratedValue
    private int id;
    private int patientId;
    private int taskId;
    private String dateTime;
}
