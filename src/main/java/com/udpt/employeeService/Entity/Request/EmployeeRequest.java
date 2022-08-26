package com.udpt.employeeService.Entity.Request;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class EmployeeRequest {
    private String employeeName;
    private String userName;
    private String password;
    private String position;
    private double salary;
    private int leavingDayBalance;
    private String address;
    private String phone;
    private String email;
    private Date dateOfBirth;
    private boolean sex;
    private String informationSummary;
    private int director;
    private int manager;

    public String getEmployeeName() {
        return employeeName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public int getLeavingDayBalance() {
        return leavingDayBalance;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isSex() {
        return sex;
    }

    public String getInformationSummary() {
        return informationSummary;
    }

    public int getDirector() {
        return director;
    }

    public int getManager() {
        return manager;
    }
}
