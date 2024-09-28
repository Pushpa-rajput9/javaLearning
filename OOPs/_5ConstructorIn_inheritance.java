package OOPs;

class Base1 {
    int x;

    public Base1() {
        System.out.println("i am base class constructer");

    }

    public Base1(int i) {
        System.out.println("i am an overloaded constructor of  base class constructer " + i);
        // x = i;
    }

    public void setx(int a) {
        x = a;
    }

    public int getx() {
        return x;
    }
}

class Derived1 extends Base1 {
    public Derived1() {
        System.out.println("i am derived class constructer");

    }

    public Derived1(int x, int y) {
        super(x);// it call the base class overloaded constructor
        System.out.println("i am an overloaded constructor of derived class constructer " + x + " & " + y);

    }

}

public class _5ConstructorIn_inheritance {
    public static void main(String[] args) {
        Base1 b = new Base1();
        b.setx(20);
        // Derived1 d = new Derived1(9, 6);

        // System.out.println(b.getx());
    }
}
