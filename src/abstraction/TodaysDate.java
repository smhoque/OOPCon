package abstraction;

import java.util.Date;

/**
 * Created by riponctg on 12/8/2016.
 */
public class TodaysDate {
    public void ShowDate() {
        Date date = new Date();
        System.out.println("Todays Date is: " + date.toString());
    }
}
