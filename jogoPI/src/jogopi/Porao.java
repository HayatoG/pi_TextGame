package jogopi;

import static jogopi.JogoPI.s;

public class Porao {
    static void porao(){
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
                Porao.porao();
            }
            else{
                switch(decisão){
                    case 1:
                        if (JogoPI.Lanterna==true) {
                            System.out.println("\n" + "Conseguindo enxergar melhor com a lanterna você encontra uma gazua"+ "\n");
                            JogoPI.inventario[1]= JogoPI.gazuaCaixas;
                            JogoPI.gazua=true;
                            JogoPI.Itens=true;
                            Porao.porao();
                        } 
                        else{
                        System.out.println("\n" + "Está muito escuro aqui..." + "\n"); 
                        Porao.porao();
                        }
                         
                    case 2:
                        if (JogoPI.gazua==false) {
                        System.out.println("\n" + "Está trancada." + "\n");
                        Porao.porao();    
                        }
                        else{
                            System.out.println("\n" + "Você tenta decifrar em como abrir a porta com a gazua"+ "\n");
                             puzzles.puzzle1();
                            
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
                        Porao.porao();
                        }
                    case 4:
                        inventario.inventario();
                        Porao.porao();
                }
            }
        }
        else{
            System.out.println("\n" + "Opção inválida." + "\n");
            Porao.porao();
        }
    } 
}