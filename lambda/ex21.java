import java.util.Scanner;
interface primecheck {
    boolean isPrime(int n);
}
public class ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("начало диапазона");
        int start = scanner.nextInt();
        System.out.println("конец диапазона");
        int end = scanner.nextInt();
        primecheck check = (n) -> {
            if (n <= 1) return false;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (check.isPrime(i)) {
                sum = sum + i;
            }
        }

        System.out.println("Сумма простых чисел в диапазоне: " + sum);
    }
}
