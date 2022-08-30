
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            int a = Integer.valueOf(scanner.nextLine());

            if (a == 0 && count == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (a == 0) {
                System.out.println((double) sum / count);
                break;
            } else if (a > 0) {
                sum = sum + a;
                count = count + 1;
                continue;
            } else if (a < 0) {
                continue;
            }
        }
    }
}
