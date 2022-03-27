// Questão 15
//  Leia um angulo em radianos e apresente-o convertido em graus

package uni.edu.clara;
import java.util.Scanner;
public class RadianoParaGrau {
    public static void main(String[] args){
        try(Scanner in = new Scanner(System.in)){
                
            System.out.print("Digite o Valor do Ângulo: ");
            double R = in.nextDouble();
            // G = Graus , R = Radiano
            double G = R * 180 / 3.14;
                
            System.out.printf("O Ângulo %.2f em Radiano Para Graus Será: %.2f" ,R, G);
        
        }
    }
}
