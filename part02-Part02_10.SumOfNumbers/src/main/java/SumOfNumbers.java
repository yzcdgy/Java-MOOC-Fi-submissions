
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
                
        while (true) {
            System.out.println("Give a number:");
            int a = Integer.valueOf(scanner.nextLine());
            if (a == 0) {
                System.out.println("Sum of the numbers: " + sum);
                break;
            } else {
                sum = sum + a;
            }
        }
    }
}
