package com.patientTasks.patientTasks.service;

import com.patientTasks.patientTasks.dto.TaskPatientCompainDto;
import com.patientTasks.patientTasks.dto.TaskSetsAssignDto;
import com.patientTasks.patientTasks.entity.Patient;
import com.patientTasks.patientTasks.entity.PatientTasks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PatientService {

    public List<TaskPatientCompainDto> viewPatientTaskById(int id);


    public Patient findPatientById(int id);
}
