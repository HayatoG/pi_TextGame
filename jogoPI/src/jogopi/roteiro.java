
package jogopi;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class roteiro {
    
    static void verificacao1(){
        if (JogoPI.inicio==false && JogoPI.porao==false) {
            roteiro.inicio();
            roteiro.porao();
        }
    }
    static void verificacao2(){
        if (JogoPI.corredor==false) {
            roteiro.corredor();
        }
    }
    static void inicio(){
        System.out.println("\nDIA 25/10/1995 \n");
        try{
        System.out.println(JogoPI.nomePlayer + " umx renomadx cientista, sai do seu laborátorio"
                + " onde trabalhava\nem um projeto governamental às 02:45, "
                + "parte em direção ao estacionamento,\nquando é abordado por homens encapuzados que o drogam e o"
                + " forçam a entrar em um kombi.");
         TimeUnit.SECONDS.sleep(5);
        
        System.out.println("\nApós algum tempo, acorda sem entender onde está, perdido, olha ao redor");
        TimeUnit.SECONDS.sleep(3);
        JogoPI.inicio=true;
        }
        catch(InterruptedException ie){
                Thread.currentThread().interrupt();
      }
    }
    
    static void porao(){
        try{
            System.out.println("\nAcorda em um porão sujo, escuro e com a única fonte de luz vindo de uma "
                    + " pequena janela.");
            System.out.println("Com diversas caixas empilhadas e estantes velhas.");
            TimeUnit.SECONDS.sleep(5);
            JogoPI.porao=true;
            
        }catch(InterruptedException ie){
                Thread.currentThread().interrupt();
      }
    }
    static void salaConversa(){
        try{
           System.out.println("[" + JogoPI.nomePlayer + "]" + " Jogue sua arma no chão!\n");
                                TimeUnit.SECONDS.sleep(2);
                                System.out.println("[RAMON]" + " Jogue você primeiro! você acabou de matar o MIROSMAR\n");
                                 TimeUnit.SECONDS.sleep(2);
                                 System.out.println("[" + JogoPI.nomePlayer + "]" + " Se eu abaixar você também abaixa?!\n");
                                 TimeUnit.SECONDS.sleep(4);
                                System.out.println("[RAMON]" + " As calças?????\n");
                                TimeUnit.SECONDS.sleep(2);
                                System.out.println("[" + JogoPI.nomePlayer + "]" + " Não né burro! a arma. Vamos abaixar ao mesmo tempo\n");
                                TimeUnit.SECONDS.sleep(2);
                                System.out.println("[RAMON]" + " Certo abaixairei... no 3 certo?\n");
                                TimeUnit.SECONDS.sleep(2);
                                System.out.println("[" + JogoPI.nomePlayer + "]" + " Certo.\n");
                                TimeUnit.SECONDS.sleep(3);
                                System.out.println("[" + JogoPI.nomePlayer + "]" + "Estou trabalhando em um projeto para salvar o mundo.\n"
                                        + "Quem conseguir colocar as mãos nele e ter intenções maliciosas\npode fazer um estrago e tanto. Tenho que sair imediatamente."
                                        + " Cada segundo que passamos\naqui é uma perda de tempo. Preciso da sua ajuda.\n");
                                TimeUnit.SECONDS.sleep(5);
                                System.out.println("[RAMON]" + " Salvar o mundo? nessas condições? eu bem que gostaria que fosse verdade."
                                        + "\nMas acho que devo te dar esse voto de confiança...\n");
                                TimeUnit.SECONDS.sleep(3);
                                JogoPI.puzzled=true;
                                JogoPI.salaBatalha=true;
                                System.out.println("[" + JogoPI.nomePlayer + "]" + " Certo, agora vamos pro quarto...\n");
                                TimeUnit.SECONDS.sleep(2);
            
        }catch(InterruptedException ie){
                Thread.currentThread().interrupt();
      }
        
        
    }
    static void corredor(){
        try{
            System.out.println("Após conseguir passar pela porta você encontra um largo corredor.\n");
             TimeUnit.SECONDS.sleep(2);
            System.out.println("Escuro, silêncio absoluto, quadros e fotos pelas paredes.\n"
                    + "Analisando as fotos percebe que uma delas não é desconhecida, já havia visto aquele rosto \n"
                    + "em algum lugar, retira da parede e guarda em seu bolso. ");
            TimeUnit.SECONDS.sleep(5);
            JogoPI.corredor=true;
            
        }
        catch(InterruptedException ie){
                Thread.currentThread().interrupt();
        }
    }
}

