// Questão 28
// Faca a leitura de tres valores e apresente como resultado a soma dos quadrados dos tres valores lidos.

package uni.edu.clara;
import java.util.Scanner;
public class SomaDosQuadrados {
public static void main(String[] args){
    try (Scanner in = new Scanner(System.in)) {
       
        System.out.println("Digite Três Valores: ");

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        // r = resultado , xyz = valores
        int r = x * x + y * y + z * z;

        System.out.println("O Resultado da Soma dos Quadrados de " +x+ " + " +y+ " + " +z+ " É: " +r);

        }
    }
}