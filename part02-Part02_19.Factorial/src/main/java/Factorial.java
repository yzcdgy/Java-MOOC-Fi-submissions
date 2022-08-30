
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int fact = Integer.valueOf(scanner.nextLine());
        int a = fact - 1;
        
        for(; a > 0; a--){
            fact = fact * a;
        }
        System.out.println("Factorial: " + fact);
        
    }
}
