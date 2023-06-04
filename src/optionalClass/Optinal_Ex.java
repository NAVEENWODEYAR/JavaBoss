package optionalClass;

import java.util.ArrayList;
import java.util.List;

public class Optinal_Ex
{
    public static void main(String[] args)
    {
     // optinal class
        List<Integer> lt = new ArrayList();
        for(int i=0; i<=10; i++)
        {
            lt.add(i);
        }
//        System.out.println(lt[10]);
        for (Integer l:lt) {
            System.out.println(l);
        }
    }
}
