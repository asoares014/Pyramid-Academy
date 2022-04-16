package com.genspark.SpringBootAssignment.Service;

import com.genspark.SpringBootAssignment.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    String deleteEmployeeById(int id);
}
