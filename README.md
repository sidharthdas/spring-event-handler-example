# Spring Boot Event Handler Example

## Limitation of using legacy style

'''

public class DischargeService {
public void discharge(String patientld, String patientName) {
billingService.finalizeBills(patientld);
recordService.updateMedicalRecords(patientld); notificationService.notify(patientld); houseKeepingService.cleanUp(patientld);
Tight Coupling
Difficult to Extend
Testing and Maintenance
Lack of Asynchronous Processing

'''
