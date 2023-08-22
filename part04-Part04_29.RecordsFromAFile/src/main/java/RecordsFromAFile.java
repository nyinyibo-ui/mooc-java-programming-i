
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // first ask user for the name of the file
        System.out.println("Name of the file:");
        String filePath=scanner.nextLine();
        
        try(Scanner fileScan=new Scanner(Paths.get(filePath))){
            while(fileScan.hasNextLine()){
                String line=fileScan.nextLine();
                
                String[] parts=line.split(",");
                String name=parts[0];
                int age=Integer.valueOf(parts[1]);
                System.out.println(name+", age: "+age+" years");
            }
        }catch(Exception e){
            System.out.println("Error: "+e);
        }

    }
}
