package exercicios;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade, soma = 0;
        double media;

        for (int i = 1; i < 21; i++) {
            System.out.println("Insira a " + i + "° idade:");
            idade = leitor.nextInt();

            soma += idade;
        }

        media = soma / 20;

        System.out.println("O valor da média das idades inseridas é igual a: " + media + ".");

        leitor.close();
    }
}
