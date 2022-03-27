/* Questão 43
Escreva um algoritmo para criar um programa de ajuda para vendedores. A partir de um valor total lido, mostre:
1°O total a pagar com desconto de 10%;
2°O valor de cada parcela, no parcelamento de 3 x sem juros;
3°A comissão do vendedor, no caso de a venda ser a vista (5% sobre o valor com desconto)
4°A comissão do vendedor, no caso de a venda ser parcelada (5% sobre o valor total) */

package uni.edu.clara;
import java.util.Scanner;
public class Vendedores {
private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
            // 1°
            // Definição do valor total
            System.out.println("Bem Vindo, Vendedor! ");
            System.out.println("Digite o Valor da Total da Compra do Cliente: ");
            double total = in.nextDouble();
           // calculo de desconto e descontando do valor total
            double valordesconto = total * 0.10;
            double desconto = total - valordesconto;
            System.out.println("\nOlá, Cliente!\n");
            System.out.print("\n1° - O Valor que Você Pagará Com Desconto de 10%: " +desconto);

            //2° Definir valor de parcelamento em 3 vezes
            double parcela = total / 3.0;
            System.out.printf("\n2° - O Valor Parcelado Que Você Pagará Será no Valor de: %.2f R$ de 3 Parcelas",parcela);
            System.out.println("\n");
            //3° Comissão do Vendedor se Cliente usar Valor do Desconto
            double comissao1 = desconto * 0.50;
            System.out.println("\nOlá, Vendedor\n");
            System.out.print("\n3° - O Valor da Sua Comissão Será no Valor de: "+comissao1+" ,Se o Cliente Optar Pelo Desconto\n");

            //4° Comissão se a Venda For Parcelada 
            double comissao2 = total * 0.50;
            System.out.print("4° - O Valor da Sua Comissão Será no Valor de: "+comissao2+" ,Se o Cliente Optar Pelo Parcelamento\n");
    }
}