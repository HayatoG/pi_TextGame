package jogopi;
import java.util.Scanner;
import static jogopi.JogoPI.energiaInimigo;
import static jogopi.JogoPI.energiaJogador;

public class Quarto {
    static void quarto(){
        
        Scanner s = new Scanner(System.in);


        System.out.println("[PABLO]: Vicente, o que você está fazendo?" + "\n" + "Como pode fazer isso comigo depois de tantos anos juntos?");
        s.nextLine();
        System.out.println("[VICENTE]: Você não me deu escolha Pablo." + "\n" + "Precisava de você para conseguir os arquivos...");
        s.nextLine();
        System.out.println("[VICENTE]: AGORA NÃO PRECISO MAIS..." + "\n");

        System.out.println("(1) ATACAR | (2) CONVERSAR");
        

        if (s.hasNextInt()) {
            int decisao = s.nextInt();
                
            if (decisao > 2 || decisao < 1) {
                System.out.println("Coloque um número válido." + "\n");
            } 
            else if (decisao == 1) {
                energiaInimigo = 6;
                energiaJogador = 7;
                Batalhas.atacarInimigo();
            }
            else {
                Batalhas.conversarInimigo();
            }
        }
    }
}

    
    
    

