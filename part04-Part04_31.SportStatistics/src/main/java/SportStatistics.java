
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //ask the user for file name;
        System.out.println("File: ");
        String file = scan.nextLine();
        ArrayList<Match> matches = storeMatches(file);

        //ask the user for specific team name
        System.out.println("Team: ");
        String teamName = scan.nextLine();

        System.out.println("Games: "+getMatchStatistics(teamName, matches)[0]);
        System.out.println("Wins: "+getMatchStatistics(teamName, matches)[1]);
        System.out.println("Losses: "+getMatchStatistics(teamName,matches)[2]);

    }

    public static Integer[] getMatchStatistics(String teamName, ArrayList<Match> matches) {
        int matchCount = 0;
        int wins = 0;
        int loss = 0;
        
        //to search every single match
        for (Match match : matches) {
            // if the search team is home team increase its' match count
            if (match.getHomeTeam().equals(teamName)) {
                matchCount++;
                // if it also win the match increase its win count and if not increas loss count
                if (match.getHomeTeamScore() > match.getAwayTeamScore()) {
                    wins++;
                } else {
                    loss++;
                }
              
                //if the search team is away team increase it's match count
            } else if (match.getAwayTeam().equals(teamName)) {
                matchCount++;
                // if it also win the match increase its win count and if not increase loss count
                if (match.getAwayTeamScore() > match.getHomeTeamScore()) {
                    wins++;
                } else {
                    loss++;
                }
            }
        }
        
        // store three statistics of the searched tema into the matchStatistics array
        Integer[] matchStatistics = {matchCount, wins, loss};
        return matchStatistics;
    }

    public static ArrayList<Match> storeMatches(String file) {
        ArrayList<Match> matches = new ArrayList<>();

        //read the file and return error if not exist
        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeTeamScore = Integer.valueOf(parts[2]);
                int awayTeamScore = Integer.valueOf(parts[3]);

                matches.add(new Match(homeTeam, awayTeam, homeTeamScore, awayTeamScore));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return matches;
    }

}
