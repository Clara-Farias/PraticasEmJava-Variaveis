// Questão 5
// Leia um numero real e imprima a quinta parte deste numero.

package uni.edu.clara;
import java.util.Scanner;
public class QuintaPartedoNumero {
public static void main(String[] args){
try (Scanner in = new Scanner(System.in)) {
    System.out.print("Digite um Número Real: ");
    double x = in.nextDouble();

    double r = x * 1/5;

    System.out.println("A Quinta Parte do Número " +x+ " É: "+r);
}
    }
}
