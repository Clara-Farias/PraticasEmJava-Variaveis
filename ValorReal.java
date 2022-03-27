// Questão 2
// Faca um programa que leia um numero real e o imprima. 

package uni.edu.clara;
import java.util.Scanner;
public class ValorReal {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Digite um Valor em Real: ");
            double y = in.nextDouble();

            System.out.printf("O Valor Real Digitado É: %.2f " ,y);
        }
    }
}
