/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.audit.auditservice.jms;

import com.mycompany.audit.auditservice.event.UserEvent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.jms.core.JmsTemplate;

@RunWith(MockitoJUnitRunner.class)
public class UserEventRecieverUTest {

    @Mock
    private JmsTemplate jmsTemplate;

    @Mock
    private UserEventProcessor userEventProcessor;

    @InjectMocks
    private UserEventReciever classUnderTest = new UserEventReciever();

    @Test
    public void testOnMessage(){

        UserEvent userEvent = new UserEvent();

        Mockito.doNothing().when(userEventProcessor).process(userEvent);

        classUnderTest.onMessage(userEvent);

        Mockito.verify(userEventProcessor, Mockito.times(1)).process(userEvent);
    }

}