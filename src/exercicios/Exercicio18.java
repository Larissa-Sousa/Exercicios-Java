package exercicios;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] nome = new String[11];
        int[] idade = new int[11];
        int idaden = 999;
        String nomen = "";

        for (int i = 1; i < 11; i++) {
            System.out.println("Digite o " + i + "° nome:");
            nome[i] = leitor.next();
            System.out.println("Digite a " + i + "° idade:");
            idade[i] = leitor.nextInt();

            if (idade[i] < idaden) {
                idaden = idade[i];
                nomen = nome[i];
            }
        }

        System.out.println("A pessoa mais nova é: " + nomen + ", com " + idaden + " ano(s) de idade.");
    }
}
