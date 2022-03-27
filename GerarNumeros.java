/* Questão 46
Faça um programa para ler um número inteiro, positivo de três dígitos, e gerar outro
número formado pelos dígitos invertidos do número lido. Exemplo: NúmeroLido = 123 | NúmeroGerado = 321. */

package uni.edu.clara;
import java.util.Scanner;
public class GerarNumeros {
    static Scanner in = new Scanner(System.in);
        public static void main(String[] args){

            int num, num1, num2, num3;
            System.out.println("Bem Vindo, Usuário!");
            System.out.println("Digite um Número de 3 Dígitos Positivos: ");
            num = in.nextInt();

            num1 = num%10;
            num = num/10;
	        num2 = num%10;
	        num = num/10;
	        num3=num%10;
	        num=num/10;

            System.out.printf("%d%d%d\n", num1, num2, num3);
    }
}