package com.java.predefined_Interfaces;

import java.util.function.Predicate;

public class Predicate_Ex1
{
    public static void main(String[] args)
    {
        // ternary operator
        int a = 10,b= 10;
        int max = (a>b)? a: b;
        System.out.println("Maximun value--"+max);

        Predicate <String> pd = (st)-> {
            if(st.length()>5)
            {
                System.out.println(st.toUpperCase());
                return true;
            }
            else
            {
                return false;
            }
        };
        System.out.println(pd.test("Welcome"));
    }
}
