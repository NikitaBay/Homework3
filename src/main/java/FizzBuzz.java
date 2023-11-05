public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {

            System.out.print(i + " ");

            if (i % 3 != 0 & i % 5 != 0) {

                System.out.println(" ");
            }
            else if (i % 3 == 0 & i % 5 == 0) {

                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {

                System.out.println("fizz");
            }
            else if (i % 5 == 0) {

                System.out.println("buzz");
            }
        }
    }
}
