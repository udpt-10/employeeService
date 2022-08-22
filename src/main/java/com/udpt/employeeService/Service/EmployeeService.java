package com.udpt.employeeService.Service;

import com.udpt.employeeService.Entity.Employee;
import com.udpt.employeeService.Entity.Request.EmployeeRequest;
import com.udpt.employeeService.HandleException.DuplicateException;
import com.udpt.employeeService.HandleException.NotFoundException;
import com.udpt.employeeService.Repository.EmployeeRepository;
import com.udpt.employeeService.hashPassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RestTemplate restTemplate;

    private String email;

    private String userName;

    private EmployeeRequest employeeRequest;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmployeeRequest(EmployeeRequest employeeRequest) {
        this.employeeRequest = employeeRequest;
    }

    public List<Employee> getListEmployee() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeByEmail() {
        Optional<Employee> optionalEmployee = employeeRepository.findByEmail(email);
        if (!optionalEmployee.isPresent()) {
            throw new NotFoundException("Not found employee has email "+ email);
        }

        return optionalEmployee.get();
    }

    public Employee getEmployeeByUserName() {
        Optional <Employee> optionalEmployee = employeeRepository.findByUserName(userName);
        if (!optionalEmployee.isPresent()) {
            throw new NotFoundException("Not found employee has userName "+ userName);
        }

        return optionalEmployee.get();
    }

    public String insertNewEmployee() {
        Optional<Employee> optionalEmployeeIsGotByEmail = employeeRepository.findByEmail(employeeRequest.getEmail());
        if (optionalEmployeeIsGotByEmail.isPresent()) {
            throw new DuplicateException("user have email "+ employeeRequest.getEmail()+ " existed");
        }

        Optional<Employee> optionalEmployeeIsGotByUserName = employeeRepository.findByUserName(employeeRequest.getUserName());
        if (optionalEmployeeIsGotByUserName.isPresent()) {
            throw new DuplicateException("user have user name "+ employeeRequest.getEmail()+ " existed");
        }

        Employee employee = new Employee();
        employee.setEmployeeName(employeeRequest.getEmployeeName());
        employee.setUserName(employeeRequest.getUserName());
        employee.setPassword(hashPassword.hash(employeeRequest.getPassword()));
        employee.setPosition(employeeRequest.getPosition());
        employee.setLeavingDayBalance(employeeRequest.getLeavingDayBalance());
        employee.setAddress(employeeRequest.getAddress());
        employee.setPosition(employeeRequest.getPhone());
        employee.setEmail(employeeRequest.getEmail());
        employee.setDateOfBirth(employeeRequest.getDateOfBirth());
        employee.setSex(employeeRequest.isSex());
        employee.setInformationSummary(employeeRequest.getInformationSummary());
        employee.setDirector(employeeRequest.getDirector());
        employee.setManager(employeeRequest.getManager());
        employee.setPhone(employeeRequest.getPhone());

        employeeRepository.save(employee);

        Optional<Employee> optionalEmployee = employeeRepository.findByUserName(employeeRequest.getUserName());
        if (!optionalEmployee.isPresent()) {
            throw new NotFoundException("Employee have user name " + employeeRequest.getUserName() + "was not created");
        }
        String syncResult = restTemplate.postForObject("http://localhost:8002/employee/add",optionalEmployee.get().getEmployeeId(),String.class);
        return "Employee has name "+employee.getUserName()+" was created";

    }

    public String editEmployee() {
        Optional<Employee> optionalEmployee = employeeRepository.findByUserName(employeeRequest.getUserName());
        if (!optionalEmployee.isPresent()) {
            throw new NotFoundException("Not found employee has userName "+ employeeRequest.getUserName());
        }

        Employee employee = optionalEmployee.get();
        employee.setEmployeeName(employeeRequest.getEmployeeName());
        employee.setUserName(employeeRequest.getUserName());
        employee.setPassword(hashPassword.hash(employeeRequest.getPassword()));
        employee.setPosition(employeeRequest.getPosition());
        employee.setLeavingDayBalance(employeeRequest.getLeavingDayBalance());
        employee.setAddress(employeeRequest.getAddress());
        employee.setPosition(employeeRequest.getPhone());
        employee.setEmail(employeeRequest.getEmail());
        employee.setDateOfBirth(employeeRequest.getDateOfBirth());
        employee.setSex(employeeRequest.isSex());
        employee.setInformationSummary(employeeRequest.getInformationSummary());
        employee.setDirector(employeeRequest.getDirector());
        employee.setManager(employeeRequest.getManager());
        employee.setPhone(employeeRequest.getPhone());

        employeeRepository.save(employee);

        return "Employee has name "+employee.getUserName()+" was edited";
    }

    public String deleteEmployee() {
        Optional<Employee> optionalEmployee = employeeRepository.findByUserName(userName);
        if (!optionalEmployee.isPresent()) {
            throw new NotFoundException("Not found employee has userName "+ userName);
        }

        employeeRepository.delete(optionalEmployee.get());
        String syncResult = restTemplate.postForObject("http://localhost:8002/employee/deleteEmployee",optionalEmployee.get().getEmployeeId(),String.class);
        return "Employee has name "+userName+" was deleted";
    }
}
