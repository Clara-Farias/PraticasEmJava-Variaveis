// Questão 19
// Leia um valor de volume em litros e apresente-o convertido em metros cubicos

package uni.edu.clara;
import java.util.Scanner;
public class LitrosParaMetrosCubicos {
    public static void main (String[] args){
        try(Scanner in = new Scanner(System.in)){
                        
            System.out.print("Digite o Valor do Volume: ");
            double l = in.nextDouble();
            // m3 = Metros Cúbicos , l = litros;
            double m3 = l / 1000;
                        
            System.out.printf("O Volume %.2f em Litros Convertido Para Metros Cúbicos Será: %.2f \n" ,l ,m3);
        }      
    }
}
