// Questão 4 
// Leia um numero real e imprima o resultado do quadrado desse numero.

package uni.edu.clara;
import java.util.Scanner;
public class ValorRealAoQuadrado {

public static void main(String[] args){
try (Scanner in = new Scanner(System.in)) {
    System.out.print("Digite um Número Real: ");
    double x = in.nextDouble();
    
    double r = x * x;
    
    System.out.println("O Valor de " +x+ " Ao Quadrado É: " +r);
}
    }    
}
