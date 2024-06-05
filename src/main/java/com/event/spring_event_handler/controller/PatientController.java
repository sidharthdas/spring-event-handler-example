package com.event.spring_event_handler.controller;

import com.event.spring_event_handler.dto.Patient;
import com.event.spring_event_handler.service.PatientReleaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/patient/")
public class PatientController {

    @Autowired
    private PatientReleaseService patientReleaseService;

    @PostMapping("discharge")
    public void startPatientDischarge(@RequestBody Patient patient) {
        System.out.println("Patient Discharge started");
        patientReleaseService.releasePatient(patient.getPatientNumber(), patient.getPatientName());
        System.out.println("Patient Discharge ender");
    }
}
