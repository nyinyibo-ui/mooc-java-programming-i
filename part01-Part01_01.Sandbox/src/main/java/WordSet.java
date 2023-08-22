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

public class WordSet {

    private ArrayList<String> wordSet;

    public WordSet() {
        wordSet = new ArrayList<>();
    }

    public void add(String word) {
        wordSet.add(word);
    }

    public boolean contains(String word) {
        return this.wordSet.contains(word);
    }

    public int countPalindrom() {
        int count = 0;
        for (String word : this.wordSet) {
            if (isPalindrom(word)) {
                count++;
            }
        }

        return count;
    }

    public boolean isPalindrom(String word) {
        int i = 0;
        int end = word.length() - 1;

        while (i<word.length()/2) {
            if(word.charAt(i)!=word.charAt(end-i)){
                return false;
            }
            i++;
        }
        return true;
    }
}
