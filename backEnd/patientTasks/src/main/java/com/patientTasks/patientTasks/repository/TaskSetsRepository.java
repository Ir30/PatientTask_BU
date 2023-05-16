package com.patientTasks.patientTasks.repository;

import com.patientTasks.patientTasks.entity.TaskSets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskSetsRepository extends JpaRepository<TaskSets,Integer> {
}
