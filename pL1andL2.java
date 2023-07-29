import java.util.*;

public class pL1andL2 {
    public static void main(String[] args) {
        // Lecture 1 practice topic:- print ,sum,variables and Primitive Data Type
        // lecture 2 Practice topic:- type conversion, type casting, Input and binary
        // uniary operator
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:- ");
        String first = sc.next();
        System.out.println(" Your name is :- " + first);

        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2st number");

        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Your Ans:-" + sum);

        // P1 topic cover :- output, input (scanner) , data Type And Binary arthmatic
        // operator

        // Type casting
        System.out.println("Enter any Float value ");
        float c = sc.nextFloat();
        int d = (int) a;
        System.out.println(" Your typecasting ans is :- " + d);

        // Type Conversion
        System.out.println("Enter any intager value:-  ");
        int e = sc.nextInt();
        long f = e;
        System.out.println("your typeConversion Ans:- " + f);

    }
}
