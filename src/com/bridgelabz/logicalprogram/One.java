package Day6LogicalPrograms;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series");
        System.out.println("Enter any number:");
        Scanner scanner = new Scanner(System.in);
        int number =scanner.nextInt();
        int a=0;int b=1;int c;
        System.out.print(a);
        System.out.print(b);
        for(int i=2;i<=number;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c);
        }


    }
}
