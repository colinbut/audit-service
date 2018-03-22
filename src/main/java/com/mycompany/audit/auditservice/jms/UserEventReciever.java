/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.audit.auditservice.jms;

import com.mycompany.audit.auditservice.event.UserEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserEventReciever {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private UserEventProcessor userEventProcessor;

    @JmsListener(destination = "test-queue")
    public void onMessage(UserEvent userEvent) {
        log.info("Received %s ", userEvent);

        userEventProcessor.process(userEvent);
    }

}
