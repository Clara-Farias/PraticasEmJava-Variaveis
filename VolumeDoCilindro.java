//  Questão 36
// Leia a altura e o raio de um cilindro circular e imprima o volume do cilindro

package uni.edu.clara;
import java.util.Scanner;
public class VolumeDoCilindro {
private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
            double A, R, V;
            // A = ALTURA ; R = RAIO ; V = VOLUME

            System.out.println("Digite o Valor da Altura: ");
            A = in.nextDouble();
            System.out.println("Digite o Valor do Raio: ");
            R = in.nextDouble();
            
            V = (3.141592 * R * R) * A;
            System.out.println("O Volume do Cilindro é de: "+V);

            
        }
    }