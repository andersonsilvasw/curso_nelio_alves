package cursonelioalves.exerciciospropostos.applications;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DatesWithCalendar {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        cal.add(Calendar.DAY_OF_MONTH, 2);
        cal.add(Calendar.MINUTE, 7);
        cal.add(Calendar.SECOND, 53);
        d = cal.getTime();

        System.out.println(sdf.format(d));
    }
}
