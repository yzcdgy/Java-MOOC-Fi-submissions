
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldAge = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] data = input.split(",");
            if (oldAge < Integer.valueOf(data[1])) {
                oldAge = Integer.valueOf(data[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldAge);
    }
}
