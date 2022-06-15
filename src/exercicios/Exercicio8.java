package exercicios;
import java.util.Scanner;

public class Exercicio8 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);
        double valor1, valor2, IPI, valor;
        int quant1, quant2, cod1, cod2;

        System.out.println("Insira a porcentagem do IPI a ser acresecentado nas peças:");
        IPI = leitor.nextDouble();
        System.out.println("Insira o código da primeira peça: ");
        cod1 = leitor.nextInt();
        System.out.println("Insira a quantidade da primeira peça: ");
        quant1 = leitor.nextInt();
        System.out.println("Insira o valor da primeira peça: ");
        valor1 = leitor.nextInt();
        System.out.println("Insira o código da segunda peça: ");
        cod2 = leitor.nextInt();
        System.out.println("Insira a quantidade da segunda peça: ");
        quant2 = leitor.nextInt();
        System.out.println("Insira o valor da segunda peça: ");
        valor2 = leitor.nextInt();

        valor = (valor1*quant1 + valor2*quant2)*(IPI/100 + 1);

        System.out.printf("Valor total a ser pago: R$%.2f", valor);
    }
}
