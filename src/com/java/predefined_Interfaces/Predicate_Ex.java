package com.java.predefined_Interfaces;

import java.util.function.Predicate;
public class Predicate_Ex
{
    public static void main(String[] args)
    {
     // Predicate is a predifined functional interface having test()
        Predicate<Integer> pd = (age) -> {
            if(age>25)
            {
                return true;
            }
            else
            return false;
        };
        System.out.println(pd.test(28));
    }
}
