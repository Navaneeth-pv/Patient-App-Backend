package com.example.Patientbackend.controller;

import com.example.Patientbackend.model.Patients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddPatient(@RequestBody Patients p){
        System.out.println(p.getPatientName().toString());
        System.out.println(p.getPatientId().toString());
        System.out.println(p.getAddress().toString());
        System.out.println(p.getContactNo().toString());
        System.out.println(p.getDoctorName().toString());
        return "Patient added successfully";
    }

    @GetMapping("/view")
    public  String ViewAllPatient(){
        return "view all ptient";
    }
}
