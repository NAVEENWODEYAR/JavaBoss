package com.java.lambda;

interface LambdaEx3
{
    interface LamdaExs3
    {
        int add();
    }
}
public class LamdaEx3 implements LambdaEx3.LamdaExs3
{
    public int add()
    {
        System.out.println("Nested Interface");
        return 0;
    }
    public static void main(String args[])
    {
    // object creation
    LamdaEx3 obj = new LamdaEx3();
    System.out.println(obj.add());
    }


}
