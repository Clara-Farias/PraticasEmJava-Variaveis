// Questão 22
// Leia um valor de comprimento em jardas e apresente-o convertido em metros

package uni.edu.clara;
import java.util.Scanner;
public class JardasParaMetros {
    public static void main (String[] args){
        try(Scanner in = new Scanner(System.in)){
                    
            System.out.print("Digite o Valor do Comprimento: ");
            double J = in.nextDouble();
            // J = Jardas | M = Metros;
            double M = 0.91 * J;
           
                    
            System.out.printf("O Comprimento %.2f em Jardas Para Metros Será: %.2f \n" ,J ,M);
        }    
    }
}