import java.util.Scanner;

public class PGDC {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int a = keyboard.nextInt();
        System.out.print("Enter a positive number : ");
        int b = keyboard.nextInt();

        if ( a < 0 || b < 0){
            System.out.print("Enter a positive number");
        }else {
            int outPut = gcd(a, b);
            System.out.printf("The largest common divider of %d and %d is %d", a, b, outPut);
        }
    }

    public static int gcd(int a, int b)
    {
        if (a == 0) {
            return b;
        }
        else if (a > b) {
            return gcd(a - b, b);
        }else {
            return gcd(b - a, a);
        }
    }
}
