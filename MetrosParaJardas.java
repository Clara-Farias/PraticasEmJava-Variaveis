// Questão 23
// . Leia um valor de comprimento em metros e apresente-o convertido em jardas

package uni.edu.clara;
import java.util.Scanner;
public class MetrosParaJardas {
    public static void main (String[] args){
        try(Scanner in = new Scanner(System.in)){
                    
            System.out.print("Digite o Valor do Comprimento: ");
            double M = in.nextDouble();
            // J = Jardas | M = Metros;
            double J = M / 0.91;
           
                    
            System.out.printf("O Comprimento %.3f em Metros Para Jardas Será: %.3f \n" ,M ,J);
        }    
    }
}