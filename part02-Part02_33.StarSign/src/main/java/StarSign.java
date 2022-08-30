
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        String star = "*";
        String repeated = new String(new char[number]).replace("\0", star);
        System.out.println(repeated);
    }

    public static void printSquare(int size) {
        for (int x = size; x > 0; x--) {
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
        for (int x = height; x > 0; x--) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        for (int x = 1; x <= size; x++) {
            printStars(x);
        }
    }
}
