/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.audit.auditservice.service;

import com.mycompany.audit.auditservice.model.AuditRecord;
import com.mycompany.audit.auditservice.repository.AuditRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AuditServiceImplUTest {

    @Mock
    private AuditRepository auditRepository;

    @InjectMocks
    private AuditServiceImpl classUnderTest = new AuditServiceImpl();

    @Test
    public void testAuditLog(){
        AuditRecord auditRecord = new AuditRecord();

        Mockito.doNothing().when(auditRepository).saveAuditRecord(auditRecord);

        classUnderTest.logAudit(auditRecord);

        Mockito.verify(auditRepository, Mockito.times(1)).saveAuditRecord(auditRecord);
    }

}