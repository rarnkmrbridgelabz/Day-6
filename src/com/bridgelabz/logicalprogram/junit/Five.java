package Day6LogicalPrograms.junit;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {

        System.out.println("Enter a Numbers");
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double epsilon = 1e-15;

        if (a >= 0) {
            double temp = a;
            while (Math.abs(temp - a / temp) > epsilon * temp) {
                temp = (a / temp + temp) / 2.0;
            }
            System.out.println(temp);
        }
    }
}
