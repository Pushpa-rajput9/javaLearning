package OOPs;
//base class cannot access the properties of derived class

class base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int p) {
        x = p;
    }

    public void printme() {
        System.out.println("I am a method");
    }
}

class derived extends base {
    int y;

    public int gety() {
        return y;
    }

    public void sety(int p) {
        y = p;
    }

}

public class _4Inheritance {
    public static void main(String[] args) {
        // base b = new base();
        // b.setX(9);
        // System.out.println("x " + b.getX());

        derived d = new derived();
        d.setX(7);
        d.sety(33);
        System.out.println("x " + d.getX());
        System.out.println("y " + d.gety());
    }
}
