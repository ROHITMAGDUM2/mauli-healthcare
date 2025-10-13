package com.maulihealthcare.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name  = "patients")
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true)
    private String phone;

    private String address;

    @Column(nullable = false)
    private String password;

    private String role ="PATIENT";
    private Integer age;
    private String gender;
    private String bloodgroup;

}
