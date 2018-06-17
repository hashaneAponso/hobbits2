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
public class length_score {
    
    //finds the score by the length of the word
    //The longest word must win
    
    //1
    public int[][] sort_longest_words(String words[], int player_ids[]){
        //get the score
        //get the word length

        int max_length_ = 0;
        int player_id_ = 0;
        
        int[][] sorted_list_words_ = new int[2][player_ids.length];
        
        
        for(int i = 1; i <= words.length ; i++){
            for(int j = 0; j < words.length ; j++){
                if(words[j].length() > max_length_){
                    max_length_ = words[j].length();
                    player_id_ = player_ids[j];
                }
            
                sorted_list_words_[0][i] = player_id_;
                sorted_list_words_[1][i] = max_length_;
                sorted_list_words_[2][i] = i;
            }
        }
        
        return sorted_list_words_;
    }
    
    public int get_place_by_length(int players_id_place[][], int player_id){
        int place_ = 0;
        
        for(int i = 1; i <= players_id_place.length ; i++){
            if(players_id_place[0][i] == player_id){
                place_ = players_id_place[1][i];
            }
        }
        
        return place_;
    }
       
    //2
    public int get_length_score(int player_id, int list_[][]){
        int length_score = 0;
        int place_ = 0;
        
        place_ = get_place_by_length(list_, player_id);
        
        switch (place_) {
            case 1:length_score = 20;
                break;
            case 2:length_score = 15;
                break;
            case 3:length_score = 10;
                break;
            case 4:length_score = 5;
                break;
            default:
                break;
        }
        
        return length_score;
    }
    
    
}
