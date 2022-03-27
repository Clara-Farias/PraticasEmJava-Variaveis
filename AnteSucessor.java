// Questão 31 Leia um numero inteiro e imprima o seu antecessor e o seu sucessor.

package uni.edu.clara;
import java.util.Scanner;
public class AnteSucessor {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
           
            System.out.println("Digite um Número: ");
            int num = in.nextInt();
            // num = número
            int antecessor = num - 1;
            int sucessor = num + 1;
            // \n = quebra de linha
            System.out.printf("O Antecessor de %d Será: %d \nE o seu Sucessor Será: %d \n" ,num,antecessor,sucessor);
            
        }
    }
}