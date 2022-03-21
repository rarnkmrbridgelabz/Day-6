package Day6LogicalPrograms.junit;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        int choose;
        System.out.println("Choose any one from 1.Celsius: 2.Fahrenheit:");
        Scanner sc = new Scanner(System.in);
        choose = sc.nextInt();

        if (choose == 1) {
            System.out.println("Enter the temp in Fahrenheit:");
            int fahrenheit = sc.nextInt();
            int celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("The temp in Celsius is :" + celsius);
        } else if (choose == 2) {
            System.out.println("Enter the temp in Celsius:");
            int celsius = sc.nextInt();
            int fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("The temp in Celsius is :" + fahrenheit);
        } else {
            System.out.println("Please Choose from above two choices");
        }
    }
}

