// Questão 17
//Leia um valor de comprimento em centımetros e apresente-o convertido em polegadas.

package uni.edu.clara;
import java.util.Scanner;
public class CentimetroParaPolegada {
    public static void main (String[] args){
        try(Scanner in = new Scanner(System.in)){
                    
            System.out.print("Digite o Valor do Comprimento: ");
            double C = in.nextDouble();
            // P = Polegadas , C = Centimetros
            double P = C / 2.54;
                    
            System.out.printf("O Comprimento %.2f em Centimetros Para Polegadas Será: %.2f" ,C ,P);
        }    
    }
}

