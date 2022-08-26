package com.udpt.employeeService.DTO;

import com.udpt.employeeService.Entity.Employee;
import com.udpt.employeeService.Entity.Response.EmployeeResponse;
import com.udpt.employeeService.Repository.EmployeeRepository;

import java.util.Date;
import java.util.Optional;

public class employeeDTO {
    public static EmployeeResponse response(Employee employee, Employee manager, Employee director) {

        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setEmployeeName(employee.getEmployeeName());
        employeeResponse.setUserName(employee.getUserName());
        employeeResponse.setPosition(employee.getPosition());
        employeeResponse.setSalary(employee.getSalary());
        employeeResponse.setLeavingDayBalance(employee.getLeavingDayBalance());
        employeeResponse.setAddress(employee.getAddress());
        employeeResponse.setPhone(employee.getAddress());
        employeeResponse.setEmail(employee.getEmail());
        employeeResponse.setDateOfBirth(employee.getDateOfBirth());
        employeeResponse.setSex(employee.isSex());
        employeeResponse.setInformationSummary(employee.getInformationSummary());
        employeeResponse.setManager(manager.getEmployeeName());
        employeeResponse.setDirector(director.getEmployeeName());

        return employeeResponse;
    }
}
