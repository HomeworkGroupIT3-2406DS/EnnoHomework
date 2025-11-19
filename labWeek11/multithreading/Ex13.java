import java.util.concurrent.CountDownLatch;

public class Ex13 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        for (int i = 1; i <= 3; i++) {
            new Thread(() -> {
                System.out.println("Сервис инициализируется...");
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
                System.out.println("Сервис готов.");
                latch.countDown();
            }).start();
        }

        System.out.println("Главный поток ждет сервисы...");
        latch.await(); // Блокируется, пока счетчик не станет 0
        System.out.println("Все сервисы запущены. Старт системы.");
    }
}
