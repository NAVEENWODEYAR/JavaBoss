package com.java8.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI_Ex3
{
    public static void main(String[] args)
    {
        // Converting the elements in the list from one case to other case
        List<String> st1 = List.of("Ammie","Bella","Clara","Dolly");
        List<String> st2 = Arrays.asList("Emma","Florence","Genelia","Helen");
        List<String> st_Uppercase = st1.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
            System.out.println(st_Uppercase);
    }
}
