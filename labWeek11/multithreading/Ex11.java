import java.util.concurrent.Semaphore;

public class Ex11 {
    private static final Semaphore semaphore = new Semaphore(2);

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + " ждет доступа...");
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + " получил доступ!");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println(Thread.currentThread().getName() + " освободил ресурс.");
                    semaphore.release();
                }
            }, "Поток-" + i).start();
        }
    }
}
