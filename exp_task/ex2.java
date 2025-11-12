public class ex2 {
    public static void checkNumber(int num) throws Exception {
        if (num % 2 != 0) {
            throw new Exception("Число " + num + " нечетное");
        } else {
            System.out.println("Число " + num + " чётное");
        }
    }
    public static void main(String[] args) {
        try {
            checkNumber(7);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}