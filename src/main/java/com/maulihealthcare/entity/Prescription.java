package com.maulihealthcare.entity;

import java.time.LocalDate;

public class Prescription {
    private Long id;
    private Appointment appointment;
    private String diagnosis;
    private String medicines;
    private String dosege;
    private String notes;
    private LocalDate followUpDate;

}
