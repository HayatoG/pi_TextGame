/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogopi;
import java.util.Scanner;
/**
 *
 * @author olive
 */
public class corredorRat {
    public static void corredor(){
        Scanner s = new Scanner(System.in);
        
        System.out.println(" ");//descrição do roteiro sobre o corredor
        System.out.println("Você encontrou: Chaves e uma foto.");
        System.out.println("(1) QUARTO | (2) SALA | (3) COZINHA");
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
                        //o que acontece no quarto
                        
                    case 2:
                        //o que acontece na sala
                        
                    case 3:
                        //o que acontece na cozinha
                }
            }
            
            
            
            
            
            
        }
        
    
}
    
}
