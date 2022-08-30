
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.valueOf(scanner.nextLine());

        for (; a <= 100; a++) {
            System.out.println(a);
        }
    }
}
