
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        divisibleByThreeInRange(3, 6);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int x = beginning; x <= end; x++) {
            if (x % 3 == 0) {
                System.out.println(x);
            }
        }
    }

}
