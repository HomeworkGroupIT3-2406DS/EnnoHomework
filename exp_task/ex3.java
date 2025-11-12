import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex3 {
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        System.out.println("Содержимое файла");
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }

    public static void main(String[] args) {
        try {
            readFile("test03.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: Файл не найден!");
        }
    }
}