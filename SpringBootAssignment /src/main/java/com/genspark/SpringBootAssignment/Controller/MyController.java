package com.genspark.SpringBootAssignment.Controller;

import com.genspark.SpringBootAssignment.Entity.Employee;
import com.genspark.SpringBootAssignment.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String home() {
        return "<HTML><H1>Welcome to my Employee Database</H1></HTML>";
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return this.employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable String employeeId) {
        return this.employeeService.getEmployeeById(Integer.parseInt(employeeId));
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return this.employeeService.addEmployee(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return this.employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{employeeId")
    public String deleteEmployeeById(@PathVariable String employeeId) {
        return this.employeeService.deleteEmployeeById(Integer.parseInt(employeeId));
    }
}
