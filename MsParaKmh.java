// Questão 11
// Leia uma velocidade em m/s (metros por segundo) e apresente-a convertida em km/h

package uni.edu.clara;
import java.util.Scanner;
public class MsParaKmh {

public static void main(String[] args){
try(Scanner in = new Scanner(System.in)){

    System.out.print("Digite um Valor para m/s: ");
    double M = in.nextDouble();
    // M = m/s , K= Km/h
    double K = M * 3.6;

    System.out.printf("O Valor Em m/s de %.2f Para Km/h Será: %.2f" ,M, K);
    }
    }
}