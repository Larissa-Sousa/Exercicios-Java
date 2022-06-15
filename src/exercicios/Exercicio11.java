package exercicios;
import java.util.Scanner;

public class Exercicio11 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        Double salariof, salariom, vendas, comissao;

        System.out.println("Olá, insira o nome do vendedor: ");
        nome = leitor.nextLine();
        System.out.println("Insira o seu salário fixo:");
        salariof = leitor.nextDouble();
        System.out.println("Insira o valor das suas vendas:");
        vendas = leitor.nextDouble();

        comissao = ((vendas*15)/100);
        salariom = salariof + comissao;

        System.out.println("Nome do vendedor: " + nome + ";");
        System.out.println("Salário fixo do vendedor: R$" + salariof + ";");
        System.out.println("Salário mensal do vendedor: R$" + salariom + ".");
    }
}
