public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int a = 1; a <= 9; a++) {
                int result = i * a;

                System.out.print(i+ " * " +a+ " = " +result+ ";\t  ");
            }
            System.out.println();
        }
    }
}
