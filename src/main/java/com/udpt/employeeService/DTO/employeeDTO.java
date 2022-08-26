package com.udpt.employeeService.DTO;

import com.udpt.employeeService.Entity.Employee;
import com.udpt.employeeService.Entity.Response.EmployeeResponse;
import com.udpt.employeeService.Repository.EmployeeRepository;

import java.util.Date;
import java.util.Optional;

public class employeeDTO {
    public static EmployeeResponse response(Employee employee, Employee manager, Employee director) {

        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setEmployeeId(employee.getEmployeeId());
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
        employeeResponse.setManager(employee.getManager());
        employeeResponse.setDirector(employee.getDirector());
        employeeResponse.setManagerName(manager.getEmployeeName());
        employeeResponse.setDirectorName(director.getEmployeeName());

        return employeeResponse;
    }
}
