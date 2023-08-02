import java.util.*;

public class L8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello world");

        }

        // print square pattern
        for (int it = 1; it <= 4; it++) {
            System.out.println("****");
        }

        // print reverse of a number
        int n = 22123;
        while (n > 0) {
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10;
        }

    }
}
