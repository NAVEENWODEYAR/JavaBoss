package optionalClass;

import java.util.Optional;
import java.util.OptionalInt;

public class Null_Pointer_Ex
{
    public static void main(String[] args)
    {
     // Optional class is to avoid the null pointer exception
        String[] emp = new String[1000];
                emp[0] = "Ammie";
                emp[1] = "Bella";
                emp[2] = "Clara";
                emp[4] = "Dolly";
                emp[3] = "Emma";
//        for (String e:emp)
//        {
//            System.out.println("Employee Name--" +e);
//        }

        // trying to access the emp[18],  null pointer exception
//        System.out.println(emp[18]);
        Optional op = Optional.ofNullable(emp[500]);
            if(op.isPresent())
            {
                System.out.println(op.get());
            }
            else
            {
                System.out.println("Idiot check your array");
            }



    }
}
