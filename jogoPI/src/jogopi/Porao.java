package jogopi;

import java.util.concurrent.TimeUnit;
import static jogopi.JogoPI.s;

public class Porao {
    static void porao(){
        try{
        if (JogoPI.nomeJogador.isEmpty()) {
        System.out.println("INSIRA SEU NOME:");
        JogoPI.nomeJogador= s.nextLine();
        JogoPI.nomePlayer = JogoPI.nomeJogador.toUpperCase();
        }
        roteiro.verificacao1();
       
        if (JogoPI.Itens == false) {
            System.out.println("\n" +"(1) CAIXAS | (2) PORTA | (3) ESTANTE  ");
            System.out.println("O que você quer olhar?");
        }
        else{
            System.out.println("\n" + "(1) CAIXAS | (2) PORTA | (3) ESTANTE | (4)INVENTÁRIO | (5) MAPA");
            System.out.println("O que você quer olhar?");
        }
        if(s.hasNextInt()){
            int decisão = s.nextInt();
                
            if (decisão > 5 || decisão < 1) {
                System.out.println("\n" + "Coloque um número válido." + "\n");
                Porao.porao();
            }
            else{
                switch(decisão){
                    case 1:
                        if (JogoPI.Lanterna==true) {
                            System.out.println("\n" + "Conseguindo enxergar melhor com a lanterna \n"
                                    + "Você encontra: ");
                            TimeUnit.SECONDS.sleep(3);
                            System.out.print("\nGAZUA\n");
                            JogoPI.inventario[1]= JogoPI.gazuaCaixas;
                            JogoPI.gazua=true;
                            JogoPI.Itens=true;
                            Porao.porao();
                        } 
                        else{
                        System.out.println("\n" + "Está muito escuro aqui..." + "\n"); 
                        Porao.porao();
                        }
                         
                    case 2:
                        if (JogoPI.gazua==false) {
                        System.out.println("\n" + "Está trancada." + "\n");
                        Porao.porao();    
                        }
                        else{
                            System.out.println("\n" + "Hmm, interessante... posso usar a gazua \npara abrir essa porta"+ "\n");
                            TimeUnit.SECONDS.sleep(2);
                             puzzles.puzzle1();
                        }
                    case 3:
                        if(JogoPI.Lanterna==true){
                            System.out.println("Não tem mais nada aqui.");
                        }
                        else{
                        JogoPI.inventario[0]= JogoPI.lanternaEstante;
                        JogoPI.Lanterna=true;
                        JogoPI.Itens=true;
                        System.out.println("\n" + "Você encontrou: " );
                        TimeUnit.SECONDS.sleep(3);
                            System.out.println("\nLANTERNA");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("\nMAPA");
                        Porao.porao();
                        }
                    case 4:
                        inventario.inventario();
                        Porao.porao();
                    
                    case 5:
                        mapa.mapaPorao();
                        Porao.porao();
                }
            }
        }
        else{
            System.out.println("\n" + "Opção inválida." + "\n");
            Porao.porao();
        }
    } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
        }
  } 
}
