package com.event.spring_event_handler.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PatientReleaseService {

    private ApplicationEventPublisher applicationEventPublisher;

    public void releasePatient(String patientNumber, LocalDateTime localDateTime) {



    }
}
