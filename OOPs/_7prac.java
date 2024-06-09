package OOPs;

//import org.w3c.dom.css.Rect;

class circle {
    int r;
    float pi = 3.14f;

    circle(int r) {
        this.r = r;
    }

    float areaCircle() {
        return pi * r * r;
    }
}

class cylinder extends circle {
    int h;

    cylinder(int x, int h) {
        super(x);
        this.h = h;
    }

    float areaCylinder() {
        return 2 * pi * r * h;
    }

}

class rect {
    int length, breadth;

    rect(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }
}

class cuboid extends rect {
    int Hieght;

    cuboid(int H, int l, int b) {
        super(l, b);
        Hieght = H;
    }

    int volume() {
        return length * breadth * Hieght;
    }
}

public class _7prac {
    public static void main(String[] args) {
        /*
         * ques-1
         * circle c = new circle(7);
         * System.out.println("area of circle " + c.areaCircle());
         * cylinder cy = new cylinder(7, 7);
         * System.out.println("area of cylinder " + cy.areaCylinder());
         */

        // ques-2
        rect r = new rect(8, 6);
        System.out.println("area of rectangle is " + r.area());
        cuboid cub = new cuboid(8, 6, 5);
        System.out.println("volum of cuboid is " + cub.volume());

    }

}
