package src;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2021/1/22 19:45
 */
public class Test13 {

    public static void main(String[] args) {

//        Calendar date = new GregorianCalendar(2020,11,10,10,30,0);
////        Date date1 = date.getTime();

        Calendar cal = Calendar.getInstance();
        cal.set(2020,11,10,10,30,0);
        Date date = cal.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));

    }
}
