package com.patientTasks.patientTasks.EntityTest;

import com.patientTasks.patientTasks.entity.TasKSetMaping;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskSetMappingTest {

    @Test
    public void mappingTest(){
        TasKSetMaping t = new TasKSetMaping(1,5);

        Assertions.assertThat(1).isEqualTo(t.getId());
        Assertions.assertThat(5).isEqualTo(t.getTaskId());

    }
}
