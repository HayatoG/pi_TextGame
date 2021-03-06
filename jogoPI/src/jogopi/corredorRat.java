package jogopi;
import java.util.concurrent.TimeUnit;
import static jogopi.JogoPI.s;

public class corredorRat {
    public static void corredor(){
        try{
        roteiro.verificacao2();
        if(JogoPI.Foto == false){
            System.out.println("\n" + "Você encontrou: FOTO");
            JogoPI.Foto = true;
            JogoPI.inventario[2]=JogoPI.fotoInvetario;
        }
        System.out.println("\n" + "(1) SALA | (2) COZINHA | (3) QUARTO  | (4) INVENTÁRIO | (5) MAPA");
        System.out.println("O que você quer olhar? ");
        int decisao;
        if (s.hasNextInt()) {
            decisao = s.nextInt();
            
            if (decisao > 5 || decisao < 1) {
                System.out.println("\n" + "Digite um número válido.");
                corredorRat.corredor();
            }
            else{
                switch(decisao){
                    case 1:
                        if (JogoPI.arma==false) {
                            System.out.println("\n" + "Ouço pessoas do outro lado da porta. Pode ser quem \n"
                                    + "me sequestrou.");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("\nMas estou desarmado não vou correr o risco.");
                            corredorRat.corredor();
                        }
                        else{
                            Sala.sala();
                        }
                    case 2:
                        System.out.println("\nVocê se esgueira pela porta da cozinha aberta para ver se não tem ninguém\n");
                         TimeUnit.SECONDS.sleep(4);
                         System.out.println("Não tem ninguém. Você está em uma cozinha velha, típica de uma casa de campo.\n"
                                 + "As gavetas estão abertas.\n");
                        System.out.println("Na cozinha você encontrou:\n");
                        TimeUnit.SECONDS.sleep(3);
                        System.out.println("REVOLVER CALIBRE .38\n");
                        JogoPI.inventario[3]=JogoPI.armaCozinha;
                        JogoPI.arma=true;
                        corredorRat.corredor();
                    case 3:
                        if (JogoPI.puzzled==false) {
                            System.out.println("\nOuço pessoas na sala. Estaria me arriscando ao tentar abrir essa porta.");
                            corredorRat.corredor();
                        }
                        else{
                           puzzles.puzzle2();
                        }
                    case 4:
                        inventario.inventario();
                        System.out.println("\nDeseja olhar a foto?");
                        System.out.println("(1)SIM /(2)NÃO");
                        int foto = s.nextInt();
                        if (foto==1) {
                            System.out.println("\nEste na foto. Me lembra um certo alguém... Faz muito tempo.");
                        }
                        else{
                          corredorRat.corredor();
                        }
                    case 5:
                        mapa.mapaCorredor();
                        corredorRat.corredor();
                }
            }
        } 
   }catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
        }
    }
}
