import java.util.*;

public class L6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Switch statements

        System.out.println("Enter ur number");
        int number = sc.nextInt();

        switch (number) {
        case 1:
        System.out.println("Shanto");
        break;
        case 2:
        System.out.println("Appu");
        break;
        case 3:
        System.out.println("Nice");
        break;
        default:
        System.out.println("Default Name");
        break;
        }

        

        // creating calculator eith help of switch statment
        System.out.println("Enter 1st value ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd value ");
        int b = sc.nextInt();
        System.out.println("select operations:- + , - , * , / , % ");
        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+':
                int c = a + b;
                System.out.println(c);
                break;

            case '-':
                int d = a - b;
                System.out.println(d);
                break;

            case '*':
                int e = a * b;
                System.out.println(e);
                break;

            case '/':
                int f = a / b;
                System.out.println(f);
                break;

            case '%':
                int g = a % b;
                System.out.println(g);
                break;

            default:
                System.out.println("Please select your option carefully");
                break;
        }
    }
}
