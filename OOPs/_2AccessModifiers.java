package OOPs;

class MyEmployee {
    private int id;
    private String name;

    public String getname() {
        return name;
    }

    public void setname(String s) {
        name = s;
    }

    public int getId() {
        return id;
    }

    public void setId(int n) {
        id = n;
    }
}

public class _2AccessModifiers {
    public static void main(String[] args) {

        MyEmployee e1 = new MyEmployee();
        // e1.name=harry; // it will through error because name is private. it cannot be
        // access directly through object, it can be access only through methods of same
        // class
        // e1.id=2;
        e1.setId(9);
        e1.setname("Harry");
        System.out.println("Id is " + e1.getId());
        System.out.println("Name  is " + e1.getname());

    }

}
