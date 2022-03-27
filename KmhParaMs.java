// Questão 10 
//  Leia uma velocidade em km/h (quilometros por hora) e apresente-a convertida em m/s

package uni.edu.clara;
import java.util.Scanner;
public class KmhParaMs {
public static void main(String[] args){
    try (Scanner in = new Scanner(System.in)) {
  
    System.out.print("Digite o Valor de Uma Velocidade Km/h: ");
    double K = in.nextDouble();
    // K = KM/H , M = M/S
    double M = K / 3.6;
    
    System.out.print("O Resultado de " +K+ " Km/h Para m/s É: " +M);
    }
    }
}
