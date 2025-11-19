public class Exercise7 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread depositor = new Thread(() -> {
            try {
                account.deposit(100);
                Thread.sleep(500);
                account.deposit(200);
            } catch (InterruptedException e) { e.printStackTrace(); }
        });

        Thread withdrawer = new Thread(() -> {
            account.withdraw(150);
            account.withdraw(200); // Будет ждать пополнения
        });

        withdrawer.start();
        depositor.start();
    }
}

class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Пополнено: " + amount + ". Баланс: " + balance);
        notifyAll(); // Уведомляем ожидающие потоки, что баланс изменился
    }

    public synchronized void withdraw(int amount) {
        System.out.println("Попытка снять: " + amount + ". Текущий баланс: " + balance);
        while (balance < amount) {
            System.out.println("Недостаточно средств для снятия " + amount + ". Ожидание...");
            try {
                wait(); // Ждем, пока кто-то не пополнит счет
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("Снято: " + amount + ". Остаток: " + balance);
    }
}
