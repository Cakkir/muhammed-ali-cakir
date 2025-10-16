import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println(number + " is not prime.");
        } else if (isPrime(number)) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number+ " is not prime.");
        }

        scanner.close();
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
                    }
                }
        return true;
            }
        }



