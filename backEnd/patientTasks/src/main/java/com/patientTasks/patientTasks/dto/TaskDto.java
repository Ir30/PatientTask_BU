package com.patientTasks.patientTasks.dto;

import com.patientTasks.patientTasks.entity.Tasks;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto {
    private List<Tasks> tasksList;
}
