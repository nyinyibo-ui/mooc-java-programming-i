
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        WordSet wordList=new WordSet();
        UserInterface userInterface=new UserInterface(wordList,scanner);
        userInterface.start();

          

          }
                  
    }

}
