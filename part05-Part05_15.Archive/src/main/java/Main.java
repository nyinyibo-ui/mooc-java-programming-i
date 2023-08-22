
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create archives arraylist
        ArrayList<Archive> archives = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            //if id is empty break the loop
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String newName = scanner.nextLine();

            // if name is empty break the loop
            if (newName.isEmpty()) {
                break;
            }

            // make an archive object
            Archive archive = new Archive(identifier, newName);

            // only add into the archives list if the archive is not in the list already
            if (archives.contains(archive)) {
                continue;
            } else {
                archives.add(archive);

            }
        }

        for (Archive archive : archives) {
            System.out.println(archive);
        }
    }
}
