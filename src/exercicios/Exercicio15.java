package exercicios;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade, soma = 0;

        for (int i = 1; i < 21; i++) {
            System.out.println("Insira a " + i + "° idade:");
            idade = leitor.nextInt();

            soma += idade;
        }
        System.out.println("O valor da soma das idades inseridas é igual a: " + soma + ".");
    }
}