package com.event.spring_event_handler.eventhandler;

import com.event.spring_event_handler.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class BillingEventHandler {

    @Async
    @EventListener
    public void processBillingEvent(PatientDischargeEvent patientDischargeEvent) {
        System.out.println("in Patient Billing Event handler. Patient Name : [" + patientDischargeEvent.getPatientName()
                + "] patientNumber : [" + patientDischargeEvent.getPatientNumber() + "]. Executed by thread : [" + Thread.currentThread() + "]");

    }
}
