import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ex5 {
    public static void readFile(String fileName) throws Exception {
        File file = new File(fileName);

        if (!file.exists()) {
            throw new FileNotFoundException("Файл не найден: " + fileName);
        }
        Scanner scanner = new Scanner(file);
        if (!scanner.hasNext()) {
            scanner.close();
            throw new Exception("Файл пустой: " + fileName);
        }

        System.out.println("Содержимое файла:");
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }

    public static void main(String[] args) {
        try {
            readFile("test.txt");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}