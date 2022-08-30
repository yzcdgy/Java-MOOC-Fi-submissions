
public class AdvancedAstrology {

    public static void printStars(int number) {
        String star = "*";
        String repeated = new String(new char[number]).replace("\0", star);
        System.out.println(repeated);
    }

    public static void printSpaces(int number) {
        String space = " ";
        String repeated = new String(new char[number]).replace("\0", space);
        System.out.print(repeated);
    }

    public static void printTriangle(int size) {
        for (int x = size; x > 0; x--) {
            printSpaces(x - 1);
            printStars(size - x + 1);
        }
    }

    public static void christmasTree(int height) {
        for (int x = 0; x < height; x++) {
            printSpaces(height - (x + 1));
            printStars(2 * x + 1);
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
