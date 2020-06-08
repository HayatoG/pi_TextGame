/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogopi;

/**
 *
 * @author olive
 */
public class musicasPI {
     public static void toca(){
        String filepath="menu.wav";
        musicaPI musicObject2 = new musicaPI();
        musicObject2.playMusic(filepath);
    }
    
}
