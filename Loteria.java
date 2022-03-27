/*   Questão 52
Tres amigos jogaram na loteria. Caso eles ganhem, o premio deve ser repartido pro porcionalmente ao
valor que cada deu para a realizacao da aposta. Faca um programa que leia quanto cada apostador
investiu, o valor do premio, e imprima quanto cada um ganharia do premio com base no valor investido. */

package uni.edu.clara;
import java.util.Scanner;
public class Loteria {
private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Bem Vindo, Usuário! ");
        // Abaixo Será Digitado Quanto cada amigo Investiu na Aposta.
        System.out.println("\nValor da Aposta do Amigo1:");
        double amigo1 = in.nextDouble();
        System.out.println("\nValor da Aposta do Amigo2:\n ");
        double amigo2 = in.nextDouble();
        System.out.println("\nValor da Aposta do Amigo3:\n ");
        double amigo3 = in.nextDouble();
        // Abaixo Impressão do Valor que cada Amigo Investiu
        System.out.printf("\nO Valor Investido de Cada Apostador:\nAmigo1 = %.2f\nAmigo2 = %.2f\nAmigo3 = %.2f",amigo1,amigo2,amigo3);
        // Abaixo a Soma dos Valores Investidos sendo o Valor total do Prêmio
        double premio = amigo1 + amigo2 + amigo3;
        System.out.printf("\n\nO Valor do Prêmio Será: %.2f \n",premio);

        // Abaixo resultado de Quanto Cada um Irá Receber
        double p1, p2, p3; //   premio de cada apostador
        p1 = (amigo1 * 100) / premio;
        p2 = (amigo2 * 100) / premio;
        p3 = (amigo3 * 100) / premio;
        //
        System.out.printf("\nValor Que o Amigo1 Receberá Será: %.2f", premio * p1 / 100);
        System.out.printf("\nValor Que o Amigo2 Receberá Será: %.2f\n",premio * p2 / 100);
        System.out.printf("Valor Que o Amigo3 Receberá Será: %.2f\n",premio * p3 / 100);
    }      
}