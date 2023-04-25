import java.util.Calendar;
import java.util.Locale;

public class calander{
   
    public static void main(String[] args) {

        int year =2008;
        int month = 12;
        int date = 5;

         Calendar   cl = Calendar.getInstance();
        // cl.set(0, 0, 0, 0, 0, 0);
        cl.set(year, month, date);
        //  Calendar cal = Calendar.getInstance();
        // cal.set(year, month-1, day);
        String fullday = cl.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.UK).toUpperCase();
        
       System.out.println(fullday);


       
    }
}
