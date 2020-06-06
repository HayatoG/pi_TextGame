package jogopi;

import static jogopi.JogoPI.aleatorio;
import static jogopi.JogoPI.energiaInimigo;
import static jogopi.JogoPI.energiaJogador;
import static jogopi.JogoPI.s;

public class Batalhas {
    static void atacarInimigo(){
                    while (energiaInimigo <= 6 && energiaInimigo >= 1 && energiaJogador <= 7 && energiaJogador >= 1) {
                        System.out.println("(1) FACA | (2) ARMA");
                        int decisao = s.nextInt();

                        if (decisao == 1) {
                            energiaInimigo--;
                            energiaJogador-= 2;
                            System.out.println("ENERGIA DO INIMIGO -- " + energiaInimigo + " / " + "6 " + "--");
                            System.out.println("ENERGIA DO JOGADOR -- " + energiaJogador + " / " + "7 " + "--");

                        } 
                        else{
                            energiaInimigo -= 3;
                            energiaJogador -= 2 ;
                            System.out.println("ENERGIA DO INIMIGO -- " + energiaInimigo + " / " + "6 " + "--");
                            System.out.println("ENERGIA DO JOGADOR -- " + energiaJogador + " / " + "7 " + "--");
                        }
                    }    
                    if (energiaJogador <= 0) {
                        System.out.println("FIM DE JOGO");
                        System.exit(0);
                    } else {
                        System.out.println("[VICENTE]: Outras pessoas virão para pegar esse projeto.......");
                        s.nextLine();
                        System.out.println("[PABLO]: Uma pena que tenha terminado dessa forma...");
                        s.nextLine();
                        System.out.println("[PABLO]: Isso ja foi longe demais, darei um fim nesses arquivos e encerrarei o projeto. " + "\n" + "**** FIM DE JOGO ****");
                        System.exit(0);
                    }
    }
    static void conversarInimigo(){
                System.out.println("[PABLO]: Calma Vicente, podemos conversar e acertar as coisas, você precisa de dinheiro?" + "\n");
                s.nextLine();
                System.out.println("[VICENTE]: Dinheiro nunca foi o problema. Eu quero controle e com você fora do meu caminho tudo ficará mais fácil!");
                s.nextLine();
                System.out.println("[PABLO]: Eu vou embora então, vamos fingir que nada disso aconteceu!");
                s.nextLine();
                System.out.println("[VICENTE]: Agora já é tarde, preciso terminar o que comecei...");
                s.nextLine();
                System.out.println("[ VICENTE ACIONA UM BOTÃO E PULA PELA JANELA, PABLO NÃO ESPERA PARA VER O QUE ACONTECERÁ E PULA TAMBEM. ]");
                s.nextLine();
                System.out.println("(1) FUGIR | (2) LUTAR");
                int decisao = s.nextInt();

                if (decisao == 1) {
                    System.out.println("[ VICENTE FICA COM OS ARQUIVOS E O PROJETO FOI ROUBADO. ]" + "\n" + "FIM DE JOGO");
                
                } else {
                    while (energiaInimigo <= 6 && energiaInimigo >= 1 && energiaJogador <= 7 && energiaJogador >= 1) {
                        System.out.println("(1) FACA | (2) CHUTE");
                        decisao = s.nextInt();
                        
                        if (decisao == 1){
                             energiaInimigo-= 3;
                             energiaJogador-= 2 ;
                             System.out.println("ENERGIA DO INIMIGO -- " + energiaInimigo + " / " + "6 " + "--");
                             System.out.println("ENERGIA DO JOGADOR -- " + energiaJogador + " / " + "7 " + "--");
                        }
                        else{
                            energiaInimigo--;
                            energiaJogador-=2;
                            System.out.println("ENERGIA DO INIMIGO -- " + energiaInimigo + " / " + "6 " + "--");
                            System.out.println("ENERGIA DO JOGADOR -- " + energiaJogador + " / " + "7 " + "--");
                        }
                    }    
                    
                    if (energiaInimigo <= 0) {
                        System.out.println("[PABLO]: Uma pena que tenha terminado dessa forma...");
                        s.nextLine();
                        System.out.println("[PABLO]: Isso ja foi longe demais, darei um fim nesses arquivos e encerrarei o projeto. " + "\n" + "**** FIM DE JOGO ****");
                    }
                    else{
                        System.out.println("FIM DE JOGO");
                        System.exit(0);
                    }
                }
    }
    static void atirarInimigo(){
        int sorte;
        do{
            sorte = aleatorio.nextInt(10) + 1;
            System.out.println("*POW*");
            System.out.println("ENERGIA DO INIMIGO -- " + energiaInimigo + " / " + "6 " + "--");
            System.out.println("ENERGIA DO JOGADOR -- " + energiaJogador + " / " + "7 " + "--");
            if(sorte >= 1 && sorte <= 5){
                System.out.println("(1) - ATIRAR");
                int atirar = s.nextInt();
                if(atirar == 1){
                    energiaInimigo -= 2;
                    if(energiaInimigo <= 0){
                        System.out.println("ENERGIA DO INIMIGO -- " + energiaInimigo + " / " + "6 " + "--");
                        System.out.println("ENERGIA DO JOGADOR -- " + energiaJogador + " / " + "7 " + "--");
                        System.out.println("MIROSMAR MORREU, TRISTE!");
                    }
                }
            }
            else{
                energiaJogador -= 2;
                System.out.println("Droga, ele me acertou!");
                System.out.println("ENERGIA DO INIMIGO -- " + energiaInimigo + " / " + "6 " + "--");
                System.out.println("ENERGIA DO JOGADOR -- " + energiaJogador + " / " + "7 " + "--");
                if(energiaJogador <= 0){
                    System.out.println("Sinto muito, você morreu...");
                    System.out.println("Você morreu e está retornando ao último ponto do jogo disponível (A sala com o bandido dormindo)");
                    Sala.sala();
                }
            } 
        }while(energiaInimigo > 0 && energiaJogador > 0);
    }
}   
