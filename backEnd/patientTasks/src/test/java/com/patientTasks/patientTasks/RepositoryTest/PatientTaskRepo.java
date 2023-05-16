package com.patientTasks.patientTasks.RepositoryTest;

import com.patientTasks.patientTasks.entity.PatientTasks;
import com.patientTasks.patientTasks.repository.PatientTasksRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.scheduling.config.Task;
import org.springframework.test.context.jdbc.Sql;

@DataJpaTest
@Sql({"/data.sql"})
public class PatientTaskRepo {
    @Autowired
    PatientTasksRepository patientTasksRepository;

    private PatientTasks patient;
    private Task task;

}
