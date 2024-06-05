package com.event.spring_event_handler.eventhandler;

import com.event.spring_event_handler.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class PatientDischargeEventHandler {

    @Async
    @EventListener
    public void processPatientDischargeEvent(PatientDischargeEvent patientDischargeEvent) {
        System.out.println("in Patient Discharge handler. Patient Name : [" + patientDischargeEvent.getPatientName()
        + "] patientNumber : [" + patientDischargeEvent.getPatientNumber() + "]. Executed by thread : [" + Thread.currentThread() + "]");

    }
}
