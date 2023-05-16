package com.patientTasks.patientTasks.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "taskSetMapping")
public class TasKSetMaping {
    @Id
    @GeneratedValue
    private int id;
    private int  taskId;
}
