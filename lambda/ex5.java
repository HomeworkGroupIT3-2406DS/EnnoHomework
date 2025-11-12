import java.util.Arrays;
import java.util.List;
public class ex5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Banana", "Apple", "Mango", "Orange", "Grapes");
        words.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("сортированный список");
        for (String word : words) {
            System.out.println(word);
        }
    }
}