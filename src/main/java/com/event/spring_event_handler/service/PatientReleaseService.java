package com.event.spring_event_handler.service;

import com.event.spring_event_handler.event.PatientDischargeEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PatientReleaseService {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void releasePatient(String patientNumber, String patientName) {
        applicationEventPublisher.publishEvent(new PatientDischargeEvent(this, patientName, patientNumber));
    }
}
