// Displaying the time in different countries
package dateTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Time_Zone_Ex1
{
    public static void main(String[] args)
    {
        // time zone of a particular country
        ZoneId zone = ZoneId.of("Asia/Kolkata");
        ZoneId zone2 = ZoneId.of("America/New_York");
        ZoneId zone3 = ZoneId.of("Africa/Cairo");
        ZoneId zone4 = ZoneId.of("Pacific/Palau");
        // getting the time of the particular zone
        ZonedDateTime zone_Time = ZonedDateTime.now(zone);
        ZonedDateTime zone_Time1 = ZonedDateTime.now(zone2);
        ZonedDateTime zone_Time2 = ZonedDateTime.now(zone3);
        ZonedDateTime zone_Time3 = ZonedDateTime.now(zone4);

        System.out.println(zone_Time);
        System.out.println(zone_Time1);
        System.out.println(zone_Time2);
        System.out.println(zone_Time3);


    }
}
