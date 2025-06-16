package com.example.employeemanagementsystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.employeemanagementsystem.Service.EmployeeService;
import com.example.employeemanagementsystem.model.Employee;

@Controller
@RequestMapping("/employees/v1")
public class EmployeeController{

    @Autowired
    private EmployeeService service;

    @GetMapping("/view")
    public String viewEmployees(Model model) {
        
        model.addAttribute("employees", service.getAllEmployees());
        return "employee-list";
    }

    @GetMapping("/add")
    public String addEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee-form";
    }

    @PostMapping("/add")
    public String submitEmployeeForm(@ModelAttribute Employee employee) {
        service.saveEmployee(employee);
        return "redirect:/employees/v1/view";
    }
}