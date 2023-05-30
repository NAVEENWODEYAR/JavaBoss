package com.java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Ex4 {
    public static void main(String[] args) {
        // stream API operations on array
        String[] emp = {"Bhaskar", "Mounika", "Radha", "Krish", "Naveen"};
        Stream<String> st = Stream.of(emp);
        st.forEach(e -> {
            System.out.println(e);
        });
//        List<String> st1 = st.filter(s -> s.startsWith("A")).collect(Collectors.toList());
//        System.out.println(st1);

        List<String> emp1 = Arrays.asList("Ronda","Rousey","Melina","Milinda","Florence","Rona","Sona");
        // filter the names startswith A
        List<String> emp_R = emp1.stream().filter(name->name.startsWith("R")).collect(Collectors.toList());
        System.out.println(emp_R);

        // all the names toUpperCase
        List<String> emp_Up = emp1.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(emp_Up);
    }
}