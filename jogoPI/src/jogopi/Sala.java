package jogopi;
import java.util.concurrent.TimeUnit;
import static jogopi.JogoPI.aleatorio;
import static jogopi.JogoPI.chaveCarroInventario;
import static jogopi.JogoPI.energiaInimigo;
import static jogopi.JogoPI.energiaJogador;
import static jogopi.JogoPI.s;

public class Sala {

    static void sala(){
        try{
        
        if(JogoPI.salaBatalha == true){
            System.out.println("\nResta apenas este morto aqui...");
            corredorRat.corredor();
        }
        else if (JogoPI.erva == false){
            System.out.println("\nUm deles está dormindo...");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\nna sala você encontra: ");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("ERVA\n");
            JogoPI.inventario[4]= JogoPI.ervinhaCura;
            JogoPI.erva=true;
            Sala.sala();
        } 
        else {
            System.out.println("(1) ATIRAR | (2) INVENTÁRIO");

            if(s.hasNextInt()){
            int decisao = s.nextInt();

                if(decisao > 2 || decisao < 1){
                    System.out.println("Coloque um número válido." + "\n");
                    Sala.sala();
                }
                else{
                    switch(decisao){
                        case 1:
                            System.out.println("*POW!*POW!*");
                            TimeUnit.SECONDS.sleep(3);
                            System.out.println("Sequestrador morto...");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("\nno sequestrador você encontra:");
                            TimeUnit.SECONDS.sleep(3);
                            System.out.println("\nFACA");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("\nCHAVE DO CARRO");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("\nTalvez a faca seja útil...");
                            JogoPI.ChaveCarro = true;
                            JogoPI.inventario[5]=chaveCarroInventario;
                            JogoPI.faca = true;
                            System.out.println("\nDroga! Tem mais um deles!\n");
                            System.out.println("(1) ATIRAR | (2) SE EXPLICAR COM O SEQUESTRADOR");
                            int segundadecisao = s.nextInt();
                            if(segundadecisao == 1){
                                Batalhas.atirarInimigo();
                                JogoPI.salaBatalha=true;
                                JogoPI.puzzled=true;
                                System.out.println("Certo, agora posso ir no quarto...");
                                corredorRat.corredor();
                            }
                            else if(segundadecisao == 2){
                                roteiro.salaConversa();
                                corredorRat.corredor();
                            }
                            else{
                                System.out.println("Digite um número válido!!");
                                decisao = 2;
                            }
                        case 2:
                            inventario.inventario();
                            Sala.sala();
                    }
                }
            }
        }
    } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
        }
   }
}

