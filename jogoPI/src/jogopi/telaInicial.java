/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogopi;
import java.util.Scanner;
/**
 *
 * @author olive
 */
public class telaInicial {
    public static void telaInicio(){
        Scanner s = new Scanner(System.in);
        System.out.println(" ________  ________  _________        ___       ________  ________     \n" +
"|\\   __  \\|\\   __  \\|\\___   ___\\     |\\  \\     |\\   __  \\|\\   __  \\    \n" +
"\\ \\  \\|\\  \\ \\  \\|\\  \\|___ \\  \\_|     \\ \\  \\    \\ \\  \\|\\  \\ \\  \\|\\ /_   \n" +
" \\ \\   _  _\\ \\   __  \\   \\ \\  \\       \\ \\  \\    \\ \\   __  \\ \\   __  \\  \n" +
"  \\ \\  \\\\  \\\\ \\  \\ \\  \\   \\ \\  \\       \\ \\  \\____\\ \\  \\ \\  \\ \\  \\|\\  \\ \n" +
"   \\ \\__\\\\ _\\\\ \\__\\ \\__\\   \\ \\__\\       \\ \\_______\\ \\__\\ \\__\\ \\_______\\\n" +
"    \\|__|\\|__|\\|__|\\|__|    \\|__|        \\|_______|\\|__|\\|__|\\|_______|");   
        System.out.println("\n");
        System.out.println("Pressione [ENTER] para continuar...");
        s.nextLine();
        parte1.parte1();
        
    }
}
