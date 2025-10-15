package com.maulihealthcare.service;

import com.maulihealthcare.dto.DoctorDTO;
import com.maulihealthcare.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DoctorServiceImpl implements DoctorService{

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public DoctorDTO createDoctor(DoctorDTO doctorDTO){
        return doctorDTO;
    }
}
