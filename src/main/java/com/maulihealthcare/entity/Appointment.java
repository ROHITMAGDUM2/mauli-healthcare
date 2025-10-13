package com.maulihealthcare.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "appointments")
@Data
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctore;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;


    private LocalDate date;
    private LocalTime time;
    private String status= "SCHEDULED"; // SCHEDULED, COMPLETED, CANCELLED
    private String appointmentType; // ONLINE, OFFLINE
    private String reason;
}
