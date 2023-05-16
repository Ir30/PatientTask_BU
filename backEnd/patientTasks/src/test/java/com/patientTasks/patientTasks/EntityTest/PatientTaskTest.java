package com.patientTasks.patientTasks.EntityTest;

import com.patientTasks.patientTasks.entity.PatientTasks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PatientTaskTest {

    @Test
    public void patientTaskTest(){
        PatientTasks t = new PatientTasks(1,5,3,"10/08/2022");

        Assertions.assertThat(1).isEqualTo(t.getId());
        Assertions.assertThat(5).isEqualTo(t.getPatientId());
        Assertions.assertThat(3).isEqualTo(t.getTaskId());
        Assertions.assertThat("10/08/2022").isEqualTo(t.getDateTime());
    }
}
