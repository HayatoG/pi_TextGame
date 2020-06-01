package jogopi;

public class JogoPI {
    static boolean Itens = false;
    static boolean Lanterna=false;
    static boolean Chaves=false;
    static boolean Foto=false;
    static boolean ChaveCarro=false;
    static boolean gazua = false;
    static boolean arma = false;
    static boolean puzzled = false;
    static String lanternaEstante="Lanterna"; //0
    static String chavesInvetario="Chaves"; //5
    static String fotoInvetario="Foto"; //3 
    static String chaveCarroInventario="Chaves do carro"; //2
    static String gazuaCaixas="Gazua"; //1
    static String armaCozinha="Pistola .38"; //4
    
    static  String [] inventario = new String [8];
    
    public static void main(String[] args) {
        telaInicial.telaInicio();
        parte1.parte1();
       
    }
}
