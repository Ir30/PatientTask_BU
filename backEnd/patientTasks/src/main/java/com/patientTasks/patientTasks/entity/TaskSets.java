package com.patientTasks.patientTasks.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "TaskSets")
public class TaskSets {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToMany(targetEntity = TasKSetMaping.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "taskSet_fk",referencedColumnName = "id")
    private List<TasKSetMaping> mappedTaskSet;
}
