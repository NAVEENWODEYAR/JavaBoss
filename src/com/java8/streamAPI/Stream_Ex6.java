package com.java8.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Stream_Ex6
{
    public static void main(String[] args)
    {
        // sort using Stream API
        List<Integer> num = Arrays.asList(1,9,3,8,4,2,5);
        num.stream().sorted().forEach(System.out::println);

        System.out.println("*************");
        // minimum number
        Integer i1 = num.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println("Minimun value in the list "+i1);

        // maximum number
        Integer i2 = num.stream().max((x,y) -> x.compareTo(y)).get();
        System.out.println("Maximum value in the list " +i2);
    }
}
