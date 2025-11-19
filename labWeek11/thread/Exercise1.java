public class Exercise1 extends Thread {
    @Override
    public void run() {
        System.out.println("Привет из потока!");
    }

    public static void main(String[] args) {
        Exercise1 thread = new Exercise1();
        thread.start();
        System.out.println("Главный поток завершен.");
    }
}
