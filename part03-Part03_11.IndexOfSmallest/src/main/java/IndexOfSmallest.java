
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program that reads user input
        // until the user enters 9999

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 9999) {
                break;
            }
            list.add(input);
        }

        int smallest = 9999;

        for (int x = 0; x < list.size(); x++) {
            if (smallest > list.get(x)) {
                smallest = list.get(x);
            }
        }
        System.out.println("Smallest number: " + smallest);

        for (int x = 0; x < list.size(); x++) {
            if (smallest == list.get(x)) {
                System.out.println("Found at index: " + x);
            }
        }
    }
}
