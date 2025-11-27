public class Main {
        public static void main(String[] args) {
            Student student1 = new Student("Ali Veli", "İstanbul Caddesi No:10");
            Student student2 = new Student("Ayşe Yılmaz", "Ankara Sokak No:5");

            System.out.println("Toplam Oluşturulan Öğrenci Sayısı: " + Student.getStudentCounter());

            System.out.println("\n--- Ali Veli'ye Not Ekleme ---");
            student1.addCourseGrade("ENG101", 89);
            student1.addCourseGrade("COM201", 56);
            student1.addCourseGrade("MATH101", 75);

            student1.printGrades();

            double avg1 = student1.getAverageGrade();
            System.out.println(student1.getName() + " Not Ortalaması: " + String.format("%.2f", avg1));

            System.out.println("\n--- Ayşe Yılmaz'a Not Ekleme ---");
            student2.addCourseGrade("PHY101", 95);
            student2.addCourseGrade("CHEM202", 85);
            student2.addCourseGrade("TURK101", 60);

            student2.printGrades();

            double avg2 = student2.getAverageGrade();
            System.out.println(student2.getName() + " Not Ortalaması: " + String.format("%.2f", avg2));

            System.out.println("\n--- Diğer Metotlar ve toString() Testi ---");
            student1.setAddress("İzmir Yolu Üzeri");
            System.out.println(student1.getName() + " Yeni Adres: " + student1.getAddress());

            System.out.println("Student1 toString: " + student1.toString());
        }
    }

