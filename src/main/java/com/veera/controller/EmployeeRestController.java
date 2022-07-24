package com.veera.controller;

import com.veera.model.Employee;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeRestController {

    @GetMapping(value = "/emps", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public List<Employee> employees() {
        return employeesList();
    }

    @PostMapping("/emp")
    public Employee createEmp(@RequestBody @Valid Employee employee) {
        return employee;
    }

    private List<Employee> employeesList() {
        return Arrays.asList(new Employee("1","Ravi",10000.00),
                new Employee("2","Veera",20000.00));
    }
}