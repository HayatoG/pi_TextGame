
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
        System.out.println(JogoPI.nomePlayer + " um(a) renomad(a) cientista, sai do seu laborátorio"
                + " onde trabalhava\nem um projeto governamental às 02:45, "
                + "parte em direção ao estacionamento,\nquando é abordado(a) por homens encapuzados que o(a) drogam e o(a)"
                + " forçam a entrar em um kombi.");
         TimeUnit.SECONDS.sleep(5);
        
        System.out.println("\nApós algum tempo, acorda sem entender onde está, perdido(a), olha ao redor");
        TimeUnit.SECONDS.sleep(4);
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
                                TimeUnit.SECONDS.sleep(3);
           System.out.println("[RAMON]" + " Jogue você primeiro! você acabou de matar o Mirosmar\n");
                                 TimeUnit.SECONDS.sleep(3);
           System.out.println("[" + JogoPI.nomePlayer + "]" + " Se eu abaixar você também abaixa?!\n");
                                 TimeUnit.SECONDS.sleep(4);
           System.out.println("[RAMON]" + " As calças?????\n");
                                TimeUnit.SECONDS.sleep(3);
           System.out.println("[" + JogoPI.nomePlayer + "]" + " Não né burro! a arma. Vamos abaixar ao mesmo tempo\n");
                                TimeUnit.SECONDS.sleep(3);
           System.out.println("[RAMON]" + " Certo abaixarei... no 3 certo?\n");
                                TimeUnit.SECONDS.sleep(3);
           System.out.println("[" + JogoPI.nomePlayer + "]" + " Certo.\n");
                                TimeUnit.SECONDS.sleep(3);
           System.out.println("[" + JogoPI.nomePlayer + "]" + " Estou trabalhando em um projeto governamental secreto,\n" +
"temo que o meu sequestro esteja ligado a isso.\n" +
"Cada segundo que passamos aqui sinto que uma catástrofe se aproxima...\n");
                                TimeUnit.SECONDS.sleep(6);
           System.out.println("[RAMON]" + " Projeto secreto? eu bem que gostaria que fosse verdade.\n" +
"Mas acho que devo te dar esse voto de confiança...\n");
                                TimeUnit.SECONDS.sleep(4);
                                JogoPI.puzzled=true;
                                JogoPI.salaBatalha=true;
           System.out.println("[" + JogoPI.nomePlayer + "]" + " Certo, agora vamos sair daqui com aquela chave do carro\n"
                   + "que peguei emprestada com seu amigo.\n");
                                TimeUnit.SECONDS.sleep(5);
           System.out.println("[RAMON]" + "  Você não quer saber quem está por trás disso tudo? \n" +
"O chefe fica trancado naquele quarto e nunca sai.\n" +
"o jeito que está  parece que ele sabe quem esta planejando tudo");
                                TimeUnit.SECONDS.sleep(4);
            
        }catch(InterruptedException ie){
                Thread.currentThread().interrupt();
      }
        
        
    }
    static void corredor(){
        try{
            System.out.println("Após conseguir passar pela porta você encontra um largo corredor.\n");
             TimeUnit.SECONDS.sleep(3);
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

