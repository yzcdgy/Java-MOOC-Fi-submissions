
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String teamName;
        int gameCount = 0;
        int winCount = 0;
        int lossCount = 0;

        System.out.println("File:");
        ArrayList<String[]> gameInfo = new ArrayList<>();

        String fileName = scan.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                String[] info = fileReader.nextLine().split(",");
                gameInfo.add(info);
            }
        } catch (IOException ex) {
            Logger.getLogger(SportStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Team:");
        teamName = scan.nextLine();

        for (String[] match : gameInfo) {
            if (match[0].equals(teamName) || match[1].equals(teamName)) {
                gameCount++;
            }
            if (match[0].equals(teamName) && Integer.valueOf(match[2]) > Integer.valueOf(match[3])) {
                winCount++;
            }
            if (match[1].equals(teamName) && Integer.valueOf(match[2]) < Integer.valueOf(match[3])) {
                winCount++;
            }
            if (match[0].equals(teamName) && Integer.valueOf(match[2]) < Integer.valueOf(match[3])) {
                lossCount++;
            }
            if (match[1].equals(teamName) && Integer.valueOf(match[2]) > Integer.valueOf(match[3])) {
                lossCount++;
            }
        }

        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + lossCount);
    }

}
