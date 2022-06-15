package exercicios;
import java.util.Scanner;

public class Exercicio10 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);
        double saldo, reajuste, saldof;

        System.out.println("Insira o valor do saldo: ");
        saldo = leitor.nextDouble();

        reajuste = (saldo * 1.5)/100;
        saldof = reajuste + saldo;

        System.out.println("O valor do saldo com reajuste de 1,5% é de: R$" + saldof + ".");
    }
}
