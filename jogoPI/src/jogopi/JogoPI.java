package jogopi;

public class JogoPI {
    
    static boolean Lanterna=false;
    static boolean Chaves=false;
    static boolean Foto=false;
    static boolean ChaveCarro=false;
    static boolean gazua = false;
    static String lanternaEstante="L";
    static String chavesInvetario="K";
    static String fotoInvetario="F";
    static String chaveCarroInventario="C";
    static String gazuaCaixas="Gazua";
    
    static  String [] inventario = new String [10];
    
    
    public static void main(String[] args) {
        telaInicial.telaInicio();
        parte1.parte1();
    }
}
