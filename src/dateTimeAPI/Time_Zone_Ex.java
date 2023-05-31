// Displaying the time in different countries
package dateTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Time_Zone_Ex
{
    public static void main(String[] args)
    {
        //Specify the target country's time zone
//        ZoneId country = ZoneId.of("America/New_York");
        ZoneId country = ZoneId.of("Asia/Kolkata");

        // Get the current date and time in the target time zone
        ZonedDateTime time = ZonedDateTime.now(country);

        // Print the target time
        System.out.println(country);
        System.out.println(time);


    }
}
