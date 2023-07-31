import java.lang.Math;
import java.util.Scanner;

public class task1 {
    public static void main(String args[]) {

//    Implement pow(x, n), which calculates x raised to the power n (x^n).
        Scanner read = new Scanner(System.in);
        System.out.println("Enter x:");
        double x = read.nextDouble();

        System.out.println("Enter n:");
        double n = read.nextDouble();
//        int x = 2, n = 3;
        double temp = 1;

        while (n != 0) {
            temp *= x;
            --n;
        }

        System.out.println("Result: " + temp);
    }
}
