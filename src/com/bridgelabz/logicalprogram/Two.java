package Day6LogicalPrograms;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        System.out.println("Enter any number :");
        Scanner scanner=new Scanner(System.in);
        int Number=scanner.nextInt();
        int Sum = 0;
        for(int i = 1 ; i < Number ; i++) {
            if(Number % i == 0)  {
                Sum = Sum + i;
            }
        }
        if (Sum == Number) {
            System.out.println("It is a Perfect Number");
        }
        else {
            System.out.println("It is not a Perfect Number");
        }
    }
    }

