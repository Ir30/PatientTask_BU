package com.patientTasks.patientTasks.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor

public interface TaskPatientCompainDto {
    public String getTaskDescription();
    public String getOwnerName();
    public  String getDateTime();

}
