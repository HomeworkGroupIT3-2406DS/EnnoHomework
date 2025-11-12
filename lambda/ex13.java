import java.util.Scanner;
interface WordCount {
    int count(String sentence);
}
public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите предложение:");
        String sentence = scanner.nextLine();

        WordCount wc = s -> s.trim().isEmpty() ? 0 : s.trim().split("\\s+").length;

        int result = wc.count(sentence);
        System.out.println("Количество слов: " + result);
    }
}
