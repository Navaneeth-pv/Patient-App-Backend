package com.example.Patientbackend.controller;

import com.example.Patientbackend.dao.PatientDao;
import com.example.Patientbackend.model.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private PatientDao dao;

    @CrossOrigin(origins = "*")

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddPatient(@RequestBody Patients p){
        System.out.println(p.getPatientName().toString());
        System.out.println(p.getPatientId().toString());
        System.out.println(p.getAddress().toString());
        System.out.println(p.getContactNo().toString());
        System.out.println(p.getDoctorName().toString());

        dao.save(p);
        return "Patient added successfully";
    }

    @CrossOrigin(origins = "*")


    @GetMapping("/view")
    public List<Patients> ViewAllPatient(){
        return (List<Patients>) dao.findAll();
    }
}
