
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        while (true) {
            System.out.println("Enter point totals, -1 stops:");
            String input = scanner.nextLine();
            
            if (input.equals("-1")) {
                break;
            }
            if (Integer.valueOf(input) < 0) {
                continue;
            }
            statistics.addGrade(Integer.valueOf(input));
        }
        
        System.out.println("Point average (all): " + statistics.allAverage());
        System.out.println("Point average (passing): " + statistics.passingAverage());
        System.out.println("Pass percentage: " + statistics.passPercentage());
        System.out.println("Grade distribution:");
        System.out.println(statistics.gradeDistribution());
    }
}
