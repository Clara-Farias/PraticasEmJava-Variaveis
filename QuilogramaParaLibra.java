// Questão 20
// Leia um valor de massa em quilogramas e apresente-o convertido em libras. 

package uni.edu.clara;
import java.util.Scanner;
public class QuilogramaParaLibra {
    public static void main (String[] args){
        try(Scanner in = new Scanner(System.in)){
                    
            System.out.print("Digite o Valor da Massa: ");
            double K = in.nextDouble();
            // K = Massa em Quilograma , L = Libras
            double L = K / 0.45;
                    
            System.out.printf("A Massa %.2f em Quilograma Para Libras Será: %.2f \n" ,K ,L);
        }    
    }
}