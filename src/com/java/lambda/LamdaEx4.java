package com.java.lambda;

interface LamdaExa4
{
    int add_No(int a, int b);
}
public class LamdaEx4
{
    public static void main(String args[])
    {
        // Lamda expression
        LamdaExa4 l = (a,b) ->{
                                System.out.println("function without name ");
                                return a+b;
                            };
        System.out.println("Sum of the given numbers " +l.add_No(5,5));
    }
}
