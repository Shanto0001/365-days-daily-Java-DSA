import java.util.*;

public class L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
      //   conditional statements :- (if - else)


        // case 1st:- Vote eligibility 

        System.out.println("Enter ur age ");
        int age = sc.nextInt();
        if (age > 18){
        System.out.println("U Can Vote");
        }

        else{
        System.out.println("U can Not Vote");

        }

        // 2nd Case print greater number

        System.out.println("enter 1st Number ");
        int c= sc.nextInt();
        System.out.println("enter 2nd Number ");

        int d= sc.nextInt();

        if (c > d){
        System.out.println("1st case is bigger " + c);
        }

        else{
        System.out.println("2nd case is bigger" + d);
        }

        // 3rd case print is number is even or odd

        System.out.println("Enter 1st Number");
        int e = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int f = sc.nextInt();

        if (e % 2 == 0) {
            System.out.println(e + "  is even");
        } else {
            System.out.println(e + "  is odd ");
        }

        if (f % 2 == 0) {
            System.out.println(f + "  is even");
        } else {
            System.out.println(f + "  is odd ");
        }
    }

}
