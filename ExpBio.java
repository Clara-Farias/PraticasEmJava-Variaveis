/*Questão 49
Faça um programa para leia o horário (hora, minuto e segundo) de início e a duração, em
segundos, de uma experiência biológica. O programa deve resultar com o novo horário (hora,
minuto e segundo) do termino da mesma. */

package uni.edu.clara;
import java.util.Scanner;
public class ExpBio {
    static Scanner in = new Scanner(System.in);
        public static void main(String[] args){

            System.out.println("Bem Vindo, Usuário!");

            // h = Hora m = Minutos s = Segundos d = Duração da Experiência.
            int h,m,s,d;
            System.out.print("Digite a Hora de Início: ");
            h = in.nextInt();
            System.out.print("Digite os Minutos de Início: ");
            m = in.nextInt();
            System.out.print("Digite os Segundos de Início: ");
            s = in.nextInt();
            System.out.print("Digite a Duração da Experiência: ");
            d = in.nextInt();
            
            System.out.printf("\nA Hora de Duração da Expência em Segundos É: %d\n",d);
            System.out.printf("\nA Experiência se deu Início Em:\n%d Horas %d Minutos e %d Segundos",h,m,s);

            int horas, minutos, segundos;
            horas = d / 3600;
            minutos = (d-(horas*3600))/60;
            segundos = d - (horas*3600)-(minutos*60);
            
            // hf, mf , sf = horas minutos e segundos finais.
            int hf, mf, sf;
            hf= h + horas;
            mf= m + minutos;
            sf= s + segundos;
           
            System.out.printf("\n");
            System.out.printf("\nO Término Da Experiência Ocorrerá Respectivamente:\n%d Hora(s) %d Minutos e %d Segundos!\n",hf,mf,sf);
    }
}
