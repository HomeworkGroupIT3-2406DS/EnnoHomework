public class Exercise2 {
    private static final int MAX_NUMBER = 20;

    public static void main(String[] args) {
        // Поток для четных чисел
        Thread evenThread = new Thread(() -> {
            System.out.println("Четные числа:");
            for (int i = 1; i <= MAX_NUMBER; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); // Перенос строки
        });

        // Поток для нечетных чисел
        Thread oddThread = new Thread(() -> {
            System.out.println("Нечетные числа:");
            for (int i = 1; i <= MAX_NUMBER; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        });

        evenThread.start();
        oddThread.start();
    }
}
