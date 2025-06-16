package com.example.employeemanagementsystem.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EmployeeDto {
    private Long id;
    private String name;
    private String department;
    private BigDecimal salary;
    private LocalDate date_of_joining;

    public EmployeeDto() {}

    public EmployeeDto(Long id, String name, String department, BigDecimal salary, LocalDate date_of_joining) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.date_of_joining = date_of_joining;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public BigDecimal getSalary() { return salary; }
    public void setSalary(BigDecimal salary) { this.salary = salary; }

    public LocalDate getDateOfJoining() { return date_of_joining; }
    public void setDateOfJoining(LocalDate date_of_joining) { this.date_of_joining = date_of_joining; }
}