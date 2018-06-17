/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glory.schema;


/**
 *
 * @author Suhasini
 */
public class LetterValueElement extends WordElement{

private String letter;
private int score;
private String letterType;

    public LetterValueElement() { 
        
    }

    public LetterValueElement(String letter, int score, String letterType, int noOfLetters, char[] letters,String word) {
        super(noOfLetters, letters, word);
        this.letter = letter;
        this.score = score;
        this.letterType = letterType;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public void setLetterType(String letterType) {
        this.letterType = letterType;
    }
    
    public void setScore(int score) {
        this.score = score;
    }

    public String getLetter() {
        return letter;
    }

    public String getLetterType() {
        return letterType;
    }
     public int getScore() {
        return score;
    }
    

    
}
