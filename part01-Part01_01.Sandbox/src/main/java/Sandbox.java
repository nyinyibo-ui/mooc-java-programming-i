
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        while(true){
            System.out.println("Enter names and age separated by comma");
            String line=scanner.nextLine();
            if(line.equals("")){
                break;
            }
            
            String [] parts=line.split(",");
            String name=parts[0];
            
            int age=Integer.valueOf(parts[1]);
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
        
        }
    }

  
