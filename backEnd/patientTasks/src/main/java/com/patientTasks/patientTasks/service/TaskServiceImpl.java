package com.patientTasks.patientTasks.service;

import com.patientTasks.patientTasks.dto.ResponseDto;
import com.patientTasks.patientTasks.dto.TaskSetsAssignDto;
import com.patientTasks.patientTasks.entity.PatientTasks;
import com.patientTasks.patientTasks.entity.TaskSets;
import com.patientTasks.patientTasks.repository.PatientTasksRepository;
import com.patientTasks.patientTasks.repository.TaskRepository;
import com.patientTasks.patientTasks.entity.Tasks;
import com.patientTasks.patientTasks.repository.TaskSetMappingRepository;
import com.patientTasks.patientTasks.repository.TaskSetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    PatientTasksRepository patientTasksRepository;
    @Override
    public List<Tasks> viewAllTasks() {
        return taskRepository.findAll();
    }

    @Autowired
    private TaskSetsRepository taskSetsRepository;

    @Override
    public TaskSets saveTaskSets(TaskSets taskSets) {

        return taskSetsRepository.save(taskSets);
    }

    @Override
    public List<TaskSets> ViewAllTaskSets() {
        return taskSetsRepository.findAll();
    }

    //Single task assigning------------------------
    @Override
    public ResponseDto assignTasks(PatientTasks patientTasks) {
        List<Integer> taskIdList=patientTasksRepository.getTaskIdList(patientTasks.getPatientId());
        ResponseDto response = new ResponseDto();
        response.setStatus("Task added succesfully");
        if(!(taskIdList.contains(patientTasks.getTaskId()))){
            patientTasksRepository.save(patientTasks);
        }else {
            response.setStatus("Dupliacte Entry");
        }
        return response;
    }

    //Single task assigning------------------------

    //Task Sets assigning-------------------------

    @Autowired
    private TaskSetMappingRepository taskSetMappingRepository;

    @Override
    public ResponseDto assignTaskSets(TaskSetsAssignDto taskSetsAssignDto) {
        List<Integer> taskIDList = taskSetMappingRepository.findByTaskSetId(taskSetsAssignDto.getTaskSetsId());
        System.out.println(taskIDList);
        List<Tasks> taskList = taskRepository.findAllTaskByTaskId(taskIDList);
        int dupe=0;
        int nDupe=0;

        for(Tasks tasks:taskList){
            List<Integer> taskIdList=patientTasksRepository.getTaskIdList(taskSetsAssignDto.getPatientId());
            if((taskIdList.contains(tasks.getTaskId()))){
                dupe++;
                continue;
            }else {
                PatientTasks patientTasks=new PatientTasks();
                patientTasks.setPatientId(taskSetsAssignDto.getPatientId());
                patientTasks.setDateTime(taskSetsAssignDto.getDateTime());
                patientTasks.setTaskId(tasks.getTaskId());
                patientTasksRepository.save(patientTasks);
                nDupe++;
            }
        }
        ResponseDto response=new ResponseDto();
        response.setStatus(String.valueOf(nDupe)+" Tasks added successfully, "+String.valueOf(dupe)+" duplicte found");
        return response;
    }

    //Task Sets assigning-------------------------



}
