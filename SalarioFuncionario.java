/* Questãp 41
Faca um programa que leia o valor da hora de trabalho (em reais) e numero de horas
trabalhadas no mes.Imprima o valor a ser pago ao funcionario, adicionando 10% sobre o valor calculado. */

package uni.edu.clara;
import java.util.Scanner;
public class SalarioFuncionario {
private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
            
            double valor = 5.50;
            System.out.printf("Você Recebe por Hora: R$%.2f", valor);
            // valor = Valor do hora de trabalho ; hrsmes= numero de horas trabalhadas por mes
            System.out.printf("\nQuantas Horas Você Trabalhou esse Mês?: ");
            double hrsmes = in.nextDouble();
            // hrstrab =  horas de trabalho ; aumento = bonus ; salfinal = salário com acréscimo de 10%
            double hrstrab = valor * hrsmes;
            double aumento = hrstrab * 0.10;
            double salfinal = hrstrab + aumento;

            System.out.printf("O Valor a ser Pago Para O Funcionário sem o Aumento Seria: %.2f\nE Com o Bonus O Valor Recebido Será: %.2f\n",hrstrab,salfinal);
           
        }
    }