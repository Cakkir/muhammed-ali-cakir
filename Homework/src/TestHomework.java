import java.util.Date;
import java.util.Calendar;


public class TestHomework {
    public static void main(String[] args) {
    Date now = new Date();
    Homework h1 = new Homework(
            "SENG 211 - OOP" ,
            "Prepare a slide about Array and Date class" ,
            now);
        h1.getInfo();
    }

    Calendar cal = Calendar.getInstance();
    cal.setTime(now);
    cal.set(2025, Calendar.DECEMBER, 10 , 23 , 59);
    Date deadLine = cal.getTime();
    Homework h2 = new Homework(
            "CENG 201 - ALGORİTHMS","BST",deadLine
    );

}