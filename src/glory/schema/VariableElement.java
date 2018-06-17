/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glory.schema;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Hashane
 */
public class VariableElement extends GloryElement{

    
    
    private String variableName;
    private String variableType;
    private int variableSize;
    
    public static List<LetterValueElement> SpecialLetters= new ArrayList<LetterValueElement>();
   
    public static ArrayList<String> SpecialLetterList= new ArrayList<>();
    
    
    public VariableElement(String VariableName) {
        this.variableName = VariableName;
    }
    
    public String getVariableName() {
        return variableName;
    }
    
    public void setVariableName(String VariableName) {
        this.variableName = VariableName;
    }
    
//    public void KeepSpecialLetters(String[] specialLetters ){
//        
//        for(String letter:specialLetters){
//            LetterValueElement newSpecialLetter=new LetterValueElement();
//            newSpecialLetter.setLetter(letter);
//            this.SpecialLetters.add(newSpecialLetter);
//        }
//    }
//    
}
