import java.util.*;

public class L7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int count = 0;
        // int n = 7;
        // while (count <= n) {
        // System.out.println("Number" + count);
        // count++;
        // }

        // // User input range
        // System.out.println("Give range of number :- ");
        // int range = sc.nextInt();
        // int counted = 1;

        // while (counted <= range) {
        // System.out.println("number " + counted);
        // counted++;
        // }

        // sum of first n natural numbers

        int numb = sc.nextInt();
        int sum = 0;
        int it = 1;
        while (it <= numb) {
            sum = sum + it;
            System.out.println(sum);
            it++;
        }

    }
}
