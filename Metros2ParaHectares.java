// Questão 26
// Leia um valor de area em metros quadrados m2 e apresente-o convertido em hectares.

package uni.edu.clara;
import java.util.Scanner;
public class Metros2ParaHectares {
    public static void main (String[] args){
        try(Scanner in = new Scanner(System.in)){
                    
            System.out.print("Digite o Valor da Área: ");
            double M = in.nextDouble();
            // H = Hectares | M = Metros Quadrados;
            double H = M * 0.0001;
           
            System.out.printf("A Área %.3f em Metros Quadrados Para Hectares Será: %.3f \n" ,M ,H);
        }    
    }
}