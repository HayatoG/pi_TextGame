package jogopi;
import static jogopi.JogoPI.aleatorio;
import static jogopi.JogoPI.energiaInimigo;
import static jogopi.JogoPI.energiaJogador;
import static jogopi.JogoPI.s;

public class parte4 {
    static void atirarInimigo(){
        int sorte;
        do{
            sorte = aleatorio.nextInt(10) + 1;
            System.out.println("*POW*");
            if(sorte >= 1 && sorte <= 5){
                System.out.println("(1) - ATIRAR");
                int atirar = s.nextInt();
                if(atirar == 1){
                    energiaInimigo -= 2;
                    if(energiaInimigo <= 0){
                        System.out.println("MIROSMAR MORREU, TRISTE!");
                    }
                }
            }
            else{
                energiaJogador -= 2;
                System.out.println("Droga, ele me acertou!");
                if(energiaJogador <= 0){
                System.out.println("S E F O D E U");
                }
            } 
        }while(energiaInimigo > 0 && energiaJogador > 0);
    }
    static void parte4(){
        //Colocar validação caso o usuário coloque String
        //sala
        
        
        System.out.println("Um deles está dormindo...");
        System.out.println("(1) ATIRAR");
        
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
                    case 2:
                        System.out.println("Droga! Tem mais!?");
                        System.out.println("(1) ATIRAR | (2) SE EXPLICAR COM O SEQUESTRADOR");
                        int segundadecisao = s.nextInt();
                        if(segundadecisao == 1){
                            atirarInimigo();
                            JogoPI.puzzled=true;
                            //corredorRat.corredor();
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
