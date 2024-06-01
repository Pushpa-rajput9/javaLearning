import java.util.Scanner;

public class _8array {
    public static void main(String[] args) {
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter marks of Student" + (i + 1));
            marks[i] = sc.nextInt();
        }

        // for (int i = 0; i < 5; i++) {
        // System.out.print("Marks of Student" + (i + 1) + ":-\t");
        // System.out.println(marks[i]);
        // }

        // forEach loop

        for (int i : marks) {
            System.out.println(i);
        }
    }
}
