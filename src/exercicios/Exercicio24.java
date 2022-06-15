package exercicios;
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num = 0, soma = 0;

        while (num >= 0) {
            System.out.println("Insira um número:");
            num = leitor.nextInt();
            soma += num;
        }

        System.out.println("A soma dos números inseridos foi igual a " + soma + ".");

        leitor.close();
    }
}
