
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x]; y++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
