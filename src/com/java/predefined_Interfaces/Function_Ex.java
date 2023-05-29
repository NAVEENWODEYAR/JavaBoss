package com.java.predefined_Interfaces;

import java.util.function.Function;
public class Function_Ex
{
    public static void main(String[] args)
    {
        // Function is an predefined interface, having apply()
        Function<String, Integer> fn = (name) -> {
          System.out.println("Function is an predefined functional interface.");
          return name.length();
        };

        System.out.println(fn.apply("Bhaskar"));




    }
}
