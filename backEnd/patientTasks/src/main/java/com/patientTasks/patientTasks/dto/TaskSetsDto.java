package com.patientTasks.patientTasks.dto;

import com.patientTasks.patientTasks.entity.TasKSetMaping;
import com.patientTasks.patientTasks.entity.TaskSets;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TaskSetsDto {
    private TaskSets taskSets;
    private List<TasKSetMaping> mappedTaskSetsList;
    private List<TaskSets> taskSetsList;
}
