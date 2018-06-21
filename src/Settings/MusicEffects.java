///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Settings;
//
//import java.net.URL;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.Clip;
//
///**
// *
// * @author Suhasini
// */
//public class MusicEffects {
//    
//	public Clip MusicOnOff(){
//		boolean MusicStatus=true; //make this a global static variable
//								  //it should be the value of music check box value from settings page
//		Clip clip = null;//=new Clip();
//		try{
//			if(MusicStatus){
//				// Open an audio input stream.
//				URL url = this.getClass().getClassLoader().getResource("gameover.wav");
//				AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
//				// Get a sound clip resource.
//				clip = AudioSystem.getClip();
//				// Open audio clip and load samples from the audio input stream.
//				clip.open(audioIn);
//				clip.start();	
//				clip.loop(Clip.LOOP_CONTINUOUSLY); 				
//			}
//		}catch(Exception ex){
//			Logger.getLogger(MusicEffects.class.getName()).log(Level.SEVERE, null, ex);
//		}
//		return clip;
//	}
//	
//	public boolean PlayScreenExitMusicOff(Clip musicClip){
//		boolean returnValue=false;
//		if(musicClip!=null){
//			if (clip.isRunning()) clip.stop();			
//		}		
//	}
//	
//}