import java.text.SimpleDateFormat;
import java.util.Date;

public class Homework {
    protected String courseName;
    protected String description;
    protected Date duedate;
    public Homework(String courseName, String description, Date duedate) {
        this.courseName = courseName;
        this.description = description;
        this.duedate = duedate;
    }
    public String getFormattedduedate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy  HH:mm:ss");
        return sdf.format(duedate);
    }
    public String getFormattedDescription() {
        return description;
    }
    public void getInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Description: " + description);
        System.out.println("Due date: " + getFormattedduedate());
}

}