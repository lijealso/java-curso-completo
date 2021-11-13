import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class A103Calendar
{
    public static void main(String[] args)
    {
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        
        Date d = (Date) Date.from(Instant.parse("2018-06-25T15:43:33Z"));

        System.out.println(sf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();

        System.out.println(sf.format(d));

        cal.add(Calendar.YEAR, 1);
        d = cal.getTime();
        System.out.println(sf.format(d));

        int minutos = cal.get(Calendar.MINUTE);
        System.out.println("Minutos: " + minutos);

        int segundos = cal.get(Calendar.SECOND);
        System.out.println("Segundos: " + segundos);
    }    
}
