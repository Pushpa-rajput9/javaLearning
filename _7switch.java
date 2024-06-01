import java.util.Scanner;

public class _7switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        switch (age) {
            case 18:

                System.out.println("you are eligible to drive");

                break;
            case 2:

                System.out.println("you are not eligible to drive");

                break;

            default:
                System.out.println("invalid");
                break;
        }
    }
}
