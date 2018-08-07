/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.audit.auditservice.model;

import com.mycompany.audit.auditservice.event.UserEventType;
import lombok.Data;

import java.util.Date;

@Data
public class AuditRecord {

    private int id;
    private UserEventType userEventType;
    private String ssn;
    private String firstName;
    private String secondName;
    private Date dateOfBirth;
    private String email;

}
