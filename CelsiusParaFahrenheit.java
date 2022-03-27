// Questão 6
// Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit

package uni.edu.clara;
import java.util.Scanner;
public class CelsiusParaFahrenheit {
public static void main(String[] args){
    try (Scanner in = new Scanner(System.in)) {
    System.out.print("Digite um Valor em C°: ");
    double C = in.nextDouble();

    double F = C * (9.0/5.0)+ 32.0;

    System.out.printf("O Valor em F° de %.2f C° será %.2f F°" ,C ,F);
    }
    }
}
// Código para Conversão de Celsius Para Fahrenheit