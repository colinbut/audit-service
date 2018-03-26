# Audit Service

### Technologies:

- Java
- Spring Boot 2.0
- MySQL
- H2 In-Memory DB
- Flyway
- Apache Tomcat
- JMS (with ActiveMQ)

### High Level Architecture

Application is built using an Event Driven Architecture (EDA) for the system which then uses 
Pipe and Filters as the Application architecture.

#### Summary:
`UserEventReciever` gets JMS messages from ActiveMQ message broker which then feeds it into
 the 'UserEventProcessor' to do the necessary processing (currently just converts the event message into audit service's 
 domain model object) before piping it into the core domain logic of the auditing functionality. 
 `AuditService` provides the service to audit log with the `AuditRepository` responsible for peristing 
the audit data `AuditRecord` (which can be in-memory in the case of using H2 or MySQL)

### Run

##### Running on Local Dev:

```bash
java -jar target/audit-service-1.0.jar --spring.profiles.active=dev
```

##### Running on Production (Like):

```bash
java -jar target/audit-service-1.0.jar --spring.profiles.active=prod
```

##### Running on QA/Staging for Test:

```bash
java -jar target/audit-service-1.0.jar --spring.profiles.active=qa
```