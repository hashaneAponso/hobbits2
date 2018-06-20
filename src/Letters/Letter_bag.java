/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Letters;

import DatabaseClass.DBConnection;
import glory.schema.LetterValueElement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Harini
 */
public class Letter_bag {
        
    public List<LetterValueElement> get_available_letters(){
    List<LetterValueElement> returnList=new ArrayList<LetterValueElement>();
    ArrayList<String> specialLetters= new ArrayList<String>();
        try {
              
                DBConnection dbManager=new DBConnection();
                String query="SELECT * FROM letter";
                ResultSet rst= (ResultSet) dbManager.fetch(query);
                while(rst.next()){
                    LetterValueElement newLetter= new LetterValueElement();
                    newLetter.setLetter(rst.getString("letter"));
                    newLetter.setLetterCount(rst.getInt("noOfLetters"));
                    returnList.add(newLetter);
                    specialLetters.add(rst.getString("letter"));
                }               
            } catch (Exception ex) {
                Logger.getLogger(Letter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return returnList;
    }
    
    //Create an array of letter count
    public int[] letter_count_array(){
        Letter_bag obj_bag = new Letter_bag();
			  
        List<LetterValueElement> mylist= new ArrayList<LetterValueElement>();
	mylist=obj_bag.get_available_letters();
                          
//	System.out.println("All letters");
//        for(LetterValueElement vall:mylist){
//            System.out.println(vall.getLetterCount());
//        }
        
        int[] letter_count = new int[26];
        
        int i = 0;
        
        for(LetterValueElement vall:mylist){
            letter_count[i] = vall.getLetterCount() ;
            i++;
        }
        
        return letter_count;
    }
    
    //Create an array of taken letter count
    public int[] taken_letter_count_array(){
        int[] taken_letter_count = new int[26];
        return taken_letter_count;
    }
    
    public int get_letter_count(int letter_id, int letter_count[]){
        return letter_count[letter_id-1];
    }
    
    //Checks whether the letters are available or not
    public boolean check_availability(int letter_id, int letter_count[], int taken_letter_count[]){
        
        int letter_count_ = get_letter_count(letter_id, letter_count);
        if(taken_letter_count[letter_id-1] >= letter_count_){
            return false;
        }
        else{
            set_taken_letters(letter_id,taken_letter_count);
            return true;
        }
    }
    
    public void set_taken_letters(int letter_id, int taken_letter_count[]){
        taken_letter_count[letter_id-1] = taken_letter_count[letter_id-1] + 1;
    }
    
    //1st call
    public String get_letter(String letter_type, int letter_count[], int taken_letter_count[], LetterValueElement letterType_obj, Letter obj){
        
        int letter_id = 0;
        String letter_ = "";
        
        switch (letter_type) {
            
            case "vowel": 
                
                do{ letterType_obj = obj.SelectVowel();
                    letter_id = letterType_obj.getLetterId();
                    //System.out.println("selected vowel letter : " + letterType_obj.getLetter()); 
                    }while(!check_availability(letter_id, letter_count, taken_letter_count));
                letter_= letterType_obj.getLetter();
                break;

            case "consonant": 
                
                do{ letterType_obj = obj.SelectConsonants();
                    letter_id = letterType_obj.getLetterId();
                    //System.out.println("selected consonant letter : " + letterType_obj.getLetter()); 
                    }while(!check_availability(letter_id, letter_count, taken_letter_count));
                letter_= letterType_obj.getLetter();
                break;

            case "special": 
                for (int i = 0; i<3 ; i++){
                    do{ letterType_obj = obj.SelectSpecial();
                    letter_id = letterType_obj.getLetterId();
                    //System.out.println("selected special letter : " + letterType_obj.getLetter()); 
                    }while(!check_availability(letter_id, letter_count, taken_letter_count));
                    letter_= letter_ + letterType_obj.getLetter();
                }
                break;
                //text.charAt(0); get character by index         
            default:
                break;
        }
        
        return letter_;
    }
    
    
    
    
    
    
    //----------------------------------------------------------------------------------test in main
//                          String notes = "";
//                          System.out.println("Show letters");
//                          Letter obj= new Letter();
//                          LetterValueElement letterType_obj=new LetterValueElement();
//                          Letter_bag obj_bag = new Letter_bag();
//                          //String letter_type = "consonant";
//                          //String letter_type = "vowel";
//                          //String letter_type = "special";
//                          
//                          int[] letter_count = obj_bag.letter_count_array();
//                          int[] taken_letter_count = obj_bag.taken_letter_count_array();
//                         
//                          notes = obj_bag.get_letter(letter_type, letter_count, taken_letter_count, letterType_obj, obj);
//                          
//                          System.out.println("result : " + notes);
    //----------------------------------------------------------------------------------
       
    
}
