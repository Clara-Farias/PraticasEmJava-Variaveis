// Questão 24
//Leia um valor de area em metros quadrados m2 e apresente-o convertido em acres

package uni.edu.clara;
import java.util.Scanner;
public class MetrosQuadradosParaAcres {
    public static void main (String[] args){
        try(Scanner in = new Scanner(System.in)){
                    
            System.out.print("Digite o Valor da Área: ");
            double M = in.nextDouble();
            // A = Acres | M = Metros Quadrados;
            double A = M * 0.000247;
           
                    
            System.out.printf("A Área %.5f em Metros Quadrados Para Acres Será: %.5f \n" ,M ,A);
        }    
    }
}