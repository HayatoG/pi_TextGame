package jogopi;
import static jogopi.JogoPI.aleatorio;
import static jogopi.JogoPI.energiaInimigo;
import static jogopi.JogoPI.energiaJogador;
import static jogopi.JogoPI.s;

public class Sala {

    static void sala(){
        //Colocar validação caso o usuário coloque String
        //sala
        
        
        System.out.println("Um deles está dormindo...");
        System.out.println("(1) ATIRAR");
        
        if(s.hasNextInt()){
        int decisao = s.nextInt();
        
            if(decisao > 2 || decisao < 1){
                System.out.println("Coloque um número válido." + "\n");
                Sala.sala();
            }
            else{
                switch(decisao){
                    case 1:
                        System.out.println("Sequestrador morto...");
                        s.nextLine();
                        System.out.println("Encontrei uma chave de carro e essa faca.");
                        System.out.println("Talvez a faca seja útil.");
                        JogoPI.ChaveCarro = true;
                        JogoPI.faca = true;
                    case 2:
                        System.out.println("Droga! Tem mais!?");
                        System.out.println("(1) ATIRAR | (2) SE EXPLICAR COM O SEQUESTRADOR");
                        int segundadecisao = s.nextInt();
                        if(segundadecisao == 1){
                            Batalhas.atirarInimigo();
                            JogoPI.puzzled=true;
                            System.out.println("Certo, Só me sobrou esse quarto...");
                            System.out.println("[ENTER] - Para continuar.");
                            s.nextLine();
                            corredorRat.corredor();
                        }
                        else if(segundadecisao == 2){
                            System.out.println("[DIALOGO DA EXPLICAÇÃO]");
                            System.out.println("[ENTER] - Para continuar.");
                            s.nextLine();
                            JogoPI.puzzled=true;
                            System.out.println("Certo, agora vamos pro quarto...");
                            System.out.println("[ENTER] - Para continuar.");
                            s.nextLine();
                            System.out.println("Ele deve estar lá nos esperando...");
                            System.out.println("[ENTER] - Para continuar.");
                            s.nextLine();
                            corredorRat.corredor();
                        }
                        else{
                            System.out.println("Digite um número válido!!");
                            decisao = 2;
                        }
                }
            }
        }
    }
}
