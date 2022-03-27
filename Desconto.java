// Questão 37
//Faca um programa que leia o valor de um produto e imprima o valor com desconto, tendo 
// em vista que o desconto foi de 12%

package uni.edu.clara;
import java.util.Scanner;
public class Desconto {
private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
            
            System.out.println("Digite o Valor da Produto: ");
            double P = in.nextDouble();
           
            double Desconto = P * 0.12;
            double PF = P  - Desconto;
    

            // PF = PREÇO Final; Desconto = DESCONTO ; P = PRODUTO

            System.out.printf("O Produto Custa: %.2f Mas com o Desconto Sairá por: %.2f \n" ,P,PF);
        }
    }