import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex4 {
    public static void readNumbers(String fileName) throws Exception {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num > 0) {
                scanner.close();
                throw new Exception("есть положительное число: " + num);
            }
        }
        scanner.close();
        System.out.println("Все числа отрицательные или = 0.");
    }

    public static void main(String[] args) {
        try {
            readNumbers("numbers.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: Файл не найден!");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}