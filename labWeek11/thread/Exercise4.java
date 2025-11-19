public class Exercise4 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] result = new int[3][3];

        Thread[] threads = new Thread[3];

        for (int i = 0; i < 3; i++) {
            final int row = i;
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        result[row][j] += matrix1[row][k] * matrix2[k][j];
                    }
                }
            });
            threads[i].start();
        }

        // Ожидаем завершения всех потоков
        for (Thread t : threads) {
            try { t.join(); } catch (InterruptedException e) { e.printStackTrace(); }
        }

        System.out.println("Результат умножения матриц:");
        for (int[] r : result) {
            for (int val : r) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
