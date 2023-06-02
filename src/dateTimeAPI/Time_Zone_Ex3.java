package dateTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;
public class Time_Zone_Ex3
{
    public static void main(String[] args)
    {
      // ZoneId class
        ZoneId country = ZoneId.of("Asia/Kolkata");
        System.out.println(ZonedDateTime.now(country));
    }
}
