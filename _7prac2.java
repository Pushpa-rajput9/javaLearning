public class _7prac2 {
    public static void main(String[] args) {
        int i, j;
        // upward pattern
        for (i = 5; i >= 1; i--) {

            // System.out.println(i);
            for (j = i; j <= 5; j++) {
                // System.out.print(" ");
                System.out.print(" *");
                // if (j == 5) { //just print for last star
                // System.out.print(" *");
                // }
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        // downward patrn

        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                System.out.print(" *");
                // System.out.print(" ");
                // if (j == i) {

                // System.out.print(" *");

                // }
            }
            System.out.print("\n");
        }
    }
}
