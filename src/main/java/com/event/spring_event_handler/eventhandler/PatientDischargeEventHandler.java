package com.event.spring_event_handler.eventhandler;

import com.event.spring_event_handler.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class PatientDischargeEventHandler {

    @EventListener
    public void processEvent(PatientDischargeEvent patientDischargeEvent) {
        System.out.println("in Patient Discharge event");

    }
}
