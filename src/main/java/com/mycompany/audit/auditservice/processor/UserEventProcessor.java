/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.audit.auditservice.processor;

import com.mycompany.audit.auditservice.event.UserDto;
import com.mycompany.audit.auditservice.event.UserEvent;
import com.mycompany.audit.auditservice.model.AuditRecord;
import com.mycompany.audit.auditservice.service.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserEventProcessor {

    @Autowired
    private AuditService auditService;

    public void process(UserEvent userEvent) {

        AuditRecord auditRecord = new AuditRecord();
        auditRecord.setUserEventType(userEvent.getUserEventType());

        UserDto userDto = userEvent.getUserDto();
        auditRecord.setFirstName(userDto.getFirstname());
        auditRecord.setSecondName(userDto.getSecondname());
        auditRecord.setSsn(userDto.getSsn());
        auditRecord.setDateOfBirth(userDto.getDob());

        auditService.logAudit(auditRecord);
    }
}
