// Questão 9
//Leia uma temperatura em graus Celsius e apresente-a convertida em graus Kelvin

package uni.edu.clara;
import java.util.Scanner;
public class CelsiusParaKelvin {
public static void main(String[] args ){
    try (Scanner in = new Scanner(System.in)) {
    System.out.print("Digite um Valor em Graus Celsius: ");
    double C = in.nextDouble();
    double K = C + 273.15;
        
    System.out.print("O Valor de " +C+ "C° Será: " +K+ "K°");
    } 
}
}