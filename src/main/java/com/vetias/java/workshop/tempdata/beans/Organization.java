package com.vetias.java.workshop.tempdata.beans;

import java.time.LocalDate;

public record Organization(String name,
            String completeAddress,
            String website,
            String contactNumber,
            long registerationNumber,
            LocalDate registrationdata) {

}
