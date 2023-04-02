package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class digitalClockApp {

    public static void main(String[] args) {

        String date = new SimpleDateFormat("K:mm a, EEE, MMM d, yyyy GGG")
                .format(Calendar.getInstance().getTime());
        System.out.println(date);

    }
}