package com.example.employeemanagementsystem.Service;

import com.example.employeemanagementsystem.dto.EmployeeDto;
import com.example.employeemanagementsystem.model.Employee;
import com.example.employeemanagementsystem.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto addEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee(
            employeeDto.getName(),
            employeeDto.getDepartment(),
            employeeDto.getSalary(),
            employeeDto.getDateOfJoining()
        );

        Employee saved = employeeRepository.save(employee);

        employeeDto.setId(saved.getId());

        return employeeDto;
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        // Convert Entity list to DTO list
        return employeeRepository.findAll().stream().map(emp ->
            new EmployeeDto(
                emp.getId(),
                emp.getName(),
                emp.getDepartment(),
                emp.getSalary(),
                emp.getDateOfJoining()
            )
        ).collect(Collectors.toList());
    }
}