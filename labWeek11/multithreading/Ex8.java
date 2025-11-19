public class Ex8 {
    private static final Object Lock1 = new Object();
    private static final Object Lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (Lock1) {
                System.out.println("Thread 1: удерживает Lock1...");
                try { Thread.sleep(10); } catch (InterruptedException e) {}
                System.out.println("Thread 1: ждет Lock2...");
                synchronized (Lock2) {
                    System.out.println("Thread 1: захватил Lock1 и Lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (Lock2) {
                System.out.println("Thread 2: удерживает Lock2...");
                try { Thread.sleep(10); } catch (InterruptedException e) {}
                System.out.println("Thread 2: ждет Lock1...");
                synchronized (Lock1) {
                    System.out.println("Thread 2: захватил Lock2 и Lock1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
