package Day6LogicalPrograms.junit;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {

        int day, month, year;

        System.out.println("Enter a Date Month and Year");
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();

        int y = year - (14 - month) / 12;
        int x = y + (y / 4) - (y / 100) + (y / 400);
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31 * m) / 12) % 7;

        String temp[] = { "Sunday", "monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        System.out.println(temp[d]);
    }
}
