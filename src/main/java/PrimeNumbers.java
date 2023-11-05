import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        long number;
        boolean isPrime = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");

        if (scanner.hasNextLong()) {
            number = scanner.nextLong();

            if (number <= 1) {
                isPrime = false;
            } else {
                for (long i = 2; i * i <= number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(number + " - Простое число");

            } else {
                System.out.println(number + " - Составное число");
            }
        } else {
            System.out.println("Это не число брат");
        }
    }
}