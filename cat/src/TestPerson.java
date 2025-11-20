public class TestPerson {

    public static void main(String[] args) {

        System.out.println("--- Creating Person Objects ---");

        Person person1 = new Person();
        Person person2 = new Person("John", 30);
        Person person3 = new Person("Alice", 22);

        System.out.println("Person 1 Details: ID=" + person1.getId() +
                ", Name=" + person1.getName() +
                ", Age=" + person1.getAge());

        System.out.println("Person 2 Details: ID=" + person2.getId() +
                ", Name=" + person2.getName() +
                ", Age=" + person2.getAge());

        System.out.println("Person 3 Details: ID=" + person3.getId() +
                ", Name=" + person3.getName() +
                ", Age=" + person3.getAge());

        System.out.println(" idCounter" + Person.getIdCounter());

        person1.setName("Selma Yılmaz");
        System.out.println("Updated Name for Person 1: " + person1.getName());
    }
}