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
public class JogoPI {
    
    static boolean Lanterna=false;
    static String lanternaEstante="L";
    static  String [] inventario = new String [10];
    
    
    public static void main(String[] args) {
        telaInicial.telaInicio();
        parte1.parte1();
    }
}
