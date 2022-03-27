// Questão 21
// Leia um valor de massa em libras e apresente-o convertido em quilogramas.

package uni.edu.clara;
import java.util.Scanner;
public class LibrasParaQuilograma {
    public static void main (String[] args){
        try(Scanner in = new Scanner(System.in)){
                    
            System.out.print("Digite o Valor da Massa: ");
            double L = in.nextDouble();
            // K = Massa em Quilograma , L = Libras
            double K = L * 0.45;
                    
            System.out.printf("A Massa %.2f em Libras Para Quilogramas Será: %.2f \n" ,L ,K);
        }    
    }
}