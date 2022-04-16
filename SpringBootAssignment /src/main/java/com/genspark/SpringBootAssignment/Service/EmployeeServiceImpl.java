package com.genspark.SpringBootAssignment.Service;

import com.genspark.SpringBootAssignment.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> list;

    public EmployeeServiceImpl() {
        list = new ArrayList<>();
        list.add(new Employee(12345, "Rob Smith"));
        list.add(new Employee(67890, "Sarah Carpet"));
        list.add(new Employee(98765, "Nina Water"));
    }

    @Override
    public List<Employee> getAllEmployees() {
        return list;
    }

    @Override
    public Employee getEmployeeById(int id) {
        //employee id passed in parameter needs to match employee id in constructor

        Employee e = null;
        for(Employee employee : list) {
            if(employee.getId() == id) {
                e = employee;
                break;
            }
        }
        return e;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        list.add(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        String name = employee.getName();
        Employee a = null;
        for(Employee b : list ) {
            if(b.getName() == employee.getName()) {
                b.setName(name);
                a = b;
                break;
            }
        }
        return a;
    }

    @Override
    public String deleteEmployeeById(int id) {
        for(Employee employee : list) {
            if(employee.getId() == id) {
                list.remove(employee);
                break;
            }
        }
        return "Deleted Successfully";
    }

}
