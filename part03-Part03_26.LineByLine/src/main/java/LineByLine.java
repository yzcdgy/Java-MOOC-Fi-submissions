
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String a = scanner.nextLine();
            if (a.equals("")) {
                break;
            }
            String[] pieces = a.split(" ");
            for (String piece : pieces) {
                System.out.println(piece);
            }
        }
    }
}
