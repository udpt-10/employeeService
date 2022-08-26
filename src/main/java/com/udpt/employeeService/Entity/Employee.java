package com.udpt.employeeService.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name="user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "position")
    private String position;

    @Column(name = "salary")
    private double salary;

    @Column(name = "leaving_day_balance")
    private int leavingDayBalance;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "sex")
    private boolean sex;

    @Column(name = "information_summary")
    private String informationSummary;

    @Column(name = "director")
    private int director;

    @Column(name = "manager")
    private int manager;

    public Employee() {

    }
//    public Employee(int employeeId, String employeeName, String userName, String password, Position position, int leavingDayBalance, String address, String phone, String email, Date dateOfBirth, boolean sex, String informationSummary, int director, int manager) {
//        this.employeeId = employeeId;
//        this.employeeName = employeeName;
//        this.userName = userName;
//        this.password = password;
//        this.position = position;
//        this.leavingDayBalance = leavingDayBalance;
//        this.address = address;
//        this.phone = phone;
//        this.email = email;
//        this.dateOfBirth = dateOfBirth;
//        this.sex = sex;
//        this.informationSummary = informationSummary;
//        this.director = director;
//        this.manager = manager;
//    }

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public int getDirector() {
        return director;
    }

    public void setDirector(int director) {
        this.director = director;
    }

    public int getManager() {
        return manager;
    }

    public void setManager(int manager) {
        this.manager = manager;
    }
}


enum Position {
    employee("employee"),
    projectManager("projectManager"),
    seniorProjectManager("seniorProjectManager"),
    director("director");

    private final String positionStringValue;
    Position(String position) {
        positionStringValue = position;
    }

    public String positionName() {
        return positionStringValue;
    }
}
