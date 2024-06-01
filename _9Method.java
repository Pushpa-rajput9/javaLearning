public class _9Method {
    // method is a way to seprate the logic similar as user define function
    // static int logic(int x, int y) {
    // int z;
    // if (x > y) {
    // z = x + y;
    // } else {
    // z = (x + y) * 5;
    // }
    // return z;
    // }

    // object method innvocation using object creation
    int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        _9Method obj = new _9Method(); // object creation
        int a = 9, b = 6;
        // int c = logic(a, b); //for static method because it is shareable so that we
        // don't need to create object
        int c = obj.logic(a, b);
        // int a1 = 8, b1 = 9, c1 = logic(a1, b1);// for static method
        int a1 = 8, b1 = 9, c1 = obj.logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);

    }

}
