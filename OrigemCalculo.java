/*   Questão 51
Escreva um programa que leia as coordenadas x e y de pontos no R² e calcule sua
distancia da origem (0, 0)*/

package uni.edu.clara;
import java.util.Scanner;
public class OrigemCalculo {
private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Bem Vindo, Usuário! ");
        System.out.println("Digite a Coordenada de X:\n ");
        int x = in.nextInt();
        System.out.println("Digite a Coordenada de Y:\n ");
        int y = in.nextInt();
        // x,y (0,0)
        System.out.printf("O Resultado da Distância É: " +
        Math.sqrt(Math.pow(x, 2) +Math.pow(y, 2)));
        // pow(base, expoente) pra elevar ao quadrado e sqrt() é raíz quadrada
        System.out.println("\n");
    }      
}
