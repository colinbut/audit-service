/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.audit.auditservice.event;

import lombok.Data;

@Data
public class UserEvent {
    private UserEventType userEventType;
    private UserDto userDto;
}
