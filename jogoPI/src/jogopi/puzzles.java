package jogopi;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import static jogopi.JogoPI.s;

public class puzzles {
            
    static void puzzle1(){
             try{
        System.out.println("  ___          _   _          _           ___  \n" +
        " |  _|  ____  | | | |  ____  | |  ____   |_  | \n" +
        " / |   [____] | | | | [____] | | [____]    | \\ \n" +
        " \\ |_         | | | |        | |          _| / \n" +
        " |___|        |_| |_|        |_|         |___| \n" +
        "                                               " + "\n");

            
        System.out.println("\n" + "Girar: " + "\n"
                + "(1) POSIÇÃO 1, 4 E 6  " + "\n"
                + "(2) POSIÇÃO 2, 3 E 4  " + "\n"
                + "(3) POSIÇÃO 3, 1 E 4  " + "\n"
                + "(4) POSIÇÃO 4, 6 E 2  " + "\n"
                + "(5) POSIÇÃO 5, 2 E 3  " + "\n");
        if (s.hasNextInt()) {
            int girar = s.nextInt();
            
            if (girar < 1 || girar > 5) {
                System.out.println("\n" + "Posição inválida.");
                puzzle1();
            }
                
            switch(girar){
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("\n" + "Droga! emperrou!");
                    puzzle1();
                case 5:
                    System.out.println("  ___          _   _          _           ___  \n" +
                            " |  _|  ____  | | | |  ____  | |  ____   |_  | \n" +
                            " / |   [____] | | | | [____] | | [____]    | \\ \n" +
                            " \\ |_         | | | |        | |          _| / \n" +
                            " |___|        |_| |_|        |_|         |___| \n" +
                            "                                               " + "\n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("  ___          _   _                         ___  \n" +
                            " |  _|  ____  | | | |  ____   ____   ____   |_  | \n" +
                            " / |   [____] | | | | [____] [____] [____]    | \\ \n" +
                            " \\ |_         | | | |                        _| / \n" +
                            " |___|        |_| |_|                       |___| \n" +
                            "                                                  " + "\n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("  ___                 _                         ___  \n" +
                            " |  _|  ____   ____  | |  ____   ____   ____   |_  | \n" +
                            " / |   [____] [____] | | [____] [____] [____]    | \\ \n" +
                            " \\ |_                | |                        _| / \n" +
                            " |___|               |_|                       |___| \n" +
                            "                                                     " + "\n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(" ___                                              ___  \n" +
                            " |  _|  ____   ____   ____   ____   ____   ____   |_  | \n" +
                            " / |   [____] [____] [____] [____] [____] [____]    | \\ \n" +
                            " \\ |_                                              _| / \n" +
                            " |___|                                            |___| \n" +
                            "                                                        " + "\n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\n" + "Você destravou a porta!");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\n" + "Entrando no corredor...");
                    corredorRat.corredor();
            }
            
        }
        else{
            System.out.println("\n" + "Digite uma posição válida.");
            puzzle1();
        }
        }catch(InterruptedException ie){
                Thread.currentThread().interrupt();
      }
    }
    
    static void puzzle2(){
        try{
        System.out.println("\nParece ser um anagrama neste cadeado. Qual poderia ser a palavra?\n");
        
        if (JogoPI.capanga==true) {
            for (int i = 0; i < 30; i++) {
        String[][] deepArray = new String[][] {{"to", "rr"}, {"i", "da"}};
        System.out.println(Arrays.deepToString(deepArray));
       
        System.out.println("\nO que está escrito?:");
        System.out.println("Pedir dica para o capanga? (1)");
        String resposta = s.next();
        
        if (resposta.equals("1")) {
            System.out.println("[RAMON] " + "hmm, acho que as primeiras três letras são T R A");   
            puzzles.puzzle2();
        }
        
        if (resposta.equalsIgnoreCase("traidor")) {
            System.out.println("\n[" + JogoPI.nomePlayer + "]" + " Traidor? A foto !!!.Uma vez no laboratório o Vicente "
            + "me mostrou uma foto em família\n" +
            "Essa é a foto. É o Vicente que está por trás disso tudo...\n");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("[RAMON] " + "Pronto! Vamos enfrenta-lo juntos!\n");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("[" + JogoPI.nomePlayer + "]" + " Pode deixar Ramon. Isso é pessoal... Enfrentarei sozinho.\n");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("[RAMON] " + "Certo. Te espero no carro.\n");
                     Quarto.quarto();
                     break;
        }
        else{
            System.out.println("Não parece ser a palavra...");
        }
       
            }
        }
       }catch(InterruptedException ie){
                Thread.currentThread().interrupt();
      }
        
        for (int i = 0; i < 30; i++) {
        String[][] deepArray = new String[][] {{"to", "rr"}, {"i", "da"}};
        System.out.println(Arrays.deepToString(deepArray));
       
        System.out.println("O que está escrito?:");
        String resposta = s.next();
        
        if (resposta.equalsIgnoreCase("traidor")) {
            System.out.println("\nTraidor? A foto !!!.Uma vez no laboratório o Vicente "
            + "me mostrou uma foto em família\n" +
            "Essa é a foto. É o Vicente que está por trás disso tudo...\n");
                     Quarto.quarto();
                     break;
        }
        else{
            System.out.println("Não parece ser a palavra...");
        }
       
            }
        }
    }   
    

