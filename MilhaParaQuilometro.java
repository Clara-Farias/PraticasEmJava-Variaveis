// Questão 12
// Leia uma distancia em milhas e apresente-a convertida em quilometros

package uni.edu.clara;
import java.util.Scanner;
public class MilhaParaQuilometro {

public static void main(String[] args){
try(Scanner in = new Scanner(System.in)){

    System.out.print("Digite o Valor da Distância : ");
    double Mph = in.nextDouble();
    // Mph = Milhas por Hora , K= Km/h(Quilômetros por Hora)
    double K = 1.61 * Mph;

    System.out.printf("O Valor %.2f em Milhas Para Km/h Será: %.2f" ,Mph, K);
    }
    }
}