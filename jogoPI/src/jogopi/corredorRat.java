package jogopi;
import java.util.Scanner;

public class corredorRat {
    public static void corredor(){
        Scanner s = new Scanner(System.in);
        
        System.out.println(" ");//descrição do roteiro sobre o corredor
        if(JogoPI.Chaves == false && JogoPI.Foto == false){
            System.out.println("Você encontrou: Chaves e uma foto.");
            JogoPI.Chaves = true;
            JogoPI.Foto = true;
        }
        System.out.println("(1) QUARTO | (2) SALA | (3) COZINHA | (4) FOTO");
        System.out.println("O que você quer olhar? ");
        int decisao;
        if (s.hasNextInt()) {
            decisao = s.nextInt();
            
            if (decisao > 3 || decisao < 1) {
                System.out.println("Digite um número válido.");
                corredorRat.corredor();
            }
            else{
                switch(decisao){
                    case 1:
                        //corredorRat.corredor();
                    case 2:
                        //o que acontece na sala
                    case 3:
                        //o que acontece na cozinha
                    case 4:
                        System.out.print("Olhando a foto...");
                }
            }        
        }
    }
}
