import java.util.Arrays;
import java.util.List;
interface StringLength {
    String find(List<String> list);
}
public class ex17 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "elephant", "dog", "mouse", "hi");

        StringLength longest = (list) -> {
            String max = list.get(0);
            for (String w : list) {
                if (w.length() > max.length()) {
                    max = w;
                }
            }
            return max;
        };

        StringLength shortest = (list) -> {
            String min = list.get(0);
            for (String w : list) {
                if (w.length() < min.length()) {
                    min = w;
                }
            }
            return min;
        };

        String longWord = longest.find(words);
        String shortWord = shortest.find(words);

        System.out.println("список слов " + words);
        System.out.println("Самое длинное слово: " + longWord + " (длина: " + longWord.length() + ")");
        System.out.println("Самое короткое слово: " + shortWord + " (длина: " + shortWord.length() + ")");
    }
}
