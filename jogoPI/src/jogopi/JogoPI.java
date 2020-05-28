package jogopi;

public class JogoPI {
    
    static boolean Lanterna=false;
    static boolean Chaves=false;
    static boolean Foto=false;
    static boolean ChaveCarro=false;
    static boolean gazua = false;
    static boolean arma = false;
    static boolean faca = false;
    static String lanternaEstante="Lanterna";
    static String chavesInvetario="Chaves";
    static String fotoInvetario="Foto";
    static String chaveCarroInventario="Chaves do carro";
    static String gazuaCaixas="Gazua";
    static String armaCozinha="Pistola .38";
    static String facaCozinha = "Faca";
    
    static  String [] inventario = new String [8];
    
    public static void main(String[] args) {
        //telaInicial.telaInicio();
       corredorRat.corredor();
    }
}
