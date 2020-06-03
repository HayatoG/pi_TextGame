
package jogopi;
import java.util.Scanner;
public class Quarto {
    static void quarto(){
        
        Scanner s = new Scanner(System.in);

        System.out.println("A porta está trancada com o mesmo mecaniismo do porão");

        //puzzle para abrir a porta
        System.out.println("[PABLO]: Vicente, o que você está fazendo?" + "\n" + "Como pode fazer isso comigo depois de tantos anos juntos?");
        s.nextLine();
        System.out.println("[VICENTE]: Você não me deu escolha Pablo." + "\n" + "Precisava de você para consguir os arquivos...");
        s.nextLine();
        System.out.println("[VICENTE]: AGORA NÃO PRECISO MAIS..." + "\n");

        System.out.println("(1) ATACAR | (2) CONVERSAR");
        

        if (s.hasNextInt()) {
            int decisao = s.nextInt();
                int energiaInimigo = 6;
                int energiaJogador = 7;

            if (decisao > 2 || decisao < 1) {
                System.out.println("Coloque um número válido." + "\n");


            } else if (decisao == 1) {


                while (energiaInimigo <= 6 && energiaInimigo >= 1 && energiaJogador <= 7 && energiaJogador >= 1) {
                    System.out.println("(1) FACA | (2) ARMA");
                    decisao = s.nextInt();

                    if (decisao == 1) {
                        energiaInimigo--;
                        energiaJogador-= 2;
                        System.out.println("ENERGIA DO INIMIGO -- " + energiaInimigo + " / " + "6 " + "--");
                        System.out.println("ENERGIA DO JOGADOR -- " + energiaJogador + " / " + "7 " + "--");

                    } else {
                        energiaInimigo -= 3;
                        energiaJogador -= 2 ;
                        System.out.println("ENERGIA DO INIMIGO -- " + energiaInimigo + " / " + "6 " + "--");
                        System.out.println("ENERGIA DO JOGADOR -- " + energiaJogador + " / " + "7 " + "--");
                    }
                }    
                    if (energiaJogador <= 0) {
                        System.out.println("FIM DE JOGO");
                        quarto();

                    } else {
                        System.out.println("[VICENTE]: Outras pessoas virão para pegar esse projeto.......");
                        s.nextLine();
                        System.out.println("[PABLO]: Uma pena que tenha terminado dessa forma...");
                        s.nextLine();
                        System.out.println("[PABLO]: Isso ja foi longe demais, darei um fim nesses arquivos e encerrarei o projeto. " + "\n" + "**** FIM DE JOGO ****");

                    }

                

            } else {
                System.out.println("[PABLO]: Calma Vicente, podemos conversar e acertar as coisas, você precida de dinheiro?" + "\n");
                s.nextLine();
                System.out.println("[VICENTE]: Dinheiro nunca foi o problema. Eu quero controle e com você fora do meu caminho tudo ficará mais fácil");
                s.nextLine();
                System.out.println("[PABLO]: Eu vou embora então, vamos fingir que nada disso aconteceu.");
                s.nextLine();
                System.out.println("[VICENTE]: Agora já é tarde, preciso terminar o que comecei...");
                s.nextLine();
                System.out.println("VICENTE ACIONA UM BOTÃO E PULA PELA JANELA, PABLO NÃO ESPERA PARA VER O QUE ACONTECERÁ E PULA TAMBEM.");
                s.nextLine();
                System.out.println("(1) FUGIR | (2) LUTAR");
                decisao = s.nextInt();

                if (decisao == 1) {
                    System.out.println("VICENTE FICA COM OS ARQUIVOS E O PROJETO FOI ROUBADO." + "\n" + "FIM DE JOGO");
                    

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
                        quarto();
                    }
                
                    
                }

            }
        }
    }

}

    
    
    

