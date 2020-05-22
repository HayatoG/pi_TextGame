package jogopi;

public class JogoPI {
    
    static boolean Lanterna=false;
    static String lanternaEstante="Lanterna";
    static boolean gazua = false;
    static String gazuaCaixas="Gazua";
    static  String [] inventario = new String [10];
    
    
    public static void main(String[] args) {
        telaInicial.telaInicio();
        parte1.parte1();
    }
}
