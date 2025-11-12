public class ex7 {
    public static void checkVowels(String str) throws Exception {
        str = str.toLowerCase();
        if (!(str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u"))) {
            throw new Exception("Строка не содержит гласных букв: " + str);
        }
        System.out.println("Строка содержит гласные: " + str);
    }

    public static void main(String[] args) {
        try {
            checkVowels("Sky");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}