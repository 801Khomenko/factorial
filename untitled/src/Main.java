import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для обчислення факторіала: ");
        int n = scanner.nextInt();

        long factorial = calculateFactorial(n);

        System.out.println(n + "! = " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            return -1; // Якщо введено від'ємне число, повертаємо -1 як помилку.
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
