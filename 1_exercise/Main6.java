import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by ayako_sayama on 2016/11/14.
 */
public class Main6 {
    public static void main(String[] args) {

        //This is how we do today'sDATES!!
        Date d = new Date();
        System.out.println(d);

        //This is in gregorian calendar
        GregorianCalendar gc = new GregorianCalendar(2016,10,13);
        gc.add(GregorianCalendar.DATE,1);
        Date d2 = gc.getTime();
        System.out.println(d2);

        //This is where I get the local date
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d2));

        //unix version of date: not easy to read 2016-11-15T00:20:40.110
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // printing out date in  2016-11-14 format
        LocalDate ld = LocalDate.of(2016,11,10);
        System.out.println(ld);

        //same as top!
        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
        System.out.println(dtf.format(ld));

        // printing out date in slash form
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(dtf2.format(ld));


    }
}
