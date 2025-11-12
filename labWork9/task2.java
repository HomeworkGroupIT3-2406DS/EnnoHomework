package labWork9;

class task2 {
    public static void main(String[] args) {
        int n = 3;

        try {
            isOdd(n);
            System.out.println(n + " even");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void isOdd(int n) {
        if (n%2!=0) {
            throw new IllegalArgumentException(n + " is odd");
        }
    }
}
