// Questão 35 Faca um programa que receba os valores de a e b e calcule
// O valor da hipotenusa atraves da equacao Imprima o resultado dessa operacao. 
package uni.edu.clara;
import java.util.Scanner;
public class Hipotenusa {
private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
            double X, Y;

            System.out.println("Digite o Valor de X: ");
            X = in.nextDouble();
            System.out.println("Digite o Valor de Y: ");
            Y = in.nextDouble();
            System.out.println("O Valor da Hipotenusa É: " +
            Math.sqrt(Math.pow(X, 2) +Math.pow(Y, 2)));
            // Math.sqrt para realizar x e y elevados a 2
        }
    }

