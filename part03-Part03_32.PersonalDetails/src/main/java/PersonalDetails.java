
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int maxCharCount = 0;
        int birthYears = 0;
        int dataCount = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] data = input.split(",");
            if (data[0].length() > maxCharCount) {
                maxCharCount = data[0].length();
                longestName = data[0];
            }
            birthYears += Integer.valueOf(data[1]);
            dataCount++;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double) birthYears / dataCount);
    }
}
