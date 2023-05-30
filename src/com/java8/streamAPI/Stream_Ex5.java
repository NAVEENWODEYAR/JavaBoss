package com.java8.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Stream_Ex5
{
    public static void main(String[] args)
    {
     //return the square of all the numbers in the list using streamAPI
        List<Integer> num = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> num_n2 = num.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(num_n2);
        for (Integer i: num_n2) {
            System.out.println(i);
        }
        System.out.println("********************");
//        num_n2.forEach(a-> System.out.println(a));
        num_n2.forEach(System.out::println);

    }
}
