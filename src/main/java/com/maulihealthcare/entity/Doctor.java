package com.maulihealthcare.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "doctors")
@Data
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String specialization;

    @Column(unique = true)
    private String phone;

    @Column(nullable = false)
    private String password;

    private String availableDays;
    private String role = "DOCTOR";
    private String gender;
    private String department;

}
