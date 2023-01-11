package com.nestdigital.employeebackendapp.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeModel {

    @Id
    @GeneratedValue

    private int id;
    private String code;
    private String name;
    private String designation;
    private String gender;
    private String companyname;
    private int salary;
    private String address;
    private String mobile;
    private String email;
    private int year;
    private String bloodgroup;
    private String dob;

    public EmployeeModel() {
    }

    public EmployeeModel(int id, String code, String name, String designation, String gender, String companyname, int salary, String address, String mobile, String email, int year, String bloodgroup, String dob) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.designation = designation;
        this.gender = gender;
        this.companyname = companyname;
        this.salary = salary;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
        this.year = year;
        this.bloodgroup = bloodgroup;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
