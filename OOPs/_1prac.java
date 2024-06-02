package OOPs;

import java.util.Scanner;

//import java.util.Scanner;

class employee {

    int salary;
    String name;

    public int getsalary() {

        return salary;
    }

    public String getname() {

        return name;
    }

    public void setname(String n) {
        // System.out.println("Name of Employee1 is " + name);
        name = n;
    }

    // public void setsalary() {
    // System.out.println("salary of Employee1 is " + getsalary());
    // }

}

// problem 2
class cellphone {
    public void ring() {
        System.out.println("Ringing....");
    }

    public void vibrating() {
        System.out.println("vibrating....");
    }

    public void callFriend() {
        System.out.println("Hello Mukul...");
    }
}

// problem 3
class Square {
    int side;

    public void setside(int s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side of square");
        side = s = sc.nextInt();

    }

    public int parameter() {
        return 4 * side;
    }

    public int Area() {
        return side * side;
    }
}

// problem 4
class Rectangle {
    int length, breadth;

    public void setlen_breadth(int l, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length ");
        length = l = sc.nextInt();
        System.out.println("enter breadth ");
        breadth = b = sc.nextInt();

    }

    public int parameter() {
        return 2 * (length + breadth);
    }

    public int Area() {
        return length * breadth;
    }
}

public class _1prac {
    public static void main(String[] args) {
        /*
         * //problem 1
         * employee e1 = new employee();
         * e1.setname("Pushpa Rajput");
         * System.out.println("name of employee1 is " + e1.getname());
         * e1.salary = 32000;
         * System.out.println("salary of employee1 is " + e1.getsalary());
         * 
         * // problem 2
         * 
         * cellphone phone = new cellphone();
         * phone.ring();
         * phone.vibrating();
         * phone.callFriend();
         */

        // problem 3
        /*
         * Square a4 = new Square();
         * a4.setside(5);
         * System.out.println("parameter of square is " + a4.parameter());
         * System.out.println("Area of square is " + a4.Area());
         */
        // problem 4
        Rectangle r1 = new Rectangle();
        r1.setlen_breadth(0, 0);
        System.out.println("parameter of rectangle is " + r1.parameter());
        System.out.println("Area of rectangle is " + r1.Area());
    }

}
