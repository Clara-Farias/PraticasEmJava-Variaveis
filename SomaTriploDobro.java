// Questão 32

// Questão 32
// Leia um numero inteiro e imprima a soma do sucessor de seu triplo com o antecessor de seu dobro.

package uni.edu.clara;
import java.util.Scanner;
public class SomaTriploDobro {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
           
            System.out.println("Digite um Número: ");
            int num = in.nextInt();

            int sucessorTriplo = (3 * num + 1);
            int antecessorDobro = (2 * num - 1);
            int somaTudo = (sucessorTriplo + antecessorDobro);

            System.out.print("A Soma do Sucessor de seu Triplo com o antecessor de seu Dobro É: " +somaTudo);
            
        }
    }
}