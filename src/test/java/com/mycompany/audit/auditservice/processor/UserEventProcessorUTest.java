/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.audit.auditservice.processor;

import com.mycompany.audit.auditservice.event.UserEvent;
import com.mycompany.audit.auditservice.model.AuditRecord;
import com.mycompany.audit.auditservice.service.AuditService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserEventProcessorUTest {

    @Mock
    private AuditService auditService;

    @InjectMocks
    private UserEventProcessor classInTest = new UserEventProcessor();

    @Test
    public void givenUserEvent_whenProcess_thenLogToAudit(){
        UserEvent userEvent = new UserEvent();

        Mockito.doNothing().when(auditService).logAudit(Matchers.any(AuditRecord.class));

        classInTest.process(userEvent);

        Mockito.verify(auditService, Mockito.times(1)).logAudit(Matchers.any(AuditRecord.class));
    }
}