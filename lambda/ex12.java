import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов:");
        int n = scanner.nextInt();

        List<Integer> numbers = new java.util.ArrayList<>();
        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Список: " + numbers);
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
    }
}
