/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogopi;

/**
 *
 * @author olive
 */
public class inventario {
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
