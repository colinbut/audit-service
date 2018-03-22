/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.audit.auditservice.service;

import com.mycompany.audit.auditservice.model.AuditRecord;

public interface AuditService {
    void logAudit(AuditRecord auditRecord);
}
