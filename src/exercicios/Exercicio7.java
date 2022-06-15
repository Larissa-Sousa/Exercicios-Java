package exercicios;
import java.util.Scanner;

public class Exercicio7 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);
        double mediad1, mediad2, soma, mediam;

        mediad1 = (8 + 9 + 7) / 3;
        mediad2 = (4 + 5 + 6)/3;
        soma = mediad1 + mediad2;
        mediam = soma/2;

        System.out.println("A média dos números 7, 8 e 9 é: " + mediad1);
        System.out.println("A média dos números 4, 5 e 6 é: " + mediad2);
        System.out.println("A soma das médias é: " + soma);
        System.out.println("A média das médias é: " + mediam);
    }
}
