package com.veera.example;

@MyCustomAnnotation(studentAddress = "Mallampet, Hyderabad",
        studentName = "Ravi")
public class MyClass {

    public void testMethod() {
        if(true) {
            System.out.println("... This is test method...");
        }
    }
}