package com.veera.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListEx {
    public static void main(String[] args) {
        List<Note> noteList = Arrays.asList(new Note("name2","tagname2"),
                new Note("name1","tagname1"),
                new Note("name3","tagname3"),
                new Note("name5","tagname5"),
                new Note("name5","tagname5"));

        //noteList.sort((n1,n2)->n1.getName().compareTo(n2.getName()));

        noteList.sort(new Comparator<Note>() {
            @Override
            public int compare(Note o1, Note o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        noteList.forEach(System.out::println);


        List<String> list = Arrays.asList("abc","test");
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        //Map<String, String> map= list.stream().collect(Collectors.toMap(Note::getName, Note::getTagName));
    }
}