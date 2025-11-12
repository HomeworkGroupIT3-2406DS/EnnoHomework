import java.util.Scanner;

interface PalindromeCheck {
    boolean isPalindrome(String s);
}
public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи строку:");
        String text = scanner.nextLine();

        PalindromeCheck check = (str) -> {
            str = str.toLowerCase();
            str = str.replace(" ", "");

            String reversed = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }

            return str.equals(reversed);
        };

        boolean result = check.isPalindrome(text);

        if (result) {
            System.out.println("палиндром.");
        } else {
            System.out.println("не палиндром.");
        }
    }
}
