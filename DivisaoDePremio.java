// Questão 39
//A importancia de R$ 780.000,00 sera dividida entre tres ganhadores de um concurso.Sendo que da quantia total:
//O primeiro ganhador recebera 46%; //O segundo recebera 32%; // O terceiro recebera o restante;
//Calcule e imprima a quantia ganha por cada um dos ganhadores.

package uni.edu.clara;
public class DivisaoDePremio {
public static void main(String[] args){
        double premio = 780000.00;
        double ganhador1, ganhador2, ganhador3;

        ganhador1 = (46 * premio) / 100;
        ganhador2 = (32 * premio) / 100;    
        ganhador3 = (22 * premio) / 100;
        
        System.out.printf("A Quantia Ganha pelo:\nGANHADOR 1 = %.2f\nGANHADOR 2 = %.2f\nGANHADOR 3 = %.2f \n", ganhador1, ganhador2, ganhador3);


        }
    }