package OOPs;

class MymainEmployee {
    private int id;
    private String name;

    public MymainEmployee(int i, String s) {
        id = i;
        name = s;
        // id = 9;
        // name = "harry";
    }

    public String getname() {
        return name;
    }

    // public void setname(String n) {
    // this.name = n;
    // }

    public int getId() {
        return id;
    }

    // public void setId(int id) {
    // this.id = id;
    // }

}

public class _3Constructors {
    public static void main(String[] args) {
        MymainEmployee m1 = new MymainEmployee(3, "harry");
        // m1.setId(0);
        // m1.setname();

        System.out.println(m1.getId());
        System.out.println(m1.getname());

    }

}