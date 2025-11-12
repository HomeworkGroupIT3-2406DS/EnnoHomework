import java.util.Scanner;
interface ToBinary {
    String convert(int n);
}

public class ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число");
        int number = scanner.nextInt();

        ToBinary binary = (n) -> {
            if (n == 0) return "0";
            String result = "";
            while (n > 0) {
                int r = n % 2;
                result = r + result;
                n = n / 2;
            }
            return result;
        };
        String binResult = binary.convert(number);
        System.out.println("Бинарный " + binResult);
    }
}
