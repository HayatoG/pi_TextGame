package jogopi;
import java.util.Scanner;
import java.io.IOException;

public class parte1 {
        static void parte1(){
            Scanner s = new Scanner(System.in);
            if (JogoPI.Itens == false) {
            System.out.println("\n" +"(1) CAIXAS | (2) PORTA | (3) ESTANTE ");
            System.out.println("O que você quer olhar?");
            }
            else{
            System.out.println("\n" + "(1) CAIXAS | (2) PORTA | (3) ESTANTE | (4)INVENTÁRIO");
            System.out.println("O que você quer olhar?");
           }
            if(s.hasNextInt()){
            int decisão = s.nextInt();
                
            if (decisão > 4 || decisão < 1) {
                System.out.println("\n" + "Coloque um número válido." + "\n");
                parte1.parte1();
            }
            else{
                 switch(decisão){
                     case 1:
                         if (JogoPI.Lanterna==true) {
                             System.out.println("\n" + "Conseguindo enxergar melhor com a lanterna você encontra uma gazua"+ "\n");
                             JogoPI.inventario[1]= JogoPI.gazuaCaixas;
                             JogoPI.gazua=true;
                             JogoPI.Itens=true;
                             parte1.parte1();
                         } 
                         else{
                         System.out.println("\n" + "Está muito escuro aqui..." + "\n"); 
                         parte1.parte1();
                         }
                         
                     case 2:
                         if (JogoPI.gazua==false) {
                         System.out.println("\n" + "Está trancada." + "\n");
                         parte1.parte1();    
                         }
                         else{
                             System.out.println("\n" + "Você tenta decifrar em como abrir a porta com a gazua"+ "\n");
                             puzzle1();
                             
                         }
                     case 3:
                         if(JogoPI.Lanterna==true){
                             System.out.println("Não tem mais nada aqui.");
                         }
                         else{
                         JogoPI.inventario[0]= JogoPI.lanternaEstante;
                         JogoPI.Lanterna=true;
                         JogoPI.Itens=true;
                         System.out.println("\n" + "Você encontrou a lanterna" + "\n");
                         parte1.parte1();
                         }
                     case 4:
                         inventario();
                         parte1.parte1();
                 }
            }
            }
            else{
                System.out.println("\n" + "Opção inválida." + "\n");
                parte1.parte1();
            }
    }
        
        static void puzzle1(){
            Scanner s = new Scanner(System.in);
            
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
         public static void inventario(){
                 int i=0;
                         System.out.println("---------INVENTÁRIO---------");
                               if (JogoPI.inventario[0] == null) {
                                 System.out.println("Inventário vazio");
                             }
                               else{
                             do{
                                 System.out.println(JogoPI.inventario[i]);
                                 i++;
                             }while(JogoPI.inventario[i]!=null);
                               }
                 }
            }