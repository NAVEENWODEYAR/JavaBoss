package com.java.predefined_Interfaces;

import java.util.function.Consumer;

public class Consumer_Ex
{
    public static void main(String[] args)
    {
    // Consumer is an predefined interface having the accept()
        Consumer<String> cn = (name) -> {
            System.out.println(name);
        };
    cn.accept("Ammu");
    }
}
