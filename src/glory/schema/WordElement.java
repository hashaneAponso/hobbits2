/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glory.schema;

import java.util.Arrays;

/**
 *
 * @author Suhasini
 */
public class WordElement {

    private int noOfLetters;
    private char[] letters;
    private String word;
    

    public WordElement() {
    }

    public WordElement(int noOfLetters, char[] letters, String word) {
        this.noOfLetters = noOfLetters;
        this.letters = letters;
        this.word = word;
    }

    public char[] getLetters() {
        return letters;
    }

    public void setLetters(char[] letters) {
        this.letters = letters;
    }

    public int getNoOfLetters() {
        return noOfLetters;
    }
    
    public int getLength() {        
        return this.word.length();
    }

    public void setNoOfLetters(int noOfLetters) {
        this.noOfLetters = noOfLetters;
    }


    public String getWord() {
        return word;
    }

    public void setWord(String newWord) {
        word = newWord;
        letters = word.toCharArray();
        this.noOfLetters=letters.length;
        Arrays.sort(letters);
    }

    public String WordDef(String letter1, String letter2, String letter3, String letter4, String letter5,
            String letter6, String letter7, String letter8, String letter9, String letter10, String letter11) {

        word = letter1 + letter2 + letter3 + letter4 + letter5 + letter6 + letter7 + letter8 + letter9 + letter10 + letter11;

        String[] wordArray = {letter1, letter2, letter3, letter4, letter5, letter6, letter7, letter8, letter9, letter10, letter11};
        ScoreElement se = new ScoreElement();
        se.initialLetters(wordArray, letter1, letter1, letter1, 0);
        return word.trim();
    }

    public int noOfLetters(String word) {
        noOfLetters = word.trim().length();
        return noOfLetters;
    }
}
