// Questão 1
// Faca um programa que leia um numero inteiro e o imprima

package uni.edu.clara;
import java.util.Scanner;
public class ImprimirNumeroInt {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
        
        System.out.print("Digite um Número Inteiro: ");
        int X = in.nextInt();


        System.out.printf("O Valor Inteiro a Ser Impresso É: %d ",X);

        }
    }
}
