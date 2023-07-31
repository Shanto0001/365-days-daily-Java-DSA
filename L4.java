import java.util.*;

public class L4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // income tax calculator:- (if , else if, else)

        System.out.println("enter ur income");
        int a = sc.nextInt();
        int tax;

        if (a < 500000) {

        tax = 0;
        System.out.println("NO TAX" + tax);

        } else if (a >= 500000 && a == 1000000) {

        tax = a / 10;

        System.out.println("Your TAX :-" + tax);

        }

        else {

        tax = (int) (a * 0.3);
        System.out.println("Your tax:- " + tax);

        }

        // case 2 :- print largest number
        System.out.println("enter 1st number");
        int c = sc.nextInt();
        System.out.println("enter 2nd number");
        int d = sc.nextInt();
        System.out.println("enter 3rd number");
        int e = sc.nextInt();

        if (c > d && c > e) {
            System.out.println(c + " is grater number");
        }

        else if (d > c && d > e) {

            System.out.println(d + "  is greater number");
        }

        else {

            System.out.println(e + "  is greater number");
        }

    }

}
