package com.maulihealthcare.repository;

import com.maulihealthcare.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Optional<Doctor> findByEmail(String email);
    Optional<Doctor> findByPhone(String phone);
    boolean existsByEmail(String email);
}
