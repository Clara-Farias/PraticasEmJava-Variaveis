// Questão 40
//Uma empresa contrata um encanador a R$ 30,00 por dia. Fac¸a um programa que solicite
//o numero de dias trabalhados pelo encanador e imprima a quantia liquida que devera ser
//paga, sabendo-se que sao descontados 8% para imposto de renda.

package uni.edu.clara;
import java.util.Scanner;
public class DiasTrabalhados {
private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
            
            System.out.println("Digite os Dias Trabalhados: ");
            double d = in.nextDouble();
            // d = dias trabalhados ; s = salario por dia ; 30 = ganho por dia
            double s = d * 30.00;
            // desconto = valor do desconto ; sf = salario final
            double desconto = s * 8 / 100;
            double sf =  s - desconto;
            System.out.printf("Valor do Salário de: %.2f \nSalário Final: %.2f Incluindo Desconto Para Imposto de Renda\n",s,sf);
        }
    }