package com.example.Patientbackend.dao;

import com.example.Patientbackend.model.Patients;
import org.springframework.data.repository.CrudRepository;

public interface PatientDao extends CrudRepository<Patients,Integer> {
}
