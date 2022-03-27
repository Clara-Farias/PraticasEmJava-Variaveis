// Questão 33 
//Leia o tamanho do lado de um quadrado e imprima como resultado a sua area.

package uni.edu.clara;
import java.util.Scanner;
public class QuadradoDaArea {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
           
            System.out.println("Digite o Valor do Lado do Quadrado: ");
            int L = in.nextInt();

            double A = L * L;  
            // A = AREA , L = LADO
            System.out.printf("A Área do Quadrado É: %.2f \n" ,A);
            
        }
    }
}