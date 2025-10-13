package com.maulihealthcare.entity;

import org.springframework.boot.autoconfigure.security.saml2.Saml2RelyingPartyAutoConfiguration;

public class Patient {
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String address;

    private String password;

    private String role ="PATIENT";
    private Integer age;
    private String gender;
    private String bloodgroup;

}
