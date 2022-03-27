// Questão 18
// Leia um valor de volume em metros cubicos m3 e apresente-o convertido em litros. 

package uni.edu.clara;
import java.util.Scanner;
public class MetrosCubicosParaLitros {
        public static void main (String[] args){
            try(Scanner in = new Scanner(System.in)){
                        
            System.out.print("Digite o Valor do Volume: ");
            double m3 = in.nextDouble();
            // m3 = Metros Cúbicos , l = litros;
            double l = 1000 * m3;
                        
            System.out.printf("O Volume %.2f em Metros Cúbicos Convertido Para Litros Será: %.2f \n" ,m3 ,l);
        }      
    }
}
