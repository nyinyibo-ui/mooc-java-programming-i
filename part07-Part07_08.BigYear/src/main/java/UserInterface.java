/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
import java.util.*;

public class UserInterface {

    private Scanner scanner;
    private BirdRegister register;

    public UserInterface(Scanner scanner,BirdRegister register) {
        this.scanner = scanner;
        this.register=register;
    }

    public void start() {
        readCommand();
        System.out.println(register.getList());
    }

    public void readCommand() {
        while (true) {
            System.out.println("?");
            String command = scanner.nextLine();
            
            if (command.equals("Quit")){
                break;
            }else if(command.equals("Add")){
                add();
            }else if (command.equals("Observation")){
                observation();
            }
        }
    }
    
    public void add(){
        System.out.println("Name: ");
        String name=scanner.nextLine();
        System.out.println("Name in Latin");
        String latinName=scanner.nextLine();
        
        register.addBird(new Bird  (name,latinName));
    }
    
    public void observation(){
        System.out.println("Bird?");
        String name=scanner.nextLine();
        
        boolean foundBird=register.observeBird(name);
        if(foundBird==false){
            System.out.println("Not a bird!");
        }
    }
}
