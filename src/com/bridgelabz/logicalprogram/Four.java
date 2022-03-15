package Day6LogicalPrograms;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner scanner=new Scanner(System.in);
        int num =scanner.nextInt();
        int r,q,reverse=0;
        while(num!=0){
            r=num%10;
            reverse=(reverse*10)+r;
            num=num/10;
        }
        System.out.println("Reversed number is:"+reverse);
    }
}


