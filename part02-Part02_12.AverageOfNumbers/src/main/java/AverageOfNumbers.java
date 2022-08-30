
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int a = Integer.valueOf(scanner.nextLine());

            if (a == 0) {
                System.out.println("Average of the numbers: " + (double)sum/count);
                break;
            } else {
                sum = sum + a;
                count = count + 1;
            }
        }
    }
}
