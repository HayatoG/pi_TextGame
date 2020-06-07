package jogopi;

import static jogopi.JogoPI.s;

public class corredorRat {
    public static void corredor(){
        
        System.out.println(" ");//descrição do roteiro sobre o corredor
        if(JogoPI.Chaves == false && JogoPI.Foto == false){
            System.out.println("\n" + "Você encontrou: chaves de um carro e uma foto.");
            JogoPI.Chaves = true;
            JogoPI.Foto = true;
            JogoPI.inventario[2]=JogoPI.chaveCarroInventario;
            JogoPI.inventario[3]=JogoPI.fotoInvetario;
        }
        System.out.println("\n" + "(1) SALA | (2) COZINHA | (3) QUARTO  | (4) INVENTÁRIO | (5) MAPA");
        System.out.println("O que você quer olhar? ");
        int decisao;
        if (s.hasNextInt()) {
            decisao = s.nextInt();
            
            if (decisao > 5 || decisao < 1) {
                System.out.println("\n" + "Digite um número válido.");
                corredorRat.corredor();
            }
            else{
                switch(decisao){
                    case 1:
                        if (JogoPI.arma==false) {
                            System.out.println("\n" + "Ouço gente lá dentro não vou entrar");
                            corredorRat.corredor();
                        }
                        else{
                            Sala.sala();
                        }
                    case 2:
                        System.out.println("Na cozinha você encontra: Um révolver .38");
                        JogoPI.inventario[4]=JogoPI.armaCozinha;
                        JogoPI.arma=true;
                        corredorRat.corredor();
                    case 3:
                        if (JogoPI.puzzled==false) {
                            System.out.println("Não consigo fazer abri-la com esses caras na sala.");
                            corredorRat.corredor();
                        }
                        else{
                           puzzles.puzzle2();
                        }
                    case 4:
                        inventario.inventario();
                        corredorRat.corredor();
                    
                    case 5:
                        mapa.mapaCorredor();
                        corredorRat.corredor();
                }
            }
        } 
   }
}
