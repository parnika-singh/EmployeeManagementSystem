package com.example.employeemanagementsystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.employeemanagementsystem.Service.EmployeeService;
//import com.example.employeemanagementsystem.model.Employee;
import com.example.employeemanagementsystem.dto.EmployeeDto;

import java.util.List;


@Controller
@RequestMapping("/employees/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/view")
    public String viewEmployees(Model model) {
        List<EmployeeDto> employeeList = employeeService.getAllEmployees();
        model.addAttribute("employees", employeeList);
        return "employee-list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("employee", new EmployeeDto());
        return "employee-form";
    }

    @PostMapping("/add")
    public String addEmployee(@ModelAttribute("employee") EmployeeDto employeeDto) {
        employeeService.addEmployee(employeeDto);
        return "redirect:/employees/v1/view";
    }
}