
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldAge = 0;
        String eldestName = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] data = input.split(",");
            if (oldAge < Integer.valueOf(data[1])) {
                oldAge = Integer.valueOf(data[1]);
                eldestName = data[0];
            }
        }
        System.out.println("Name of the oldest: " + eldestName);
    }
}
