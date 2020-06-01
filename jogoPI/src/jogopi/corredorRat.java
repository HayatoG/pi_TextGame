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
        System.out.println("(1) SALA | (2) COZINHA | (3) QUARTO  | (4) INVENTÁRIO");
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
                        if (JogoPI.faca == false || JogoPI.arma==false) {
                            System.out.println("Ouço gente lá dentro não vou entrar");
                        }
                        else{
                            parte4.parte4();
                        }
                    case 2:
                        
                        
                    case 3:
                    //tem um puzzle mas os caras da sala podem me ouvir
                        System.out.println("Ao se aproximar da porta você encontra "
                                + "um bilhete e um painel com numeros de um a dez, "
                                + "no bilhete está escrito \"Desafio: Há 10 peixer em um aquário: \n" +
                            "-3 se afogam;\n" +
                            "-2 fogem nadando;\n" +
                            "-5 morrem.\n" +
                            "\n" +
                            "Digite quantos sobraram?\"");
                            int resp = s.nextInt();

                            if (resp == 7) {
                                System.out.println("Parabéns você acertou a resposta!");
                            }
                            else {
                                System.out.println("Você errou a resposta!");
                            decisao = 3;
                            }
                    
                        
                    case 4:
                        parte1.inventario();
                        corredorRat.corredor();
                    }
                }
            }        
        }
    }
