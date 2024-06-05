package com.event.spring_event_handler.event;

import org.springframework.context.ApplicationEvent;


public class PatientDischargeEvent extends ApplicationEvent {

        private String patientNumber;
        private String patientName;
    public PatientDischargeEvent(Object source, String patientName, String patientNumber) {
        super(source);
        this.patientName = patientName;
        this.patientNumber = patientNumber;
    }

    public String getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}
