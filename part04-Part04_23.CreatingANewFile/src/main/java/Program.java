
import java.util.Scanner;
import java.nio.file.Paths;

public class Program {

    public static void main(String[] args) {
        // you don't need to do anything here...
        try(Scanner scanner=new Scanner(Paths.get("file.txt"))){
            while(scanner.hasNextLine()){
                String row=scanner.nextLine();
                System.out.println(row);
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
