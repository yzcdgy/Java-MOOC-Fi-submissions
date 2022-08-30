
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecordsFromAFile {

    public static void main(String[] args) {
        ArrayList<String[]> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                list.add(fileReader.nextLine().split(","));
            }
        } catch (IOException ex) {
            Logger.getLogger(RecordsFromAFile.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (String[] person : list) {
            System.out.print(person[0] + ", age: " + person[1] + " ");
            if (Integer.valueOf(person[1]) > 1 || Integer.valueOf(person[1]) == 0) {
                System.out.println("years");
            } else {
                System.out.println("year");
            }
        }

    }
}
