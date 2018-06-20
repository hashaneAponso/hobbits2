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
private int letterCount;
private int letterId;

    public LetterValueElement() { 
        
    }

    public LetterValueElement(String letter, int score, String letterType, int noOfLetters, char[] letters,String word,int letterCount, int letterId) {
        super(noOfLetters, letters, word);
        this.letter = letter;
        this.score = score;
        this.letterType = letterType;
        this.letterCount = letterCount;
        this.letterId = letterId;
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
     
     public void setLetterCount(int letterCount) {
        this.letterCount = letterCount;
    }
    
     public int getLetterCount() {
        return letterCount;
    }
     
    public void setLetterId(int letterId) {
        this.letterId = letterId;
    }
    
     public int getLetterId() {
        return letterId;
    }
     
}
