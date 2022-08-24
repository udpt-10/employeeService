package com.udpt.employeeService.Controller;

import com.udpt.employeeService.Entity.Employee;
import com.udpt.employeeService.Entity.Request.EmployeeRequest;
import com.udpt.employeeService.Entity.Request.LoginRequest;
import com.udpt.employeeService.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public List<Employee> getAllEmployee() {
        return employeeService.getListEmployee();
    }

    @PostMapping("/findByEmail")
    public Employee getEmployeeByEmail(@RequestBody String email) {
        employeeService.setEmail(email);
        return employeeService.getEmployeeByEmail();
    }

    @PostMapping("/findByUserName")
    public Employee getEmployeeByUserName(@RequestBody String userName) {
        employeeService.setUserName(userName);
        return employeeService.getEmployeeByUserName();
    }

    @PostMapping("/addNewEmployee")
    public String addNewEmployee(@RequestBody EmployeeRequest employeeRequest) {
        employeeService.setEmployeeRequest(employeeRequest);
        return employeeService.insertNewEmployee();
    }

    @PostMapping("/editEmployee")
    public String editEmployee(@RequestBody EmployeeRequest employeeRequest) {
        employeeService.setEmployeeRequest(employeeRequest);
        return employeeService.editEmployee();
    }

    @PostMapping("/deleteEmployee")
    public String deleteEmployee(@RequestBody String userName) {
        employeeService.setUserName(userName);
        return employeeService.deleteEmployee();
    }

    @PostMapping("/login")
    public Employee login(@RequestBody LoginRequest loginRequest) {
        employeeService.setLoginRequest(loginRequest);
        return employeeService.login();
    }

    @GetMapping("/manager")
    public List<Employee> getAllManager() {
        return employeeService.findAllManager();
    }
}
