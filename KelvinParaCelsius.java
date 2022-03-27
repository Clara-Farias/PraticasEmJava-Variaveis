// Questão 8
// Leia uma temperatura em graus Kelvin e apresente-a convertida em graus Celsius

package uni.edu.clara;
import java.util.Scanner;
public class KelvinParaCelsius {
public static void main(String[] args ){
    try (Scanner in = new Scanner(System.in)) {
    System.out.print("Digite um Valor em Graus Kelvin: ");
    double K = in.nextDouble();
    double C = K - 273.15;
       
    System.out.print("O Valor de " +K+ "K° Será:" +C+ "C°");
    } 
}
}




