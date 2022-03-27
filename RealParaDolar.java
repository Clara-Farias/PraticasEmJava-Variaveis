// Questão 30
//  Leia um valor em real e a cotac¸ao do d ˜ olar. Em seguida, imprima o valor correspondente ´
//em dolares. 

package uni.edu.clara;
import java.util.Scanner;
public class RealParaDolar {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
           
            System.out.println("Digite um Valor BRL: ");
            double R = in.nextDouble();
            // R= REAL, D = DÓLAR
            double D = R / 4.74;
            
            System.out.printf("%.2f BRL Convertido Para Dólares Será: %.2f USD \n", R, D);
    
            
        }
    }
}