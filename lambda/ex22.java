import java.util.Arrays;
import java.util.List;
interface CaseCheck {
    String checkCase(List<String> list);
}

public class ex22 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("HELLO", "WORLD", "JAVA");

        CaseCheck check = (list) -> {
            boolean allUpper = true;
            boolean allLower = true;

            for (String s : list) {
                if (!s.equals(s.toUpperCase())) {
                    allUpper = false;
                }
                if (!s.equals(s.toLowerCase())) {
                    allLower = false;
                }
            }

            if (allUpper) return "вск в верхнем регистре";
            else if (allLower) return "Все в нижнем регистре";
            else return "смешанный регистр";
        };

        System.out.println(check.checkCase(words));
    }
}
