package com.veera.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerMain {
    public static List<Customer> customerList() {
        return Stream.of(new Customer(1,"Ravi","ravi@gmail.com", Arrays.asList("123","234")), new Customer(2,"Ravi2","ravi2@gmail.com", Arrays.asList("123","234")), new Customer(5,"Ravi5","ravi5@gmail.com", Arrays.asList("123","234"))).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Customer> customerList = CustomerMain.customerList();
        //mapping from customer to customer email object.... (One to one mapping)
        List<String> emails = customerList.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emails);

        //customer -> customer.getPhoneNumbers() one to many mapping
        List<List<String>> lists = customerList.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(lists);

        Integer maxNumber = customerList.stream().max(Comparator.comparing(Customer::getId)).get().getId();
        System.out.println(maxNumber);

        Integer minNumber = customerList.stream().peek(customer -> System.out.println(customer.getId())).min(Comparator.comparing(Customer::getId)).get().getId();
        System.out.println(minNumber);

        List<String> flatMap = customerList.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(flatMap);


        List<String> emptyList = Arrays.asList("sample", "test");
        emptyList.stream().filter(val->val.equals("test")).findFirst().ifPresent(System.out::println);

        Integer sum = Stream.of(1,2,3,4,5).reduce((a,b)->a+b).get();
        System.out.println(sum);
    }
}