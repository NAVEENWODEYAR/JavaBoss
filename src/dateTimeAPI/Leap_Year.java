// to check leap year
package dateTimeAPI;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Leap_Year
{
    public static void main(String[] args)
    {
        System.out.println("Current year "+LocalDate.now());
        System.out.println("Current year is leap year- "+LocalDate.now().isLeapYear());

        // imput from the user
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the year to check");
//        Date year = (Date) sc.nextInt();
//        LocalDate l = LocalDate.o();
//        System.out.println(year.isLeapYear());
    }

}
