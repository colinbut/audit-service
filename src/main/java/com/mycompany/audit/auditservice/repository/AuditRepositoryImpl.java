/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.audit.auditservice.repository;

import com.mycompany.audit.auditservice.model.AuditRecord;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
@Slf4j
public class AuditRepositoryImpl implements AuditRepository{

    private Map<Integer, AuditRecord> auditRecordMap = new LinkedHashMap<>();

    @Override
    public void saveAuditRecord(AuditRecord auditRecord) {
        auditRecordMap.put(auditRecord.getId(), auditRecord);

        auditRecordMap.values().forEach(auditRecord1 -> log.info("Record:%s - %s", auditRecord1.getId(), auditRecord1));
    }
}
