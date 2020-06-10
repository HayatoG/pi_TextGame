package jogopi;
import java.util.Random;
import java.util.Scanner;

public class JogoPI {
    static boolean Itens = false;
    static boolean Lanterna=false;
    static boolean Foto=false;
    static boolean ChaveCarro=false;
    static boolean gazua = false;
    static boolean arma = false;
    static boolean faca = false;
    static boolean puzzled = false;
    static boolean finalj = false;
    static boolean salaBatalha = false;
    static boolean erva = false;
    static boolean capanga = false;
        
    static boolean inicio = false;
    static boolean porao = false;
    static boolean corredor = false;
    
    static String lanternaEstante="Lanterna"; //0
    static String fotoInvetario="Foto"; //3 
    static String chaveCarroInventario="Chaves do carro"; //2
    static String gazuaCaixas="Gazua"; //1
    static String armaCozinha="Revólver .38"; //4
    static String nomeJogador="";
    static String ervinhaCura="Erva da cura"; //5
    static String nomePlayer="";
  
    
    static int energiaInimigo = 6;
    static int energiaJogador = 6;
    
    static Scanner s = new Scanner(System.in);
    static Random aleatorio = new Random();
    
    static String [] inventario = new String [8];
    
    public static void main(String[] args) {
        telaInicial.telaInicio();
        //Batalhas.conversarInimigo();
    }
}
