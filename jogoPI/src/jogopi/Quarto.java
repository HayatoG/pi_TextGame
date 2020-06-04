package jogopi;
import java.util.Scanner;
public class Quarto {
    static void quarto(){
        
        Scanner s = new Scanner(System.in);

        System.out.println("A porta está trancada com o mesmo mecanismo do porão");

        //puzzle para abrir a porta
        System.out.println("[PABLO]: Vicente, o que você está fazendo?" + "\n" + "Como pode fazer isso comigo depois de tantos anos juntos?");
        s.nextLine();
        System.out.println("[VICENTE]: Você não me deu escolha Pablo." + "\n" + "Precisava de você para conseguir os arquivos...");
        s.nextLine();
        System.out.println("[VICENTE]: AGORA NÃO PRECISO MAIS..." + "\n");

        System.out.println("(1) ATACAR | (2) CONVERSAR");
        

        if (s.hasNextInt()) {
            int decisao = s.nextInt();
                int energiaInimigo = 6;
                int energiaJogador = 7;

            if (decisao > 2 || decisao < 1) {
                System.out.println("Coloque um número válido." + "\n");
            } 
            else if (decisao == 1) {
                Batalhas.atacarInimigo();
            }
            else {
                Batalhas.conversarInimigo();
            }
        }
    }
}

    
    
    

