package com.example.employeemanagementsystem.Service;

import com.example.employeemanagementsystem.dto.EmployeeDto;
import java.util.List;

public interface EmployeeService {
    EmployeeDto addEmployee(EmployeeDto employeeDto);
    List<EmployeeDto> getAllEmployees();
}
