package com.veera.model;

import com.veera.annotations.EmployeeValidation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String id;
    private String name;
    @EmployeeValidation
    private double salary;
}