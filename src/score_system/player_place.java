/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package score_system;

/**
 *
 * @author harmlk
 */
public class player_place {
    
    //call to get the list of places
    public int[][] calc_place(int player_id[],int no_of_players){
        
        int score[][] = this.create_array_of_players_and_score(player_id, no_of_players);
        
        //returns the place of each player
        
        int[][] new_score = new int[3][score[0].length];
        
        int max_score_ = 0;
        int val =0;
        
        for(int i = 1; i <= score[0].length; i++){
            max_score_ = 0;
            
            for(int j = 0; j < score[0].length ; j++){
                if(score[0][j] != 0){
                   if(score[1][j] > max_score_){
                       
                        max_score_ = score[1][j];
                        val = j;
                    } 
                }                
            }
            
            new_score[0][i-1] = score[0][val];
            new_score[1][i-1] = max_score_;
            new_score[2][i-1] = i;
            
            score[0][val] = 0; 
        }
        
        return new_score;
    }
    
    public int get_place(int place_array_[][], int player_id_){
        int place_ = 0;
        
        for(int i = 0; i < place_array_[0].length; i++){
            if(place_array_[0][i] == player_id_){
                place_ = place_array_[2][i];
            }
        }
        return place_;
    }
    
    //create an array of player id and score according to number of users connected to the game
    public int[][] create_array_of_players_and_score(int player_id[], int no_of_players){
        int[][] places_;
        
        temp_score obj_score = new temp_score();
        
        int p1 = player_id[0];
        int p2 = player_id[1];
        int p3 = player_id[2];
        int p4 = player_id[3];
        
        switch (no_of_players) {
            case 2:
                places_ = obj_score.create_all_temp_score_array(p1, p2);
                break;
            case 3:
                places_ = obj_score.create_all_temp_score_array(p1, p2, p3);
                break;
            case 4:
                places_ = obj_score.create_all_temp_score_array(p1, p2, p3, p4);
                break;
            default:
                places_ = null;
                break;
        }

        return places_;
    }
    
}