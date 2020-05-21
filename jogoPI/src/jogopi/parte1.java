
package jogopi;
import java.util.Scanner;
import java.io.IOException;

public class parte1 {
        static void parte1(){
           //colocar validação caso o usuário coloque string
            Scanner s = new Scanner(System.in);
           
            System.out.println("(1) CAIXAS | (2) PORTA | (3) ESTANTE ");
            System.out.println("O que você quer olhar?");
            
            if(s.hasNextInt()){
            int decisão = s.nextInt();
                
            if (decisão > 3 || decisão < 1) {
                System.out.println("Coloque um número válido." + "\n");
                parte1.parte1();
            }
            else{
                 switch(decisão){
                     case 1:
                         if (JogoPI.Lanterna==true) {
                             System.out.println("Você conseguiu a nilce puts grila vei." + "\n");
                             parte1.parte1();
                         } 
                         else{
                         System.out.println("Está muito escuro aqui..." + "\n"); //puzzle a ser desenvolvido e adiconado no inventário
                         parte1.parte1();
                         }
                         
                     case 2:
                         System.out.println(); // 1ºpuzzle depois levar pra função corredor 
                         System.out.println("Está trancada." + "\n");
                         parte1.parte1();
                         
                     case 3:
                         JogoPI.inventario[0]= JogoPI.lanternaEstante;
                         JogoPI.Lanterna=true;
                         
                         System.out.println("Você encontrou a lanterna" + "\n");
                         parte1.parte1();
                         
                         
                 }
            }
            }
            else{
                System.out.println("Opção inválida." + "\n");
                parte1.parte1();
            }
    }
        
    
}
