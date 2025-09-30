package labWork3;

public class TestAccount {
    public static void main(String[] args) {
        Account a = new Account("AC100", 1000);
        System.out.println(a);
        a.credit(500);
        System.out.println("After credit 500: " + a);
        boolean ok = a.debit(200);
        System.out.println("Debit 200 success? " + ok + "; " + a);
        ok = a.debit(2000);
        System.out.println("Debit 2000 success? " + ok + "; " + a);
    }
}
