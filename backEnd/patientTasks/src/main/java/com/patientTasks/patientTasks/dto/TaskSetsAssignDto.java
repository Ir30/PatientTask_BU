package com.patientTasks.patientTasks.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TaskSetsAssignDto {
    private int taskSetsId;
    private int patientId;
    private String dateTime;
}
