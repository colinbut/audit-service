/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.audit.auditservice.service;

import com.mycompany.audit.auditservice.model.AuditRecord;
import com.mycompany.audit.auditservice.repository.AuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuditServiceImpl implements AuditService {

    @Autowired
    private AuditRepository auditRepository;

    @Override
    public void logAudit(AuditRecord auditRecord) {
        auditRepository.saveAuditRecord(auditRecord);
    }
}
