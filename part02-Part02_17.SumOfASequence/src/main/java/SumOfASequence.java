
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        
        int a = Integer.valueOf(scanner.nextLine());
        int b = 0;
        
        for(int x = 1; x <= a; x++){
            b = b + x;
        }
        System.out.println("The sum is " + b);
    }
}
