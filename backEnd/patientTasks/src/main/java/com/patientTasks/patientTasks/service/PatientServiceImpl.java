package com.patientTasks.patientTasks.service;

import com.patientTasks.patientTasks.dto.TaskPatientCompainDto;
import com.patientTasks.patientTasks.dto.TaskSetsAssignDto;
import com.patientTasks.patientTasks.entity.Patient;
import com.patientTasks.patientTasks.entity.PatientTasks;
import com.patientTasks.patientTasks.entity.Tasks;
import com.patientTasks.patientTasks.repository.PatientRepository;
import com.patientTasks.patientTasks.repository.PatientTasksRepository;
import com.patientTasks.patientTasks.repository.TaskRepository;
import com.patientTasks.patientTasks.repository.TaskSetMappingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    private PatientTasksRepository patientTasksRepository;

    @Override
    public List<TaskPatientCompainDto> viewPatientTaskById(int id) {
        return patientTasksRepository.viewTaskByPatientId(id);
    }


    @Autowired
    private PatientRepository patientRepository;
    @Override
    public Patient findPatientById(int id)
    {
        return patientRepository.findById(id);
    }


}
