import java.util.Scanner;

public class _11Fabonacci {
    static int fabonacci(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        return fabonacci(n - 1) + fabonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose fibonacci series you want :- ");
        int x = sc.nextInt();
        System.out.println("fibonacci series of " + x);
        for (int i = 0; i <= x; i++) {
            System.out.print(fabonacci(i) + " ");
        }

    }
}
