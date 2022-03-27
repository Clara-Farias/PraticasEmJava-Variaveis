/* Questão 44
Receba a altura do degrau de uma escada e a altura que o usuario deseja alcancar
subindo a escada. Calcule e mostre quantos degraus o usuario devera subir para atingir seu objetivo.*/

package uni.edu.clara;
import java.util.Scanner;
public class Degrau {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        
        System.out.println("Bem Vindo, Usuário!");
        System.out.println("Qual o Valor do Degrau Em Centimetros? ");
        double d = in.nextDouble();
        // d = altura do degrau ; a = altura que o usuário deseja chegar
        System.out.println("Qual Altura Deseja Alcançar em Metros? ");
        double a = in.nextDouble();
        // obj = objetivo / degraus para chegar no objetivo
        double obj = (d * 100) / a;
        System.out.printf("Para Chegar ao Seu Objetivo Você irá Subir %.0f Degraus",obj);
        System.out.println("\n");

    }
}
