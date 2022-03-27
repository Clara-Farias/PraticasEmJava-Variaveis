/* Questão 53
Faça um programa para ler as dimensoes de um terreno (comprimento c e largura l),bem como o preco 
do metro de tela p. Imprima o custo para cercar este mesmo terreno com tela.*/

package uni.edu.clara;
import java.util.Scanner;
public class terreno {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args){


        System.out.println("Bem Vindo, Usuário!!");
        // Definição de Comprimento = c ,Largura = l ,Preço da tela = p , t = Custo para Cercar
        int c,l,p,t;
        System.out.println("Digite Aqui o Comprimento do Terreno: ");
        c = in.nextInt();
        System.out.println("Digite Aqui a Largura do Terreno: ");
        l = in.nextInt();
        System.out.println("Digite Aqui o Valor do Preço do Metro da Tela: ");
        p = in.nextInt();

        t = (c * l * p);
        System.out.printf("O Custo Para Cercar o Terreno Será de: %dR$\n",t);


    }
}
