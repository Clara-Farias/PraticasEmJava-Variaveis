/* Questão 48
Leia um número inteiro de 4 dígitos e imprima 1 dígito por linha */

package uni.edu.clara;
import java.util.Scanner;
public class HorasMinSeg {
    static Scanner in = new Scanner(System.in);
        public static void main(String[] args){

            System.out.println("Bem Vindo, Usuário!");

            int s, h, m;
            System.out.printf("Digite Um Valor em Segundos: ");
            s = in.nextInt();

            h = s / 3600;
            m = s / 60;
            System.out.printf("Será Respectivamente %d Hora(s) %d Minutos e %d Segundos!\n",h,m,s);
    }
}