/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Glory_GUI.LoadingScreen;
import Glory_GUI.LoginForm;
import Letters.Letter;
import Letters.Letter_bag;
import Words.WordUnscrambler;
import glory.schema.LetterValueElement;
import glory.schema.WordElement;
import java.util.ArrayList;

/**
 *
 * @author Nisal Silva
 */
public class Glory {
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
              //  IntroVideo intro = new IntroVideo();
              //  intro.setVisible(true);  
                LoginForm play = new LoginForm();
                play.setVisible(true);
                //play.setExtendedState(play.getExtendedState() | Frame.MAXIMIZED_BOTH);
                
//                WordUnscrambler obj= new WordUnscrambler();
//                //obj.GetAnagramsList("zoopoo");
//                String word="aabderipoln";
//                ArrayList<WordElement> newList=obj.findValidWords(word.toCharArray());
//                for(WordElement ww:newList){
//                    System.out.println(ww.getWord());
//                }
//                  WordElement newWord=new WordElement();
//                  newWord=obj.GetBestAnagram(newList);
//                    System.out.println("BEST ANAGRAM = "+newWord.getWord());
                //test for score 
//                int no_of_players = 3;
//                int no_of_bonus_letters_ = 3;
//                int player_id_ = 22;
//                String word_ = "testword";
//                String unused_letters_ = "zhr";
//                
//                score_system.temp_score obj_score = new score_system.temp_score();
//                int score_ = obj_score.calc_temp_score(word_, no_of_players, unused_letters_, no_of_bonus_letters_);
//                System.out.println("final score : " + score_);
//                
                                

                //test for player's place
                //returns a sorted array 
                    //1st column player id
                    //2nd column score
                    //3rd column place
//                int[][] score = new int[][] {
//                    new int[] {33, 22, 44}, // player_id
//                    new int[] {3, 1 , 16}, //  score
//                };
//                score_system.player_place obj_place = new score_system.player_place();
//                int[][] array_place = obj_place.find_place(score);
//                
//                System.out.println("Array : " + Arrays.deepToString(array_place));  
//                
//                
//                //test for trophies & place
//                int place_ = obj_place.get_place(array_place, player_id_);
//                System.out.println("Players place : " + place_);
//                score_system.trophies obj_tr = new score_system.trophies();
//                int trophies_ = obj_tr.calc_trophies(place_, 3);
//                System.out.println("trophies : " + trophies_);


//get a letter vowel/consonant/special
                          String notes = "";
                          System.out.println("Show letters");
                          Letter obj1= new Letter();
                          LetterValueElement letterType_obj=new LetterValueElement();
                          Letter_bag obj_bag = new Letter_bag();
                          //String letter_type = "consonant";
                          String letter_type = "vowel";
                          //String letter_type = "special";
                          
                          int[] letter_count = obj_bag.letter_count_array();
                          int[] taken_letter_count = obj_bag.taken_letter_count_array();
                         
                          //this method should be called several times to get several letters
                          //change the first parameter to change the letter type vowel/consonant/special
                          notes = obj_bag.get_letter(letter_type, letter_count, taken_letter_count, letterType_obj, obj1);
                          
                          System.out.println("result : " + notes);
                                        
            }
        });
    }
    
}
