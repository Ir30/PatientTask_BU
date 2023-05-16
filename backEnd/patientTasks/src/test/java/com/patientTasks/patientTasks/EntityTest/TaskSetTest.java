package com.patientTasks.patientTasks.EntityTest;

import com.patientTasks.patientTasks.entity.TasKSetMaping;
import com.patientTasks.patientTasks.entity.TaskSets;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TaskSetTest {
    @Test
    public void taskSetTest(){
        List<TasKSetMaping> tList=new ArrayList<>();
        TaskSets t =new TaskSets(1,"glucose",tList);

        Assertions.assertThat(1).isEqualTo(t.getId());
        Assertions.assertThat("glucose").isEqualTo(t.getName());
        Assertions.assertThat(tList).isEqualTo(t.getMappedTaskSet());
    }
}
