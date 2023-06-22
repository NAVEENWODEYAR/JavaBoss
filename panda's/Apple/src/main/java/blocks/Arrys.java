package blocks;

import java.util.Arrays;

public class Arrys
{
    public static void main(String[] args)
    {
     // arrays
     // 1. using the new
     int odd_No[] = new int[5];
        odd_No[0] = 1;
        odd_No[2] = 3;
        odd_No[3] = 5;
        odd_No[4] = 7;

        System.out.println("Array using new,");
        for (Object n:odd_No)
        {
            System.out.println(n);
        }

      // 2. declaration & initialization of the arry
        System.out.println("declaration and initialization of the array");
      String emp[] = {"Steve","Pascal","Devon","Issac"};
        for (Object n:emp)
        {
            System.out.println(n);
        }
      // stream API
        Arrays.stream(emp).map((n)->n.toUpperCase()).forEach((System.out::println));
    }
}
