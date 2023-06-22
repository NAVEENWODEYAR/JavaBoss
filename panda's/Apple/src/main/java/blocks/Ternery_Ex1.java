package blocks;

import java.util.Scanner;

public class Ternery_Ex1
{
    public static void main(String[] args)
    {
        // ternary operator
        Scanner sc = new Scanner(System.in);
        int a,b,max;
        System.out.println("Enter the first number");
         a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
        max = (a>b)?a:b;
        System.out.println("Maximum value in the given numbers-> "+max);
    }
}
