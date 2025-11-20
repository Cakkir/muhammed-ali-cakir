public class Person {
    private int id;
    private String name;
    private int age;

    private static int idCounter = 100;

    public Person(String name, int age) {
        this.id = idCounter;
        idCounter++;
        this.name = name;
        this.age = age;
        System.out.println("Person created: ID=" + this.id + ", Name=" + this.name);
    }

    public Person() {
        this("Selma", 15);
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}