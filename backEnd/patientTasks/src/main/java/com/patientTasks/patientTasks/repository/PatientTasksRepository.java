package com.patientTasks.patientTasks.repository;

import com.patientTasks.patientTasks.dto.TaskPatientCompainDto;
import com.patientTasks.patientTasks.entity.PatientTasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public interface PatientTasksRepository extends JpaRepository<PatientTasks,Integer> {

    @Query(value = "SELECT t.task_description as taskDescription,t.owner_name as ownerName,p.date_time as dateTime" +
            " FROM tasks t JOIN patient_tasks p on t.task_id=p.task_id  WHERE p.patient_id=:id",nativeQuery = true)
    public List<TaskPatientCompainDto> viewTaskByPatientId(@Param("id")Integer id);

    @Query(value = "SELECT `task_id` FROM `patient_tasks` WHERE `patient_id` =:taskId",nativeQuery = true)
    public List<Integer> getTaskIdList(@Param("taskId")int id);
}
