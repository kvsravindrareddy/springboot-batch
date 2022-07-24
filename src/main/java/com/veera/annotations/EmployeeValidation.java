package com.veera.annotations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Constraint(validatedBy = EmployeeValidator.class)
public @interface EmployeeValidation {
    public String message() default "Invalid salary : Salary must be greater than 25000";
    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}