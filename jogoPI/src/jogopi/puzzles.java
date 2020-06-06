/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogopi;

import java.util.Arrays;
import static jogopi.JogoPI.s;

/**
 *
 * @author olive
 */
public class puzzles {
            
    static void puzzle1(){
            
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
                    System.out.println("\n" + "Falha!");
                    puzzle1();
                    //dar uns thread.sleep aqui
                case 5:
                    System.out.println("  ___          _   _          _           ___  \n" +
                            " |  _|  ____  | | | |  ____  | |  ____   |_  | \n" +
                            " / |   [____] | | | | [____] | | [____]    | \\ \n" +
                            " \\ |_         | | | |        | |          _| / \n" +
                            " |___|        |_| |_|        |_|         |___| \n" +
                            "                                               " + "\n");
                    System.out.println("  ___          _   _                         ___  \n" +
                            " |  _|  ____  | | | |  ____   ____   ____   |_  | \n" +
                            " / |   [____] | | | | [____] [____] [____]    | \\ \n" +
                            " \\ |_         | | | |                        _| / \n" +
                            " |___|        |_| |_|                       |___| \n" +
                            "                                                  " + "\n");
                    System.out.println("  ___                 _                         ___  \n" +
                            " |  _|  ____   ____  | |  ____   ____   ____   |_  | \n" +
                            " / |   [____] [____] | | [____] [____] [____]    | \\ \n" +
                            " \\ |_                | |                        _| / \n" +
                            " |___|               |_|                       |___| \n" +
                            "                                                     " + "\n");
                    System.out.println(" ___                                              ___  \n" +
                            " |  _|  ____   ____   ____   ____   ____   ____   |_  | \n" +
                            " / |   [____] [____] [____] [____] [____] [____]    | \\ \n" +
                            " \\ |_                                              _| / \n" +
                            " |___|                                            |___| \n" +
                            "                                                        " + "\n");
                    System.out.println("\n" + "Você destravou a porta!");
                    System.out.println("\n" + "Entrando no corredor...");
                    corredorRat.corredor();
            }
            
        }
        else{
            System.out.println("\n" + "Digite uma posição válida.");
            puzzle1();
        }
    }
    
    static void puzzle2(){
        System.out.println("Parece ser um anagrama...");
        int tentativas=0;
        
        for (int i = 0; i < 5; i++) {
        String[][] deepArray = new String[][] {{"ad", "ri"}, {"to", "r"}};
        System.out.println(Arrays.deepToString(deepArray));
       
        System.out.println("O que está escrito?:");
        String resposta = s.next();
        tentativas++;
        
        if (resposta.equalsIgnoreCase("traidor")) {
            System.out.println("Traidor? Essa palavra me alguém a cabeça."
                    +  " Um dos meus melhores amigos me acusou de ser traidor por não"
                    + " querer participar de um plano maligno...");
                     Quarto.quarto();
                     break;
        }
        else{
            System.out.println("Não parece ser a palavra...");
        }
       
            }
        
        if (tentativas==5) {
            System.out.println("POW! POW!");
            System.out.println("Demorou demais para responder e acabou morrendo.");
        }
        }
    }   
    

