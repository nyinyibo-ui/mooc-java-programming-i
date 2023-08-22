/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private WordSet words;

    public UserInterface(WordSet set,Scanner scanner) {
        this.scanner = scanner;
        this.words=set;
    }

    public void start() {
        // do something
        // looping and ending loop

        // stop condition
        while (true) {
            System.out.println("Enter a word: ");
            String word = scanner.nextLine();

            if (words.contains(word)) {
                break;
            }
            words.add(word);
        }
        int numPalindrom=words.countPalindrom();
        System.out.println("You gave the same word twice!");
        System.out.println("Number of Palindrom in the set "+numPalindrom);

    }



}
