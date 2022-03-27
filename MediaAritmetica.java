// Questão 29
// Leia quatro notas, calcule a media aritmetica e imprima o resultado. 

package uni.edu.clara;
import java.util.Scanner;
public class MediaAritmetica {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
           
            System.out.println("Digite as Suas 4 Notas Para Saber Sua Média: ");
    
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int D = in.nextInt();
            // ABCD são as notas ordenamente

            int media = (A + B + C + D) / 4;
    
            System.out.printf("A Sua Média É: %d \n" ,media);
    
            
        }
    }
}
