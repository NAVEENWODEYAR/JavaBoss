package collectionFramework;

import java.util.Arrays;

public class ArrLst_Ex1
{
    public static void main(String[] args)
    {
        // Stream API for processing the data in the lists
        Arrays.asList("Ammu","Bhaskar","Chethan","Devi")
                .stream().map((name)-> { if(name.length()>4) return name.toUpperCase(); return name; })
                .forEach(System.out::println);
    }
}

