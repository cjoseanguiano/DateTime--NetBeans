/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetime;

import java.text.DateFormat;
import java.util.Calendar;

/**
 *
 * @author carlosjoseanguiano
 */
public class DateTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        if (calendar.isWeekDateSupported()) {
            System.out.println("Numero de semanas :" + calendar.getWeeksInWeekYear());

            System.out.println("Numero de la semana actual :" + calendar.get(Calendar.WEEK_OF_YEAR));
        }

        calendar.setWeekDate(2017, 16, 3);
        System.out.println(DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(calendar.getTime()));
    }

}
