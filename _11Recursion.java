public class _11Recursion {
    // 5!=5*4*3*2*1 // n*(n-1)
    static int factorial(int n) {
        int fact;
        if (n == 0 || n == 1) {
            fact = 1;
        } else {
            fact = n * factorial(n - 1);
        }
        return fact;
    }

    public static void main(String[] args) {
        int x = 0;
        System.out.println("factorial of " + x + " is \n" + factorial(x));

    }
}
