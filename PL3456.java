import java.util.*;

public class PL3456 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        // 1ST whether number is Positive or Negative
        System.out.println("Enter Number:-");
        int a = sc.nextInt();
        if (a < 0) {
        System.out.println("Negative");
        } else {
        System.out.println("positive");
        }



        // 2nd Find You have feaver or not
        System.out.println("Enter Your Temp :- ");
        double b = sc.nextInt();
        String temp = (b > 100) ? "You have feaver" : "You don't have feaver";
        System.out.println(temp);





        // 3rd Find weak according to input number
        System.out.println("enter Number of week ");
        int c = sc.nextInt();
        switch (c) {
        case 7:
        System.out.println("sunday");
        break;
        case 1:
        System.out.println("monday");
        break;
        case 2:
        System.out.println("tuesday");
        break;
        case 3:
        System.out.println("wendsday");
        break;
        case 4:
        System.out.println("thursday");
        break;
        case 5:
        System.out.println("friday");
        break;
        case 6:
        System.out.println("saturday");
        break;
        default:
        System.out.println("plese select number uder 1to7");
        break;
        }




        // 4th find is year is leap year or not
        System.out.println("Enter Year Which You Want to find:-  ");
        int d = sc.nextInt();
        if (d % 4 == 0 && d % 100 != 0 || (d % 100 == 0 && d % 400 == 0)) {
            System.out.println("Yes this is leap year");
        } else {
            System.out.println("this is not a leap year");
        }



    }
}
