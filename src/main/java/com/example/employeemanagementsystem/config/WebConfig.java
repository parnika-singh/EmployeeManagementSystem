package com.example.employeemanagementsystem.config;

import com.example.employeemanagementsystem.Interceptor.LoggingInterceptor;
import com.example.employeemanagementsystem.Service.EmployeeService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private LoggingInterceptor loggingInterceptor;

    @Autowired
    private EmployeeService employeeService;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loggingInterceptor);
    }

    @PostConstruct
    public void init() {
        System.out.println("Employees at startup: " + employeeService.getAllEmployees().size());
    }
}