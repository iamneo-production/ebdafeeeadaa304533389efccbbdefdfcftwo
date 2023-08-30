package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    int employeeId;
    String employeeName;
    String email;
    long mobile;
    String address;
    String roll;
    float salary;
    String Department;


    public Employee(int employeeId, String employeeName, String email, long mobile, String address, String roll,
            float salary, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.roll = roll;
        this.salary = salary;
        Department = department;




        
    }


    public Employee() {
    }


    public int getEmployeeId() {
        return employeeId;
    }


    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }


    public String getEmployeeName() {
        return employeeName;
    }


    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public long getMobile() {
        return mobile;
    }


    public void setMobile(long mobile) {
        this.mobile = mobile;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getRoll() {
        return roll;
    }


    public void setRoll(String roll) {
        this.roll = roll;
    }


    public float getSalary() {
        return salary;
    }


    public void setSalary(float salary) {
        this.salary = salary;
    }


    public String getDepartment() {
        return Department;
    }


    public void setDepartment(String department) {
        Department = department;
    }

    


    
    
    
}
