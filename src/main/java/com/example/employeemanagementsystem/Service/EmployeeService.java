package com.example.employeemanagementsystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.CrudRepository.*;
import org.springframework.stereotype.Service;

import com.example.employeemanagementsystem.Repository.EmployeeRepository;
import com.example.employeemanagementsystem.model.Employee;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee emp){
        return employeeRepository.save(emp);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

}