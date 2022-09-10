package com.veera.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ListTest {
    public static void main(String[] args) {
        List<String> noteList = Arrays.asList("A","B","C");
        Optional.ofNullable(noteList).orElseGet(Collections::emptyList)
                .stream().filter(Objects::nonNull)
                .forEach(System.out::println);
    }
}