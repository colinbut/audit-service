/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.audit.auditservice.repository;

import com.mycompany.audit.auditservice.model.AuditRecord;

public interface AuditRepository {
    void saveAuditRecord(AuditRecord auditRecord);
}
