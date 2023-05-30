package com.java8.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

import static java.util.stream.Collector.*;

public class StreamAPI_Ex2
{
    public static void main(String[] args)
    {
        // filterring all the even numbers from an array list
         List<Integer> l1= List.of(1,2,3,4,5,6,7,8,9);  // immutable
        List<Integer> l4  = Arrays.asList(20,21,22,23,24,25,26,27,28,29); // immutable
        List<Integer> l2 = new ArrayList();     // mutable
                    l2.add(10);
                    l2.add(11);
                    l2.add(12);
                    l2.add(13);
                    l2.add(14);
        List<Integer> l3 = new ArrayList();
            for(Integer l: l2)
            {
                if(l%2 ==0)
                    l3.add(l);
            }
                System.out.println("Even numbers list- "+l3);
            // Using the stream API
            List<Integer> l_Even = l4.stream().filter( num -> num%2==0).collect(Collectors.toList());
                System.out.println("Even numbers list " +l_Even);
            List<Integer> l_25 = l4.stream().filter( n->n>25).collect(Collectors.toList());
                System.out.println("List contains the numbers(>25) "+l_25);
    }
}
