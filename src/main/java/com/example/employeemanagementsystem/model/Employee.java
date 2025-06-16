package com.example.employeemanagementsystem.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String department;
    private BigDecimal salary;

    @Column(name = "date_of_joining")
    private LocalDate dateOfJoining;

    public Employee() {}

    public Employee(String name, String department, BigDecimal salary, LocalDate dateOfJoining) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
}