// Questão 13
// Leia uma distancia em quilometros e apresente-a convertida em milhas.

package uni.edu.clara;
import java.util.Scanner;
public class QuilometroParaMilha {

public static void main(String[] args){
try(Scanner in = new Scanner(System.in)){

    System.out.print("Digite o Valor da Distância : ");
    double K = in.nextDouble();
    // Mph = Milhas por Hora , K= Km/h(Quilômetros por Hora)
    double Mph = K / 1.61;

    System.out.printf("O Valor %.2f em Quilômetros Para Milhas Será: %.2f" ,K, Mph);
    }
    }
}