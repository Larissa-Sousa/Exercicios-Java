package exercicios;
import java.util.Scanner;

public class Exercicio9 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);
        double salariom = 1212, salario, valor;

        System.out.println("Olá, insira o seu salário: ");
        salario = leitor.nextDouble();

        valor = salario / salariom;

        System.out.printf("A quantidade de salários mínimos é: %.2f", valor);
        leitor.close();

        leitor.close();
    }
}
