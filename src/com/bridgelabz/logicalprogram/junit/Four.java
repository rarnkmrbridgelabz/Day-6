package Day6LogicalPrograms.junit;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {

        double P, rate, year;
        System.out.println("Enter the Principle amount,Rate and Years");
        Scanner sc = new Scanner(System.in);
        P = sc.nextDouble();
        rate = sc.nextDouble();
        year = sc.nextDouble();

        double n = 12 * year;
        double r = rate / (12 * 100);
        double pay = (P * r) / (1 - (Math.pow((1 + r), (-n))));
        System.out.println("The payment per month is:" + pay);

    }
}
