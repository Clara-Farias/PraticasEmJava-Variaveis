/* Questão 42
 Receba o salário-base de um funcionário, calcule e imprima o salário a receber, sabendo-se
que esse funcionário tem uma gratificação de 5% sobre o salário-base. Além disso, paga % de
imposto sobre o salário-base */

package uni.edu.clara;
import java.util.Scanner;
public class Gratificacao {
private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
            
          
            System.out.printf("Insira o Seu Salário: R$");
            double s = in.nextDouble();
            // salario = salario base ; s = salario com a gratificação
            // gratif = gratificação ; imposto = valor do imposto
            double gratif = s * 0.05;
            double imposto = s * 0.07;
            double salfinal = s + gratif - imposto;

            System.out.printf("O seu Salário Base É: %.2f\nE Com o Desconto do Imposto Será O Valor Recebido Será: %.2f\n",s,salfinal);
           
        }
    }