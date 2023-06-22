package blocks;

import java.util.Scanner;

public class Ternery_Ex
{
    public static void main(String[] args)
    {
        // ternary operator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        String eligibility = (age>25)? "Eligible for Marriage" :"Enjoy your life";
        System.out.println(eligibility);
    }
}
