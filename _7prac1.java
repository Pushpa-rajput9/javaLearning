import java.util.Scanner;

public class _7prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of sub1:- ");
        float sub1 = sc.nextFloat();
        System.out.print("Enter marks of sub2:- ");
        float sub2 = sc.nextFloat();
        System.out.print("Enter marks of sub3:- ");
        float sub3 = sc.nextFloat();

        float total = sub1 + sub2 + sub3;
        float totalgainpercentage = (total / 300) * 100;

        float _40percent = 300 * (40 / 100);
        float _33percent = (100 * 33 / 100);
        // float p ercentageGainInEachSub = ((sub1 / 100) * 100) + ((sub2 / 100) * 100)
        // + ((sub3 / 100) * 100);
        // System.out.println(percentageGainInEachSub);
        if (totalgainpercentage >= _40percent && ((((sub1 / 100) * 100) >= _33percent)
                && (((sub2 / 100) * 100) >= _33percent) && (((sub3 / 100) * 100) >= _33percent))) {
            System.out.println("You are passed with marks " + total);
            System.out.println("total percentages " + totalgainpercentage + "%");

        } else {
            System.out.println("You are Fail, marks  gain " + total);
            System.out.println("total percentages " + totalgainpercentage + "%");
        }
    }
}
