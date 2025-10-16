import java.sql.SQLOutput;
import java.util.Scanner;

public class coffeeshop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("A - Americano   - 3.00$");
        System.out.println("C - Cappuccino  - 3.75$");
        System.out.println("L - Latte       - 4.00$");
        System.out.println("E - Espresso    - 2.50$$");

        String choice = scanner.nextLine();

        switch(choice){
            case "A" :
                System.out.println("You choose Americano it's 3.00$");break;

            case "C" :
                System.out.println("You choose Cappuccino it's 3.75$");break;

            case "L" :
                System.out.println("You choose Latte it's 4.00$");break;

            case "E":
                System.out.println("You choose Espresso it's 2.50$");break;

            default:
                System.out.println("Invalid choice");





        }




    }
}