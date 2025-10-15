package com.maulihealthcare.service;

import com.maulihealthcare.dto.DoctorDTO;

import java.util.List;

public interface DoctorService {
    DoctorDTO createDoctor(DoctorDTO doctorDTO);
    List<DoctorDTO> getAllDoctors();
    DoctorDTO getDoctorById(Long id);
    DoctorDTO updateDoctor(Long id, DoctorDTO doctorDTO);
    boolean deleteDoctor(Long id);
    DoctorDTO getDoctorByEmail(String email);
}
