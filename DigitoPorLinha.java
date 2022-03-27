/* Questão 47
Leia um número inteiro de 4 dígitos e imprima 1 dígito por linha */

package uni.edu.clara;
import java.util.Scanner;
public class DigitoPorLinha {
    static Scanner in = new Scanner(System.in);
        public static void main(String[] args){

            int num1 = 1, num2 = 2 , num3 = 3, num4 = 4;
            System.out.println("Bem Vindo, Usuário!");

            System.out.printf("Número Inteiro de 4 Dígitos: %d%d%d%d", num1, num2, num3,num4);
            System.out.printf("\nRespectivamente: \n%d\n%d\n%d\n%d\n", num1, num2, num3,num4);
    }
}