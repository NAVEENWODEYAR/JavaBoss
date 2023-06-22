package conditional;

import java.util.Scanner;

public class Switch_Ex
{
    public static void main(String[] args)
    {
     // switch statement..,
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade:");
        char ch = sc.next().charAt(0);

            switch (ch)
            {
                case 'A':
                    System.out.println("First Class");
                    break;
                case 'B':
                    System.out.println("Second class");
                    break;
                case 'C':
                    System.out.println("Pass Class");
                    break;
                case 'D':
                    System.out.println("Fail class");
                    break;
                default:
                    System.out.println("Please provide the correct grade,.");
            }
    }
}
