package jogopi;
import java.util.Scanner;

public class corredorRat {
    public static void corredor(){
        Scanner s = new Scanner(System.in);
        
        System.out.println(" ");//descrição do roteiro sobre o corredor
        if(JogoPI.Chaves == false && JogoPI.Foto == false){
            System.out.println("\n" + "Você encontrou: Chaves e uma foto.");
            JogoPI.Chaves = true;
            JogoPI.Foto = true;
            JogoPI.inventario[2]=JogoPI.chaveCarroInventario;
            JogoPI.inventario[3]=JogoPI.fotoInvetario;
        }
        System.out.println("\n" + "(1) SALA | (2) COZINHA | (3) QUARTO  | (4) INVENTÁRIO");
        System.out.println("O que você quer olhar? ");
        int decisao;
        if (s.hasNextInt()) {
            decisao = s.nextInt();
            
            if (decisao > 4 || decisao < 1) {
                System.out.println("\n" + "Digite um número válido.");
                corredorRat.corredor();
            }
            else{
                switch(decisao){
                    case 1:
                        if (JogoPI.arma==false) {
                            System.out.println("\n" + "Ouço gente lá dentro não vou entrar");
                            corredor();
                        }
                        else{
                            parte4.parte4();
                        }
                    case 2:
                        System.out.println("Na cozinha você encontra: Um révolver .38");
                        JogoPI.inventario[4]=JogoPI.armaCozinha;
                        JogoPI.arma=true;
                        
                    case 3:
                        if (JogoPI.puzzled==false) {
                            System.out.println("Não consigo fazer abri-la com esses caras na sala.");
                        }
                        else{
                           puzzle2();
                          
                        }
              
                    
                        
                    case 4:
                        parte1.inventario();
                        corredorRat.corredor();
                    }
                }
            }        
        }
                static void puzzle2(){
                
            }
           
    }
