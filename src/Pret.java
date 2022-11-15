import java.util.Scanner;

public class Pret {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Total Loan Amount : ");
        int S0 = keyboard.nextInt();

        System.out.print("Reimburses Amount : ");
        int r = keyboard.nextInt();

        System.out.print("Monthly Interest Rate : ");
        Double ir = keyboard.nextDouble();

        int s = S0;
        int monthCount = 0;
        Double i = 0.0;
        if (S0 < 0 ){
            System.out.print("Invalid Loan Amount");
        }else if (r < 0){
            System.out.print("Invalid Reimburses Amount");
        }else if ( ir <= 0 || ir >= 1){
            System.out.print("Invalid Interest Rate. Value should be between 0 and 1");
        }else {
            while (s > 0 ){
                i = i + (ir * s);
                s = s - r;
                monthCount++;
            }
            System.out.printf("The sum of interest received (over %d months) is then %.2f dollars" , monthCount, i);
        }
    }
}
