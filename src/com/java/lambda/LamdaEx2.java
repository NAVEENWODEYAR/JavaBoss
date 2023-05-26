package com.java.lambda;

interface Lamdaex1
{
    int m2(int a, int b);
}
public class LamdaEx2
{
    public static void main(String args[])
    {
        System.out.println("Lamda Expression");
        Lamdaex1 l2 = (a,b) ->
                        {
                            System.out.println("Lambda expression with the parameters");
                            return a-b;
                        };
        System.out.println(l2.m2(5,4));
    }
}
