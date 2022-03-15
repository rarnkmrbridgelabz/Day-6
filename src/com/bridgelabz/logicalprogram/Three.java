package Day6LogicalPrograms;
import java.util.Scanner;
public class Three {
    public static void main(String[] args) {
        System.out.println("Enter Prime Numbers & see its True or False:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean prime = true;
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime);
    }

}