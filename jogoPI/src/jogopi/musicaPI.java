/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogopi;
import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
/**
 *
 * @author olive
 */
public class musicaPI {
     static void playMusic(String musicLocation){
        Scanner s = new Scanner(System.in);
        
        try{
            File musicPath = new File (musicLocation);
            if (musicPath.exists()) {
                        AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioInput);
                        clip.start();
                        s.nextLine();
                        clip.stop();
                        
            }
            else{
                System.out.println("Arquivo não encontrado");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
