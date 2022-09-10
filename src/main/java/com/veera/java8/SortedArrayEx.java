package com.veera.java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortedArrayEx {
    public static void main(String[] args) {
        int[] numArr = new int[]{1,2,3,4,5};
        Arrays.stream(numArr).boxed().sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue).forEach(System.out::println);

        List<String> list = Arrays.asList("Veera","Shankara","Ravindra","Reddy","Kakarla");
        String resultString = list.stream().map(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(resultString);

        List<String> names = Arrays.asList("AA","BB","CC","DD","AA");
        Map<String, Long> resultMap = names.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )
        );
        System.out.println(resultMap);

        List<String> dupNames = Arrays.asList("AA","BB","CC","DD","AA");
        Map<String, Long> dupNamesResultMap = dupNames.stream()
                .filter(value->Collections.frequency(dupNames, value)>1)
                .collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )
        );
        System.out.println(dupNamesResultMap);
    }
}