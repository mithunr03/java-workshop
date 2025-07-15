package com.vetias.java.workshop.tempdata.beans;

import java.time.LocalDate;

public record Organization(String name,
            String completeAddress,
            String email,
            String website,
            String contactNumber,
            String description,
            long registerationNumber,

            LocalDate registrationdata) {

}
