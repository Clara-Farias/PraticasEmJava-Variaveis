// Questão 14
// Leia um angulo em graus e apresente-o convertido em radianos. 

package uni.edu.clara;
import java.util.Scanner;
public class GrauParaRadiano {
public static void main(String[] args){
        try(Scanner in = new Scanner(System.in)){
        
            System.out.print("Digite o Valor do Ângulo: ");
            double G = in.nextDouble();
            // G = Graus , R = Radiano
            double R = G * 3.14 / 180;
        
            System.out.printf("O Ângulo %.2f em Graus Para Radianos Será: %.2f" ,G, R);

        }
    }
}