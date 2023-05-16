package com.patientTasks.patientTasks.controller;

import com.patientTasks.patientTasks.dto.PatientDto;
import com.patientTasks.patientTasks.entity.Patient;
import com.patientTasks.patientTasks.service.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
@CrossOrigin("*")
public class PatientController {

    @Autowired
    private PatientServiceImpl patientServiceImpl;
    @GetMapping(path = "/findPatientById/{id}",produces = "application/json")
    public PatientDto findPatientById(@PathVariable int id){
        Patient patient= patientServiceImpl.findPatientById(id);
        return new PatientDto(patient.getId(),patient.getPatientName(),patient.getMrn(),patient.getGender(),patient.getDob(),patient.getLocation(),patient.getAge());
    }
}
