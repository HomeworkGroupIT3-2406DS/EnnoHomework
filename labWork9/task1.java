package labWork9;

class task1 {
    public static void main(String[] args) {
        int n = 8;
        int m = 0;

        try {
            int ans = n/m;
            System.out.println("Answer: " + ans);
        }catch (ArithmeticException e) {
            System.out.println("Division by 0!");
        }
    }
}
