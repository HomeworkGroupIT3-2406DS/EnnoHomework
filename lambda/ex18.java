import java.util.Scanner;
interface PerfectSquareCheck {
    boolean isPerfectSquare(int n);
}

public class ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();
        PerfectSquareCheck check = (n) -> {
            if (n < 0) {
                return false;
            }

            for (int i = 1; i * i <= n; i++) {
                if (i * i == n) {
                    return true;
                }
            }
            return false;
        };

        boolean result = check.isPerfectSquare(number);

        if (result) {
            System.out.println(number + " идеальный квадрат");
        } else {
            System.out.println(number + " не идеальный квадрат");
        }
    }
}