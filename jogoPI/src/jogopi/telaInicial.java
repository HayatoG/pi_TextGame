package jogopi;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class telaInicial {
    public static void telaInicio(){
        Scanner s = new Scanner(System.in);
         try {
             System.out.println("POWERED BY...");
             System.out.println("                           _ \n" +
"   ___ __ _ _ __ ___   ___| |\n" +
"  / __/ _` | '_ ` _ \\ / _ \\ |\n" +
" | (_| (_| | | | | | |  __/ |\n" +
"  \\___\\__,_|_| |_| |_|\\___|_|\n" +
"                             \n" +
"");
         TimeUnit.SECONDS.sleep(4);
         
        } 
         catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
        }
                
                
        System.out.println(" ________  ________  _________        ___       ________  ________     \n" +
                "|\\   __  \\|\\   __  \\|\\___   ___\\     |\\  \\     |\\   __  \\|\\   __  \\    \n" +
                "\\ \\  \\|\\  \\ \\  \\|\\  \\|___ \\  \\_|     \\ \\  \\    \\ \\  \\|\\  \\ \\  \\|\\ /_   \n" +
                " \\ \\   _  _\\ \\   __  \\   \\ \\  \\       \\ \\  \\    \\ \\   __  \\ \\   __  \\  \n" +
                "  \\ \\  \\\\  \\\\ \\  \\ \\  \\   \\ \\  \\       \\ \\  \\____\\ \\  \\ \\  \\ \\  \\|\\  \\ \n" +
                "   \\ \\__\\\\ _\\\\ \\__\\ \\__\\   \\ \\__\\       \\ \\_______\\ \\__\\ \\__\\ \\_______\\\n" +
                "    \\|__|\\|__|\\|__|\\|__|    \\|__|        \\|_______|\\|__|\\|__|\\|_______|");   
        System.out.println("\n");
        System.out.println("Pressione [ENTER] para continuar...");
        musicasPI.toca();
        Porao.porao();
    }
}
