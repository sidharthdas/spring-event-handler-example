package com.event.spring_event_handler.event;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

@Data
public class PatientDischargeEvent extends ApplicationEvent {

        private String patientNumber;
        private String patientName;
    public PatientDischargeEvent(Object source, String patientName, String patientNumber) {
        super(source);
        this.patientName = patientName;
        this.patientNumber = patientNumber;
    }
}
