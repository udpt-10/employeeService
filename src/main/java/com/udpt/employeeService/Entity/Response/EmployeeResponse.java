package com.udpt.employeeService.Entity.Response;

import java.util.Date;

public class EmployeeResponse {

    private String employeeName;
    private String userName;
    private String position;
    private double salary;
    private int leavingDayBalance;
    private String address;
    private String phone;
    private String email;
    private Date dateOfBirth;
    private boolean sex;
    private String informationSummary;
    private String director;
    private String manager;

    public EmployeeResponse() {

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getLeavingDayBalance() {
        return leavingDayBalance;
    }

    public void setLeavingDayBalance(int leavingDayBalance) {
        this.leavingDayBalance = leavingDayBalance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getInformationSummary() {
        return informationSummary;
    }

    public void setInformationSummary(String informationSummary) {
        this.informationSummary = informationSummary;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
