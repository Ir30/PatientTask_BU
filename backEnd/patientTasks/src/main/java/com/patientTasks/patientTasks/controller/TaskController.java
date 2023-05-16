package com.patientTasks.patientTasks.controller;

import com.patientTasks.patientTasks.dto.*;
import com.patientTasks.patientTasks.entity.PatientTasks;
import com.patientTasks.patientTasks.entity.TasKSetMaping;
import com.patientTasks.patientTasks.entity.TaskSets;
import com.patientTasks.patientTasks.entity.Tasks;
import com.patientTasks.patientTasks.service.PatientServiceImpl;
import com.patientTasks.patientTasks.service.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tasks")
@CrossOrigin("*")
public class TaskController {


    @Autowired
    private TaskServiceImpl taskServiceImpl;
    @Autowired
    private PatientServiceImpl patientServiceImpl;

//REST endpoint for viewing all tasks------------------

    @GetMapping("/viewAllTasks")
    public TaskDto viewAllTasks()
    {
        List<Tasks> tasksList = taskServiceImpl.viewAllTasks();
        return new TaskDto(tasksList);
    }



    @PostMapping(path = "/saveTaskSets",consumes = "application/json",produces = "application/json")
    public TaskSets saveTaskSets(@RequestBody TaskSetsDto taskSetsDto)
    {
        return taskServiceImpl.saveTaskSets(taskSetsDto.getTaskSets());
    }

    //REST endpoint for view all task sets-------------------------
    @GetMapping("/ViewAllTaskSets")
    public TaskSetsDto ViewAllTaskSets(){
        List<TaskSets> taskSets= taskServiceImpl.ViewAllTaskSets();
        TaskSetsDto taskSetsDto=new TaskSetsDto();
        taskSetsDto.setTaskSetsList(taskSets);
        return taskSetsDto;
    }


    //REST endpoint for getting patient tasks by patient id-----------------
    @GetMapping(path = "/getPatientTaskById/{id}",produces = "application/json")
    public List<TaskPatientCompainDto> getPatientTaskById(@PathVariable int id){
        return patientServiceImpl.viewPatientTaskById(id);
    }

    //REST endpoint for assigining task to a patient--------------------
    @PostMapping(path = "assignTask",produces = "application/json",consumes = "application/json")
    public ResponseDto assignTask(@RequestBody PatientTaskDto patientTaskDto){
        PatientTasks patientTasks=new PatientTasks(patientTaskDto.getId(),patientTaskDto.getPatientId(),patientTaskDto.getTaskId(),patientTaskDto.getDateTime());
        return taskServiceImpl.assignTasks(patientTasks);
    }

    
    //REST endpoint for assigning a set of tasks to a patient----------------
    @PostMapping(path = "assignTaskSets",produces = "application/json",consumes = "application/json")
    public ResponseDto assignTaskSets(@RequestBody TaskSetsAssignDto taskSetsAssignDto){
        return taskServiceImpl.assignTaskSets(taskSetsAssignDto);
    }
}
