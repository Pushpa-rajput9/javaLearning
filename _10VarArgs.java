public class _10VarArgs {
    // static int sum(int a, int b) {
    // return (a + b);
    // }
    // static int sum(int a, int b,int c) {
    // return (a + b+c);
    // }
    static int sum(int... arr) {
        // int ...arr = int []arr form an array of aruguments
        int result = 1;
        for (int a : arr) {
            // result *= a;

            result += a;

        }
        return (result / arr.length);
    }

    public static void main(String[] args) {
        System.out.println("welcome to varArgs tutorial");
        System.out.println("the avrage of 4 ,6,80 and 5 is " + sum(4, 5, 6, 80));

    }
}
