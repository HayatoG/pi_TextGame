package jogopi;
import java.util.Scanner;

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
