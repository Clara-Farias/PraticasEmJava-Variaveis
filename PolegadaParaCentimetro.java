// Questão 16
// Leia um valor de comprimento em polegadas e apresente-o convertido em centımetros.

package uni.edu.clara;
import java.util.Scanner;
public class PolegadaParaCentimetro {
    public static void main (String[] args){
        try(Scanner in = new Scanner(System.in)){
                    
            System.out.print("Digite o Valor do Comprimento: ");
            double P = in.nextDouble();
            // P = Polegadas , C = Centimetros
            double C = P * 2.54;
                    
            System.out.printf("O Comprimento %.2f em Polegadas Para Centimetros Será: %.2f" ,P ,C);
        }    
    }
}

