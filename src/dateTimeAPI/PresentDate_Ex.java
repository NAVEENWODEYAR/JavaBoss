package dateTimeAPI;

import java.time.LocalDate;
import java.util.Date;

public class PresentDate_Ex
{
    public static void main(String[] args)
    {
        // printing the present date & time
        System.out.println("Using java.time "+LocalDate.now());
        System.out.println("Using java.util "+new Date());
    }
}
