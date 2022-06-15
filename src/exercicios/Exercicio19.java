package exercicios;
import java.util.Scanner;

public class Exercicio19{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double real, dolar, cotacao;

        System.out.println("Olá, insira a cotação atual do dólar:");
        cotacao = leitor.nextDouble();
        System.out.println("Insira quantos dólares você tem com você:");
        dolar = leitor.nextDouble();

        real = dolar * cotacao;

        System.out.println("O valor da conversão de US$" + dolar + ". Foi de R$" + real + ".");

        leitor.close();
    }
}