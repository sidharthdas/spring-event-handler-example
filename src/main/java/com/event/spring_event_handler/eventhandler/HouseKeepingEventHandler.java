package com.event.spring_event_handler.eventhandler;

import com.event.spring_event_handler.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class HouseKeepingEventHandler {

    @Async
    @EventListener
    public void processHouseKeepingEvent(PatientDischargeEvent patientDischargeEvent) {
        System.out.println("in House Keeping handler. Patient Name : [" + patientDischargeEvent.getPatientName()
                + "] patientNumber : [" + patientDischargeEvent.getPatientNumber() + "]. Executed by thread : [" + Thread.currentThread() + "]");

    }
}
