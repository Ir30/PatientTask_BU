package com.patientTasks.patientTasks.repository;

import com.patientTasks.patientTasks.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TaskRepository extends JpaRepository<Tasks,Long> {

    @Query(value = "SELECT * FROM `tasks` WHERE `task_set_pk`=:TaskSetId",nativeQuery = true)
    public List<Tasks> findByTaskSetId(@Param("TaskSetId")Integer TaskSetId);

    @Query(value = "SELECT * FROM tasks WHERE `task_id`  IN(:TaskSetId);",nativeQuery = true)
    public List<Tasks> findAllTaskByTaskId(@Param("TaskSetId")List<Integer> TaskIdList);


}
