import java.util.Scanner;

interface primeCheck {
    boolean isPrime(int n);
}

public class ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();

        primeCheck check = (n) -> {
            if (n <= 1) return false;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        int largestPrimeFactor = 1;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && check.isPrime(i)) {
                largestPrimeFactor = i;
            }
        }

        System.out.println("Наибольший простой делитель: " + largestPrimeFactor);
    }
}
