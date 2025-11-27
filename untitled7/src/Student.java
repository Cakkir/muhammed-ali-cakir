public class Student {
    private String name;
    private String address;
    private String[] courses;
    private int[] grades;
    private int numCourses;
    private static int studentCounter = 0;

    private final int MAX_COURSES = 30;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
        this.courses = new String[MAX_COURSES];
        this.grades = new int[MAX_COURSES];
        this.numCourses = 0;
        studentCounter++;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int getStudentCounter() {
        return studentCounter;
    }

    public void addCourseGrade(String courseID, int grade) {
        if (numCourses < MAX_COURSES) {
            this.courses[numCourses] = courseID;
            this.grades[numCourses] = grade;
            this.numCourses++;
        } else {
            System.out.println("Maksimum ders sayısına (" + MAX_COURSES + ") ulaşıldı.");
        }
    }

    public void printGrades() {
        System.out.print(this.name + ": ");
        for (int i = 0; i < numCourses; i++) {
            System.out.print(courses[i] + ": " + grades[i]);
            if (i < numCourses - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public double getAverageGrade() {
        if (numCourses == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }

        return (double) sum / numCourses;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", address=" + address + ", numCourses=" + numCourses + ", overallAverage=" + String.format("%.2f", getAverageGrade()) + "]";
    }
}
