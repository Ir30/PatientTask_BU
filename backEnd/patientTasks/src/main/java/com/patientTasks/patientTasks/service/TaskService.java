package com.patientTasks.patientTasks.service;

import com.patientTasks.patientTasks.dto.ResponseDto;
import com.patientTasks.patientTasks.dto.TaskSetsAssignDto;
import com.patientTasks.patientTasks.entity.PatientTasks;
import com.patientTasks.patientTasks.entity.TaskSets;
import com.patientTasks.patientTasks.entity.Tasks;

import java.util.List;
import java.util.Map;

public interface TaskService {
    public List<Tasks> viewAllTasks();
    public TaskSets saveTaskSets(TaskSets taskSets);

    public List<TaskSets> ViewAllTaskSets();
    public ResponseDto assignTasks(PatientTasks patientTasks);

    public ResponseDto assignTaskSets(TaskSetsAssignDto taskSetsAssignDto);
    
}
