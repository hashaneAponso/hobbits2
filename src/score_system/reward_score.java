/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package score_system;

import DatabaseClass.DBConnection;
import Player.Login;
import java.lang.Math;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author harmlk
 */
public class reward_score {
    
    public int find_reward(double score_){
        //return the reward to the longest word
        double reward_;
        
        reward_ = score_ * 0.5;
        reward_ = Math.round(reward_);
        
        Double d = reward_;
        int reward__ = d.intValue();

        return reward__;
    }
    
    public void add_reward(int reward_, int player_id_){
        //adds the reward to the score
        //set values in temp table
        DBConnection db = new DBConnection();
        
        temp_score obj_score = new temp_score();
        int score_ = obj_score.get_temp_score(player_id_);
        
        int score_with_reward_ = find_reward(score_);
                
        try{
            String query="UPDATE temp_tab SET score = '"+score_with_reward_+"' WHERE player_id = '"+player_id_+"'";  

           PreparedStatement statement= db.InsertUpdate(query);     
               statement.executeUpdate();
               statement = null;           
        }catch(Exception ex){
         Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }
    
}
