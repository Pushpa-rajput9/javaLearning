package OOPs;

class Cyclinder {
    private float radius, height;
    float pi = 3.14f;

    public Cyclinder(float r, float h) {
        radius = r;
        height = h;
    }

    public float getradius() {
        return radius;
    }

    public float getheight() {
        return height;
    }

    public void setradidus(float r) {
        radius = r;
    }

    public void setheight(float h) {
        height = h;
    }

    public float area() {
        return 2 * pi * radius * height;
    }

    public float volumn() {
        return pi * radius * radius * height;
    }
}

public class _3Prac {
    public static void main(String[] args) {
        Cyclinder c1 = new Cyclinder(6, 10); // using constructor
        // Cyclinder c1 = new Cyclinder();
        // c1.setheight(7);
        // c1.setradidus(7);
        System.out.println("radius is " + c1.getradius());
        System.out.println("height is " + c1.getheight());
        System.out.println("area of cylinder is " + c1.area());
        System.out.println("volumn of cylinder is " + c1.volumn());
    }

}
