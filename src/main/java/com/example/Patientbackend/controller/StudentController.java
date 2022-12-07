package com.example.Patientbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @PostMapping("/add")
    public String AddPatient(){
        return "Patient added successfully";
    }

    @GetMapping("/view")
    public  String ViewAllPatient(){
        return "view all ptient";
    }
}
