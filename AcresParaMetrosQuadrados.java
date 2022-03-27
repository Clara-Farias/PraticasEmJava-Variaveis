// Questão 25 Leia um valor de area em acres e apresente-o convertido em metros quadrados

package uni.edu.clara;
import java.util.Scanner;
public class AcresParaMetrosQuadrados {
    public static void main (String[] args){
        try(Scanner in = new Scanner(System.in)){
                    
            System.out.print("Digite o Valor da Área: ");
            double A = in.nextDouble();
            // A = Acres | M = Metros Quadrados;
            double M = A * 4048.58;
           
                    
            System.out.printf("A Área %.4f em Acres Para Metros Quadrados Será: %.4f \n" ,A ,M);
        }    
    }
}