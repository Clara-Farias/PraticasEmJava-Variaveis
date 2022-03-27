// Questão 34 Leia o valor do raio de um c´ırculo e calcule e imprima a area do cırculo correspondente.


package uni.edu.clara;
import java.util.Scanner;
public class AreaDoCirculo {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
            System.out.println("Digite o Valor do Raio: ");
            double R = in.nextInt();
            // R = RAIO , 3,14 = PI , AC = AREA DO CIRCULO
            double AC = 3.141592 * (R * R);

            System.out.printf("A Área do Circulo É: %.4f \n" ,AC);
            
        }
    }
