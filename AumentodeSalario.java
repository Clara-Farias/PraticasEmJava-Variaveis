// Questão 38
//Leia o salario de um funcionario. Calcule e imprima o valor do novo salario, sabendo que
//ele recebeu um aumento de 25%. 

package uni.edu.clara;
import java.util.Scanner;
public class AumentodeSalario {
private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
            
            System.out.println("Digite o Seu Salário: ");
            double salario = in.nextDouble();
           
            double aumento = salario * 1.25;

            System.out.printf("O Funcionário Recebe: %.2f R$ Mas com o Aumento Passará a Receber: %.2f R$ \n" ,salario,aumento);
        }
    }