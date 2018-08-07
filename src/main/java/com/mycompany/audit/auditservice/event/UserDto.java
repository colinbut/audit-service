/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.audit.auditservice.event;

import lombok.Data;

import java.util.Date;

/**
 * Holds the same info as UserDto from UserService
 *
 * DDD (Domain Driven Design) entails:
 *
 * So due to bounded countext the UserDto is duplicated across service
 * as this particular UserDto here represents the context within Audit domain context.
 */
@Data
public class UserDto {
    private String ssn;
    private String firstname;
    private String secondname;
    private Date dob;
    private String email;
    private AddressDto address;
}
