package exercicios;
import java.util.Scanner;

public class Exercicio13 {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        double temperatura, conversao;

        System.out.println("Insira a temperatura que você queira converter para Fahrenheit: ");
        temperatura = leitor.nextDouble();

        conversao = (9 * temperatura + 160) / 5;

        System.out.println("O valor da conversão da temperatura: " + temperatura + "°C em Fahrenheit é " + conversao + "°F");

    }
}