import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество чисел:");
        int n = scanner.nextInt();

        Set<Integer> numbers = new HashSet<>();

        System.out.println("Введи числа");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();

            if (!numbers.add(value)) {
                throw new IllegalArgumentException("Ошибка " + value);
            }
        }

        System.out.println(" Всё гуд");
        scanner.close();
    }
}