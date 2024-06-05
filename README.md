# Spring Boot Event Handler Example

## Limitation of using legacy style

```

public class DischargeService {
    public void discharge(String patientld, String patientName) {
        billingService.finalizeBills(patientld);
        recordService.updateMedicalRecords(patientld); 
        notificationService.notify(patientld); 
        houseKeepingService.cleanUp(patientld);
    }
}

Limitation of above design : 

Tight Coupling
Difficult to Extend
Testing and Maintenance
Lack of Asynchronous Processing

```

## Steps to create:

1. Create events extends with ApplicationEvent
2. Create respective handler and add void method and annotate with @EventListener
3. In service layer, autowired ``` ApplicationEventPublisher applicationEventPublisher; ```
4. Then publish the event using ``` applicationEventPublisher.publishEvent(new PatientDischargeEvent(this, patientName, patientNumber)); ```

Note : By default, ``` applicationEventPublisher.publishEvent(new PatientDischargeEvent(this, patientName, patientNumber)); ```
is synchronised in spring boot, to make it async, add @Async in all the event handler's method and @EnableAsync in SpringApplication class
