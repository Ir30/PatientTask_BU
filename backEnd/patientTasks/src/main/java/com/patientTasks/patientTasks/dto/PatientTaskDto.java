package com.patientTasks.patientTasks.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientTaskDto {
    private int id;
    private int patientId;
    private int taskId;
    private String dateTime;
}
