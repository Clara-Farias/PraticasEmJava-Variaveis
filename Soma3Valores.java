// Questão 3
// Peca ao usuario para digitar tres valores inteiros e imprima a soma deles.

package uni.edu.clara;
import java.util.Scanner;
public class Soma3Valores {
public static void main(String[] args){

    try (Scanner in = new Scanner(System.in)) {
        System.out.println("Digite um Primeiro Valor: ");
        int x = in.nextInt();

        System.out.println("Digite um Segundo Valor: ");
        int y = in.nextInt();

        System.out.println("Digite um Terceiro Valor: ");
        int z = in.nextInt();


        int r = x + y + z;

        System.out.print("O Resultado de "+x+" + " +y+ " + " +z+ " É: " +r);
    }
    }
}
