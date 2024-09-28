package OOPs;

interface Bicycle {
    int a = 45;

    int applyBrake(int dec);

    int SpeedUp(int inc);
}

class AvonCycle implements Bicycle {
    int Speed = 8;

    public int applyBrake(int dec) {
        Speed = Speed - dec;
        return Speed;
    }

    public int SpeedUp(int inc) {
        Speed = Speed + inc;
        return Speed;
    }
}

public class _9interfaces {
    public static void main(String[] args) {
        AvonCycle a1 = new AvonCycle();
        System.out.println(a1.SpeedUp(8));
        System.out.println(a1.applyBrake(2));
        // you can create properties in interface
        System.out.println(a1.a);
        // a1.a = 456; // you cannot modify the properties of interface as they are
        // final
        System.out.println(a1.a);

    }
}
