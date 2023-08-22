/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionay;

    //constructor
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionay = dictionary;
    }

    /*The start() method will work as follows:

1.The method asks the user for a command
2.If the command is end, the UI prints the string "Bye bye!" and the execution of the start method ends.
3.If the command is add, the text UI asks the user for a word and a translation, each on its own line.
    After this the words are stored in the dictionary, and the method continues by asking for a new command (loops back to stage 1).
4.If the command is search, the text UI asks the user for the word to be translated. After this it prints the translation of the word, 
    and the method continues by asking for a new command (loops back to stage 1).
Otherwise the text UI prints the message Unknown command and asks for a new command, so it loops back to step 1.

     */
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();

                this.dictionay.add(word, translation);
            } else if (command.equals("search")) {
                System.out.println("To be translated:");
                String translated = scanner.nextLine();
                if (this.dictionay.translate(translated)==null) {
                    System.out.println("Word " + translated + " was not found");
                } else {
                    System.out.println("Translation: " + this.dictionay.translate(translated));

                }
            } else {
                System.out.println("Unknown command");
            }

        }
    }

}
