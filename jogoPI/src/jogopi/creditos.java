/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogopi;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author olive
 */
public class creditos {
    static void creditos(){
        try{
        JogoPI.finalj=true;
        System.out.println("FINAL DO JOGO");
       TimeUnit.SECONDS.sleep(4);
       System.out.println("POWERED BY...");
             System.out.println("                           _ \n" +
"   ___ __ _ _ __ ___   ___| |\n" +
"  / __/ _` | '_ ` _ \\ / _ \\ |\n" +
" | (_| (_| | | | | | |  __/ |\n" +
"  \\___\\__,_|_| |_| |_|\\___|_|\n" +
"                             \n" +
"");
       
        System.exit(0);
        }
        catch(InterruptedException ie){
                Thread.currentThread().interrupt();
      }
    }
}
