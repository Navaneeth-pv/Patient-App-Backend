package com.example.Patientbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patients")

public class Patients {

    @Id
    @GeneratedValue()

    private int id;
    private String patientName;
    private String patientId;
    private String address;
    private String contactNo;
    private String doctorName;

    public Patients() {
    }

    public Patients(int id, String patientName, String patientId, String address, String contactNo, String doctorName) {
        this.id = id;
        this.patientName = patientName;
        this.patientId = patientId;
        this.address = address;
        this.contactNo = contactNo;
        this.doctorName = doctorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
}
