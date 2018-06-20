/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Words;

import glory.schema.VariableElement;
import glory.schema.WordElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import score_system.letter_score;

/**
 *
 * @author Suhasini
 */
public class WordUnscrambler {
    
    public List<WordElement> GetAnagramsList(String toUnscramble){
    List<WordElement> newWordList= new ArrayList<WordElement>();
        try{
            // Check if arguments were passed
            int length=0;         
   
            length=(toUnscramble.length()>0)? toUnscramble.length():0;
            
            String[] inputword = new String[length];
            // Detect if multiple arguments were passed
            Pattern pattern = Pattern.compile("\\s");
            Matcher matcher = pattern.matcher(toUnscramble);
            boolean found = matcher.find();
            
            if (found) {
                    String[] temp_input_arr = toUnscramble.split(" ");
                    length = temp_input_arr.length;
                    inputword = new String[length];
                    System.arraycopy(temp_input_arr, 0, inputword, 0, length);
            // Set inputword array to single word
            } else {
                    inputword[0] = toUnscramble;
                    length = 1;
            }
            
            // Create dictionary
		Dictionary dictionary = new Dictionary();
		List<String> myDict = dictionary.load();
		
		
		// Loop over all given words
		for (int x=0; x<length; x++) {
			int anagramsFound = 0;
			
			// Set word to unscramble
			WordElement unscramble = new WordElement();
			unscramble.setWord(inputword[x]);
			char[] letters = unscramble.getLetters();
			
			System.out.println("Searching for anagram of: " + inputword[x]);
			// Loop through each word in dictionary
			for (int i=0; i<myDict.size(); i++) {
				
				// Alphabetize word
				char[] dictLetters = myDict.get(i).toCharArray();
				Arrays.sort(dictLetters);
				
				// If dictionary word length matches
				if (dictLetters.length == unscramble.getLength()) {
					// If it's an anagram and not the same as the original word
					if (Arrays.equals(dictLetters, letters) && !myDict.get(i).equals(inputword[x])) {
						System.out.println(myDict.get(i));
						anagramsFound++;
                                                WordElement newWord=new WordElement();
                                                newWord.setWord(myDict.get(i));
                                                newWordList.add(newWord);
					} 
				} 
			}
			if (anagramsFound == 0) {
				System.out.println("No anagrams found.");
				anagramsFound = 0;
			} else {
				anagramsFound = 0;
			}
		}
                this.GetBestAnagram((ArrayList<WordElement>) newWordList);
                
            
            
        }catch(Exception ex){
            Logger.getLogger(WordUnscrambler.class.getName()).log(Level.SEVERE, null, ex);
        }
    return newWordList;   
    }
    public WordElement GetAnagramSingle(String toUnscramble){
		WordElement newWord= new WordElement();
		 try{
            // Check if arguments were passed
            int length=0;         
   
            length=(toUnscramble.length()>0)? toUnscramble.length():0;
            
            String[] inputword = new String[length];
            // Detect if multiple arguments were passed
            Pattern pattern = Pattern.compile("\\s");
            Matcher matcher = pattern.matcher(toUnscramble);
            boolean found = matcher.find();
            
            if (found) {
                    String[] temp_input_arr = toUnscramble.split(" ");
                    length = temp_input_arr.length;
                    inputword = new String[length];
                    System.arraycopy(temp_input_arr, 0, inputword, 0, length);
            // Set inputword array to single word
            } else {
                    inputword[0] = toUnscramble;
                    length = 1;
            }
            
            // Create dictionary
		Dictionary dictionary = new Dictionary();
		List<String> myDict = dictionary.load();
		
		
		// Loop over all given words
		for (int x=0; x<length; x++) {
			int anagramsFound = 0;
			
			// Set word to unscramble
			WordElement unscramble = new WordElement();
			unscramble.setWord(inputword[x]);
			char[] letters = unscramble.getLetters();
			
			System.out.println("Searching for anagram of: " + inputword[x]);
			// Loop through each word in dictionary
			for (int i=0; i<myDict.size(); i++) {
				
				// Alphabetize word
				char[] dictLetters = myDict.get(i).toCharArray();
				Arrays.sort(dictLetters);
				
				// If dictionary word length matches
				if (dictLetters.length == unscramble.getLength()) {
					// If it's an anagram and not the same as the original word
					if (Arrays.equals(dictLetters, letters) && !myDict.get(i).equals(inputword[x])) {
						System.out.println(myDict.get(i));
						anagramsFound++;
                                                //WordElement newWord=new WordElement();
                                                newWord.setWord(myDict.get(i));
                                                //newWordList.add(newWord);
					} 
				} 
			}
			if (anagramsFound == 0) {
				System.out.println("No anagrams found.");
				anagramsFound = 0;
			} else {
				anagramsFound = 0;
			}
		}
                //this.GetBestAnagram((ArrayList<WordElement>) newWordList);
                
            
            
        }catch(Exception ex){
            Logger.getLogger(WordUnscrambler.class.getName()).log(Level.SEVERE, null, ex);
        }
		return newWord;
	}
	
	
	
    public WordElement GetBestAnagram(ArrayList<WordElement> anagramList){
        WordElement bestAnagram=new WordElement();
       
        int[] tempWordLength = new int[anagramList.size()];
        int[] tempWordValue= new int[anagramList.size()];
        try{ 
           for(WordElement anagram:anagramList){                
                char[] letters=anagram.getLetters();
                int specialLetterValue=0;
                int letterValue=0;
                //calculate score gets for usage of special letters
                for(String specialLetter:VariableElement.SpecialLetterList){
                    if(Arrays.toString(letters).contains(specialLetter)){
                        
                        specialLetterValue=specialLetterValue+5;
                        
                        //remove special letter from the word to calculate other score
                        String tempWord=Arrays.toString(letters);
                        int indexOfSpecialLetter=tempWord.lastIndexOf(specialLetter);
                        StringBuilder sb=new StringBuilder(tempWord);
                        sb.deleteCharAt(indexOfSpecialLetter);
                        letters=sb.toString().toCharArray();
                    }                
                }
                //calculate score gets from letter points
                letter_score newLetterScore= new letter_score();
                letterValue=newLetterScore.Get_Score_by_Word(Arrays.toString(letters));
                
                //get longest word
                tempWordLength[anagramList.indexOf(anagram)]=anagram.getLength(); 
                
                tempWordValue[anagramList.indexOf(anagram)]=specialLetterValue+letterValue;
            }
           
           //calculate score for longest word
           int longest = tempWordLength[0];
           int longestIndex=0;
           for (int index = 1; index < tempWordLength.length; index ++) {
                if (tempWordLength[index] > longest) {
                        longest = tempWordLength [index];
                        longestIndex=index;
                }
                              
           }
           tempWordValue[longestIndex]=tempWordValue[longestIndex]+20;  
           
           //calculate final word value
            int wordValue=tempWordValue[0];
            int wordValueIndex=0;
            for (int index = 1; index < tempWordValue.length; index ++) {
                if (tempWordValue[index] > wordValue) {
                        wordValue = tempWordValue [index];
                        wordValueIndex=index;
                }                              
            }
            for(WordElement BestAnagram:anagramList){
                if(anagramList.indexOf(BestAnagram)==wordValueIndex){
                    bestAnagram=BestAnagram;
                }                
            }
            
           System.out.println(bestAnagram.getWord());
        }catch(Exception ex){
        Logger.getLogger(WordUnscrambler.class.getName()).log(Level.SEVERE, null, ex);
        }
    return bestAnagram;
    }

	public List<String> findValidWords(char letters[]){ //change to return WordElement List
        int []avail = new int[26];
        List<String> result = new ArrayList(); //make this WordElement List
		  // Create dictionary
                  
        try{
        Dictionary dictionary = new Dictionary();
        List<String> dict = dictionary.load();  // make this a cached List
		
        for(char c : letters){
            int index = c - 'a';
            avail[index]++;
        }
        
        for(String word: dict){
            int []count = new int[26];
            boolean ok = true;
            for(char c : word.toCharArray()){
                int index = c - 'a';
                count[index]++;
                if(count[index] > avail[index]){
                    ok = false;
                    break;
                }
            }
			// check if an anagram exists for combination
			
			
			//if there is an existing anagram then add to the result
            if(ok){
                String wordFromAnagram="";
                WordElement anagramWord=new WordElement();			
                anagramWord=this.GetAnagramSingle(word);
                if ((anagramWord.getWord()!="")&& anagramWord.getWord()!=null){				
                    result.add(word);
                }				
            }
            // if(ok){
				
                // result.add(word);
            // }
        }}catch(Exception ex){
        
        }
        return result;
    }
}
