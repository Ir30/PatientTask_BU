package com.patientTasks.patientTasks.EntityTest;

import com.patientTasks.patientTasks.entity.Tasks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void taskTest(){
        Tasks t=new Tasks(3,"Gloucose Tests","Raju");

        Assertions.assertThat(3).isEqualTo(t.getTaskId());
        Assertions.assertThat("Gloucose Tests").isEqualTo(t.getTaskDescription());
        Assertions.assertThat("Raju").isEqualTo(t.getOwnerName());
    }
}
