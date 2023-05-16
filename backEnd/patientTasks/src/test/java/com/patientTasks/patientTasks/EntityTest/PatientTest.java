package com.patientTasks.patientTasks.EntityTest;

import com.patientTasks.patientTasks.entity.Patient;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PatientTest {
    @Test
    public void patientTest(){
        Patient patient=new Patient();
        patient.setPatientName("Raju");
        patient.setId(1);
        patient.setAge(22);
        patient.setDob("10/08/2022");
        patient.setMrn("252525");
        patient.setLocation("kochi");
        patient.setGender("male");

        Assertions.assertThat(1).isEqualTo(patient.getId());
        Assertions.assertThat("Raju").isEqualTo(patient.getPatientName());
        Assertions.assertThat("10/08/2022").isEqualTo(patient.getDob());
        Assertions.assertThat("252525").isEqualTo(patient.getMrn());
        Assertions.assertThat("male").isEqualTo(patient.getGender());
        Assertions.assertThat(22).isEqualTo(patient.getAge());
        Assertions.assertThat("kochi").isEqualTo(patient.getLocation());

    }

}
