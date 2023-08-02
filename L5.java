import java.util.*;

public class L5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // CASE1:- check number is even or odd

        // System.out.println("Enter Number");
        // int a = sc.nextInt();

        // String ans = (a % 2 == 0) ? "even" : "odd";
        // System.out.println(ans);

        // CASE:- Is student pass or fail
        System.out.println("Enter Marks");
        int b = sc.nextInt();

        String student = (b >= 33) ? "pass" : "fail";
        System.out.println("student is:-" + student);

    }
}
