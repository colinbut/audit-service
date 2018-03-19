/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.audit.auditservice.event;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class AddressDto {
    private String firstlineAddress;
    private String secondlineAddress;
    private String postcode;
    private String city;
    private String country;
}
