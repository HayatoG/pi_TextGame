package jogopi;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static jogopi.JogoPI.energiaInimigo;
import static jogopi.JogoPI.energiaJogador;

public class Quarto {
    static void quarto(){
        try{
        Scanner s = new Scanner(System.in);
        TimeUnit.SECONDS.sleep(3);
        System.out.println("[" + JogoPI.nomePlayer + "]" + " Vicente, o que você está fazendo?" + " "
                + "como pode fazer isso comigo depois de tantos anos juntos?\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("[VICENTE] Você não me deu escolha " + JogoPI.nomePlayer);
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Precisava de você para conseguir os arquivos...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("[VICENTE] AGORA NÃO PRECISO MAIS..." + "\n");
        TimeUnit.SECONDS.sleep(2);
        
        System.out.println("(1) ATACAR | (2) CONVERSAR");

        if (s.hasNextInt()) {
            int decisao = s.nextInt();
                
            if (decisao > 2 || decisao < 1) {
                System.out.println("Coloque um número válido." + "\n");
            } 
            else if (decisao == 1) {
                energiaInimigo = 6;
                energiaJogador = 6;
                Batalhas.atacarInimigo();
            }
            else {
                Batalhas.conversarInimigo();
            }
        }
    }catch(InterruptedException ie){
            Thread.currentThread().interrupt();
      }
    }
}
    

    
    
    

