package com.patientTasks.patientTasks.repository;

import com.patientTasks.patientTasks.entity.TasKSetMaping;
import com.patientTasks.patientTasks.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskSetMappingRepository extends JpaRepository<TasKSetMaping,Integer> {
//    List<Integer> GetTaskIdByTaskSetId(@Param("id")int id);

    @Query(value = "SELECT task_id FROM `task_set_mapping` WHERE `task_set_fk`=:TaskSetId",nativeQuery = true)
    public List<Integer> findByTaskSetId(@Param("TaskSetId")Integer TaskSetId);
}
