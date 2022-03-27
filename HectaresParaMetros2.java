// Questão 27
// Leia um valor de area em hectares e apresente-o convertido em metros quadrados 

package uni.edu.clara;
import java.util.Scanner;
public class HectaresParaMetros2 {
    public static void main (String[] args){
        try(Scanner in = new Scanner(System.in)){
                    
            System.out.print("Digite o Valor da Área: ");
            double H = in.nextDouble();
            // H = Hectares | M = Metros Quadrados;
            double M = H * 10000;
           
            System.out.printf("A Área %.3f em Hectares Para Metros Quadrados Será: %.3f \n" ,H , M);
        }    
    }
}