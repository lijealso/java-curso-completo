import java.util.Date;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class A102Date
{
    public static void main(String[] args) throws ParseException
    {  
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));  

        Date data1 = (Date) sdf1.parse("25/06/2013");
        Date data2 = (Date) sdf2.parse("25/06/2013 15:43:33");

        System.out.println(data1);
        System.out.println(data2);

        System.out.println(sdf2.format(data1));
        System.out.println(sdf2.format(data2));

        Date data3 = new Date(); // data actual
        System.out.println(sdf2.format(data3));

        Date data4 = new Date(System.currentTimeMillis()); // data actual
        System.out.println(sdf2.format(data4));

        Date data5 = new Date(0L);
        System.out.println(sdf2.format(data5));

        Date data6 = new Date(1000L * 60L * 60L * 5L);
        System.out.println(sdf2.format(data6));

        Date data7 = Date.from(Instant.parse("2015-08-23T15:43:07Z"));
        System.out.println(sdf2.format(data7));
        System.out.println(sdf3.format(data7));

    }    
}
