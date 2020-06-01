package jogopi;
import java.util.Scanner;

public class parte4 {
    static void parte4(){
        //Colocar validação caso o usuário coloque String
        //sala
        Scanner s = new Scanner(System.in);
        
        System.out.println("Um deles está dormindo...");
        System.out.println("(1) ATACAR COM A FACA | (2) ATACAR COM A ARMA");
        System.out.print("Como você deseja atacar? :");
                
        if(s.hasNextInt()){
        int decisao = s.nextInt();
        
            if(decisao > 2 || decisao < 1){
                System.out.println("Coloque um número válido." + "\n");
                parte4.parte4();
            }
            else{
                switch(decisao){
                    case 1:
                        System.out.println("Sequestrador morto...");
                        System.out.println("Encontrei uma chave de carro.");
                        JogoPI.ChaveCarro = true;
                        //threadsleep
                        corredorRat.corredor();
                    case 2:
                        System.out.println("Droga! Tem mais!?");
                        System.out.println("(1) ATACAR COM FACA | (2) SE EXPLICAR COM O SEQUESTRADOR");
                        int segundadecisao = s.nextInt();
                        if(segundadecisao == 1){
                            System.out.println("Mais um morto, agora eu posso resolver o puzzle!");
                            JogoPI.puzzled=true;
                            corredorRat.corredor();
                        }
                        else if(segundadecisao == 2){
                            System.out.println("[DIALOGO DA EXPLICAÇÃO]");
                            JogoPI.puzzled=true;
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
