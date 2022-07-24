package com.veera.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmployeeValidator implements ConstraintValidator<EmployeeValidation, Double> {
    @Override
    public boolean isValid(Double salary, ConstraintValidatorContext context) {
        boolean isValid = false;
        if(salary>=10000) {
            isValid = true;
        }
        return isValid;
    }
}