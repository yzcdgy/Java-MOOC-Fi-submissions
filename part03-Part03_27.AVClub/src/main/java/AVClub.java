
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String a = scanner.nextLine();
            if(a.isEmpty()){
                break;
            }
            String[] b = a.split(" ");

            for (String x : b) {
                if (x.contains("av")) {
                    System.out.println(x);
                }
            }
        }
    }
}
