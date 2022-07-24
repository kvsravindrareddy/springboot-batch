package com.veera.example;

import java.lang.reflect.Field;
import java.util.Date;

public class AnnotationExample {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User();
        user.setId(1);
        user.setName("Ravi");
        user.setEmail("kvsrr@gmail.com");
        user.setCreated(new Date());

        for (Field field : user.getClass().getDeclaredFields()) {
            DBField dbField = field.getAnnotation(DBField.class);
            System.out.println("name : "+dbField.name());
            field.setAccessible(true);
            Object obj = field.get(user);
            System.out.println("value : "+obj);
            System.out.println("type : "+dbField.type());
            System.out.println("is primary : "+dbField.isPrimaryKey());
            System.out.println("------------");
        }
    }
}