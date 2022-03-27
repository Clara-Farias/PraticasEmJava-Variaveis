// Questão 50  | Implemente um programa que calcule o ano de nascimento de uma pessoa a partir de
//sua idade e do ano atual.


package uni.edu.clara;
import java.util.Scanner;
public class AnoNascimento {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
    System.out.print("Bem-Vindo, Usuário!!");
    System.out.print("\nQual a Sua Idade? ");
    int i = in.nextInt();
    // i = Idade , a = Ano , an = Ano de Nascimento.
    System.out.print("\nEm que Ano Estamos? ");
    int a = in.nextInt();

    int an = a - i;
    System.out.printf("\nVocê Nasceu no Ano de %d!!\n",an);

    }
}
