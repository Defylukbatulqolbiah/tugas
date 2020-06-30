/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS1;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Satelit L630
 */
public class Player {

    static Player player = new Player();
    static Clip clip;

    private Player() {

    }

    public static Player getInstance() {
        return player;
    }

    public static void loadMusic(String filePath) {
        try {
            
           File musicPath = new File(filePath);
           if(musicPath.exists()){
               AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicPath);
               clip = AudioSystem.getClip();
               clip.open();
               System.out.println("kata kunci");
           }
        } catch (Exception e) {
            System.out.println("ya");
        }
    }

}
