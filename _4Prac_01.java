import java.util.Scanner;

public class _4Prac_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter maths marks:-");
        float maths = sc.nextFloat();
        System.out.println("enter English marks:-");
        float english = sc.nextFloat();
        System.out.println("enter Hindi marks:-");
        float Hindi = sc.nextFloat();
        System.out.println("enter Science marks:-");
        float science = sc.nextFloat();
        System.out.println("enter Social Science marks:-");
        float socialScience = sc.nextFloat();

        System.out.println("Percentage gained:-");
        System.out.println(((maths + Hindi + english + science + socialScience) / 500) * 100);
    }
}
