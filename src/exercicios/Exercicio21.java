package exercicios;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double valor, prestacao;

        System.out.println("Insira o valor da sua compra: ");
        valor = leitor.nextDouble();
        prestacao = valor / 5;

        System.out.println("o valor das prestações da compra de R$" + valor + " é de R$" + prestacao + ".");
    }
}
