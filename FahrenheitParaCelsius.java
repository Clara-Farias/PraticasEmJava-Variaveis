// Questão 7
// Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.

package uni.edu.clara;
import java.util.Scanner;
public class FahrenheitParaCelsius {
public static void main(String[] args ){
    try (Scanner in = new Scanner(System.in)) {
        System.out.print("Digite um Valor em Fahrenheit: ");
        double F = in.nextDouble();

        double C = 5.0 * (F - 32.0)/9.0;

        System.out.print("O Valor de " +F+ "F° Será:" +C+ "C°");
    }
    }
}
