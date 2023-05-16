package com.patientTasks.patientTasks.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDto {

    private int id;
    private String patientName;
    private String mrn;
    private String gender;
    private String dob;
    private String location;
    int age;
}
