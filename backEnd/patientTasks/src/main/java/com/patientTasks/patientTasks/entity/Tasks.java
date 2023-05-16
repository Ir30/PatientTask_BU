package com.patientTasks.patientTasks.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "tasks")
public class Tasks {
    @Id
    @GeneratedValue()
    private int taskId;
    private String taskDescription;
    private String ownerName;
}
