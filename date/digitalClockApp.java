package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//4 Different ways to Get Current Date and Time in java
//1. SimpleDateFormat (class)
//2. Date
//3. LocalDate
//4. LocalDateTime
public class digitalClockApp {

    public static void main(String[] args) {

        String date = new SimpleDateFormat("yyyy_MM__dd_HH_mm_ss")
                .format(Calendar.getInstance().getTime());
        System.out.println(date);
    }
}