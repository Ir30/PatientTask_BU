package com.patientTasks.patientTasks.RepositoryTest;

import com.patientTasks.patientTasks.entity.Patient;
import com.patientTasks.patientTasks.repository.PatientRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PatientRepoTest {
    @Autowired
    PatientRepository patientRepository;
    @Test
    public void patientRpo(){
        Patient p =new Patient(1,"melvin","1212","male","10/05/1999","kochi",25);
        patientRepository.save(p);
        Patient found = patientRepository.findById(p.getId());
        Assertions.assertThat(found.getPatientName()).isEqualTo(p.getPatientName());
        Assertions.assertThat(found.getAge()).isEqualTo(p.getAge());
    }

}
