package OOPs;

class A {
    public int a;

    public int harry() {
        return 4;
    }

    public void meth2() {
        System.out.println("i am method 2 of class A");
    }

}

class B extends A {
    public void meth2() { // it override the method2 of class A when method 2 is call by class B's object
        System.out.println(" i am method2 of class B ");
    }

    public void meth3() {
        System.out.println(" i am method3 of class B ");
    }

}

public class _6MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.meth2();
        b.meth2();
        b.meth3();
        System.out.println(b.harry());
        // dynamic method despatch
        A a2 = new B(); // meth2 will run of class B because object is formed of class B
        a2.meth2();
    }

}
