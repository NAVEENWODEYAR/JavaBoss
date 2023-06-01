// Java program to filter elements in the lists on the required condition
package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Digit_Starts_With
{
    public static void main(String[] args)
    {
        List<Integer> roll_No = Arrays.asList(1,2,14,3,15,4,16,5,19,6,17,7,18,8);
            roll_No.stream().map((num)->String.valueOf(num))
                    .filter((num)->num.startsWith("1"))
                    .collect(Collectors.toList())
                    .forEach(System.out::println);

    }
}
