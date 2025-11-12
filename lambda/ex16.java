import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

interface WordCheck {
    boolean containsWord(List<String> list, String word);
}
public class ex16 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "mango", "grape");

        Scanner scanner = new Scanner(System.in);
        System.out.println("слово для поиска:");
        String target = scanner.nextLine().toLowerCase();

        WordCheck check = (list, w) -> {
            for (String item : list) {
                if (item.toLowerCase().equals(w)) {
                    return true;
                }
            }
            return false;
        };

        boolean result = check.containsWord(words, target);

        if (result) {
            System.out.println("Слово найдено");
        } else {
            System.out.println(" нет в списке.");
        }
    }
}
