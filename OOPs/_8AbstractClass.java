package OOPs;

abstract class parent2 {
    parent2() {
        System.out.println("i am a constructor of parent2");
    }

    public void sayhello() {
        System.out.println("hello");
    }

    abstract public void greet();

    // abstract public void greet2();
}

class child2 extends parent2 {
    @Override
    public void greet() {
        System.out.println("good morning");
    }
}

abstract class child3 extends parent2 {

    public void th() {
        System.out.println("good afternoon");
    }
}

public class _8AbstractClass {
    public static void main(String[] args) {
        child2 t = new child2();
        t.greet();
    }
}
