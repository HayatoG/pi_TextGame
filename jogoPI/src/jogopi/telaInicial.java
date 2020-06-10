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
                
                
        System.out.println(" _______  _______ _________       _        _______  ______  \n" +
"(  ____ )(  ___  )\\__   __/      ( \\      (  ___  )(  ___ \\ \n" +
"| (    )|| (   ) |   ) (         | (      | (   ) || (   ) )\n" +
"| (____)|| (___) |   | |         | |      | (___) || (__/ / \n" +
"|     __)|  ___  |   | |         | |      |  ___  ||  __ (  \n" +
"| (\\ (   | (   ) |   | |         | |      | (   ) || (  \\ \\ \n" +
"| ) \\ \\__| )   ( |   | |         | (____/\\| )   ( || )___) )\n" +
"|/   \\__/|/     \\|   )_(         (_______/|/     \\||/ \\___/ \n" +
"                                                            \n" +
"" +
"");   
        System.out.println("\n");
        System.out.println("Pressione [ENTER] para continuar...");
        musicasPI.toca();
        Porao.porao();
    }
}
