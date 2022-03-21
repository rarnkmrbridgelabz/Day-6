package Day6LogicalPrograms.junit;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {

        System.out.println("Enter a Numbers which needs to be changed to Binary");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] binaryArray = new int[40];

        int index = 0;
        while (number > 0) {
            binaryArray[index] = number % 2;
            number = number / 2;
            index++;
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binaryArray[i]);
        }
    }
}
