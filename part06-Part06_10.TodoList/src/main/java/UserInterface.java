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

public class UserInterface {

    private Scanner scanner;
    private TodoList toDoList;

    public UserInterface(TodoList toDoList, Scanner scanner) {
        this.scanner = scanner;
        this.toDoList = toDoList;
    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            /*The command stop stops the execution of the loop, 
            after which the execution of the program advances out of the start method.
             */
            if (command.equals("stop")) {
                break;
            } /*
            The command add asks the user for the next task to be added.
            Once the user enters this task, it should be added to the to-do list.
             */ else if (command.equals("add")) {
                System.out.println("To add: ");
                String addition = scanner.nextLine();
                toDoList.add(addition);
            } /*
            The commmand list prints all the tasks on the to-do list
             */ else if (command.equals("list")) {
                toDoList.print();
            } /*
            The command remove asks the user to enter the id of the task to be removed. 
            When this has been entered, the specified task should be removed from the list of tasks.
             */ else {
                System.out.println("Which one is removed?");
                int removed = Integer.valueOf(scanner.nextLine());
                toDoList.remove(removed);
            }

        }
    }

}
