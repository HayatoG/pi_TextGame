package jogopi;

import java.util.concurrent.TimeUnit;
import static jogopi.JogoPI.aleatorio;
import static jogopi.JogoPI.energiaInimigo;
import static jogopi.JogoPI.energiaJogador;
import static jogopi.JogoPI.s;

public class Batalhas {
    static void atacarInimigo(){
        try{
                    while (energiaInimigo <= 6 && energiaInimigo >= 1 && energiaJogador <= 6 && energiaJogador >= 1) {
                        System.out.println("(1) FACA | (2) ARMA | (3) INVENTÁRIO");
                        int decisao = s.nextInt();

                        if (decisao == 1) {
                            energiaInimigo--;
                            energiaJogador-= 2;
                            System.out.println("\nENERGIA DO INIMIGO -- " + energiaInimigo + " / " + "6 " + "--");
                            System.out.println("ENERGIA DO JOGADOR -- " + energiaJogador + " / " + "6 " + "--\n");

                        } 
                        else if (decisao == 2){
                            energiaInimigo -= 3;
                            energiaJogador -= 2 ;
                            System.out.println("\nENERGIA DO INIMIGO -- " + energiaInimigo + " / " + "6 " + "--");
                            System.out.println("ENERGIA DO JOGADOR -- " + energiaJogador + " / " + "6 " + "--\n");
                        }
                        else {
                            inventario.inventario();
                            System.out.println("\nDeseja usar a erva para recuperar sua energia?");
                            System.out.println("(1) SIM | (2) NÃO");
                            int erva = s.nextInt();
                            if(erva == 1){
                                energiaJogador += 2;
                                System.out.println("SUA ENERGIA ATUAL -- " + energiaJogador + " / " + "6 " + "--\n");
                            }else {
                                Batalhas.atacarInimigo();
                            }
                        }
                    }    
                    if (energiaJogador <= 0) {
                        System.out.println("FIM DE JOGO\n");
                        System.out.println("Você morreu e está retornando ao último ponto do jogo disponível..\n");
                        TimeUnit.SECONDS.sleep(3);
                        System.out.println("O quarto, na conversa com Vincente.\n");
                        Quarto.quarto();
                        
                    } else {
                        System.out.println("[VICENTE] Outras pessoas virão para pegar esse projeto.......\n");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("[" + JogoPI.nomePlayer + "]" + " Uma pena que tenha que terminar assim.\n");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("[" + JogoPI.nomePlayer + "]" + " Isso ja foi longe demais, darei um fim nesses arquivos e encerrarei o projeto.\n");
                        TimeUnit.SECONDS.sleep(3);
                        creditos.creditos();
                    }
                    }catch(InterruptedException ie){
                Thread.currentThread().interrupt();
      }
    }
    static void conversarInimigo(){
        try{
                System.out.println("[" + JogoPI.nomePlayer + "]" + " Calma Vicente, podemos conversar e acertar as coisas, você precisa de dinheiro?" + "\n");
                TimeUnit.SECONDS.sleep(3);
                System.out.println("[VICENTE] Dinheiro nunca foi o problema. Eu quero controle e com você fora do meu caminho tudo ficará mais fácil!\n");
                TimeUnit.SECONDS.sleep(3);
                System.out.println("[" + JogoPI.nomePlayer + "]" + " Eu vou embora então, vamos fingir que nada disso aconteceu!\n");
                TimeUnit.SECONDS.sleep(3);
                System.out.println("[VICENTE]: Agora já é tarde, preciso terminar o que comecei...\n");
                TimeUnit.SECONDS.sleep(3);
                System.out.println("[ VICENTE ACIONA UM BOTÃO E PULA PELA JANELA, " + JogoPI.nomePlayer  + " NÃO ESPERA PARA VER O QUE ACONTECERÁ E PULA TAMBEM. ]\n");
                TimeUnit.SECONDS.sleep(3);
                System.out.println("(1) FUGIR | (2) LUTAR");
                int decisao = s.nextInt();

                if (decisao == 1) {
                    System.out.println("[ VICENTE FICA COM OS ARQUIVOS E O PROJETO FOI ROUBADO. ]" + "\n" + "O mundo agora "
                            + "sofrerá nas mãos tirânicas de Vincente.\nA humanidade está condenada a nova ordem mundial.");
                    creditos.creditos();
                
                } else if (decisao == 2){
                    int decisaoLuta;
                    while (energiaInimigo <= 6 && energiaInimigo >= 1 && energiaJogador <= 6 && energiaJogador >= 1) {
                        System.out.println("(1) FACA | (2) CHUTE | (3) INVENTÁRIO");
                        decisaoLuta = s.nextInt();
                        if (decisaoLuta == 1){
                             energiaInimigo-= 3;
                             energiaJogador-= 2 ;
                             System.out.println("\nENERGIA DO INIMIGO -- " + energiaInimigo + " / " + "6 " + "--");
                             System.out.println("ENERGIA DO JOGADOR -- " + energiaJogador + " / " + "6 " + "--\n");
                        }
                        else if (decisaoLuta == 2){
                            energiaInimigo--;
                            energiaJogador-=2;
                            System.out.println("\nENERGIA DO INIMIGO -- " + energiaInimigo + " / " + "6 " + "--");
                            System.out.println("ENERGIA DO JOGADOR -- " + energiaJogador + " / " + "6 " + "--\n");
                        }
                        else{
                            inventario.inventario();
                            System.out.println("\nDeseja usar a erva para recuperar sua energia?");
                            System.out.println("(1) SIM | (2) NÃO");
                            int erva = s.nextInt();
                            if(erva == 1){
                                energiaJogador += 2;
                                System.out.println("SUA ENERGIA ATUAL -- " + energiaJogador + " / " + "6 " + "--\n");
                            }else {
                                decisao = 2;
                            }
                        }
                    }    
                    
                    if (energiaInimigo <= 0) {
                        System.out.println("[" + JogoPI.nomePlayer + "]" + "Uma pena que tenha terminado dessa forma...");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println ("[" + JogoPI.nomePlayer + "]" + "Isso já foi longe demais, darei um fim nesses arquivos e encerrarei o projeto. ");
                        TimeUnit.SECONDS.sleep(3);
                        creditos.creditos();
                    }
                    else{
                        System.out.println("\nFIM DE JOGO");
                        creditos.creditos();
                    }
                    
                }
        }catch(InterruptedException ie){
                Thread.currentThread().interrupt();
      }
        
    }
    static void atirarInimigo(){
        try{
        int sorte;
        do{
            sorte = aleatorio.nextInt(10) + 1;
            System.out.println("*POW*");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\nENERGIA DO INIMIGO -- " + energiaInimigo + " / " + "6 " + "--");
            System.out.println("ENERGIA DO JOGADOR -- " + energiaJogador + " / " + "6 " + "--\n");
            if(sorte >= 1 && sorte <= 5){
                System.out.println("(1) - ATIRAR | (2) - INVENTÁRIO");
                int decisao = s.nextInt();
                if(decisao == 1){
                    energiaInimigo -= 2;
                    if(energiaInimigo <= 0){
                        System.out.println("\nENERGIA DO INIMIGO -- " + energiaInimigo + " / " + "6 " + "--");
                        System.out.println("ENERGIA DO JOGADOR -- " + energiaJogador + " / " + "6 " + "--\n");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("\nMORREU!");
                    }
                }
                else if (decisao == 2){
                    inventario.inventario();
                    System.out.println("\nDeseja usar a erva para recuperar sua energia?");
                    System.out.println("(1) SIM | (2) NÃO");
                    int erva = s.nextInt();
                    if(erva == 1){
                        energiaJogador += 2;
                        System.out.println("SUA ENERGIA ATUAL -- " + energiaJogador + " / " + "6 " + "--");
                    }
                    else {
                        atirarInimigo();
                    }
                }
            }
            else{
                energiaJogador -= 2;
                System.out.println("Droga, ele me acertou!");
                System.out.println("ENERGIA DO INIMIGO -- " + energiaInimigo + " / " + "6 " + "--");
                System.out.println("ENERGIA DO JOGADOR -- " + energiaJogador + " / " + "6 " + "--");
                if(energiaJogador <= 0){
                    System.out.println("Sinto muito, você morreu...");
                    System.out.println("Você morreu e está retornando ao último ponto do jogo disponível");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("Sala onde o sequestrador estava dormindo.");
                    Sala.sala();
                }
            } 
        }while(energiaInimigo > 0 && energiaJogador > 0);
        }catch(InterruptedException ie){
                Thread.currentThread().interrupt();
      }
        
    }
}   
