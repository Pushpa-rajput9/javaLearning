package OOPs;

class Employee {
    int id;
    String name;

    public void printDetails() {
        System.out.println("Employee1 Id is " + id);
        System.out.println("Employee1 name is " + name);
    }

}

public class customClass {

    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee harry = new Employee(); // creating or instantiating a new object

        // setting attributes
        harry.id = 12;
        harry.name = "codewithHarry";

        // printing the attributes
        // System.out.println(harry.id);
        // System.out.println(harry.name);
        harry.printDetails();

    }

}
