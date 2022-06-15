package exercicios;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] arg){
        Scanner leitor = new Scanner(System.in);
        double saldom, saldo1, saldot = 0, conta;

        for(int i = 1; i<13; i++){
            System.out.println("Insira o valor do saldo do " + i + "° mês do ano: ");
            saldo1 = leitor.nextDouble();
            saldot += saldo1;
        }

        saldom = saldot/12;
        if(saldom>=0 && saldom<=500){
            System.out.println("Seu saldo médio é de: R$" + saldom + ". Não há concessão do crédito especial para o seu saldo médio.");
        }else if(saldom>=501 && saldom<=1000){
            conta = ((saldom*30)/100);
            System.out.println("Seu saldo médio é de: R$" + saldom + "." +
                    " Você receberá um crédito de 30% do valor de seu saldo médio, o que equivale a R$"
                    + conta + ".");
        }else if(saldom>=1001 && saldom<=2000){
            conta = ((saldom*40)/100);
            System.out.println("Seu saldo médio é de: R$" + saldom + "." +
                    " Você receberá um crédito de 40% do valor de seu saldo médio, o que equivale a R$"
                    + conta + ".");
        }else if(saldom>=3001){
            conta = ((saldom*50)/100);
            System.out.println("Seu saldo médio é de: R$" + saldom + "." +
                    " Você receberá um crédito de 50% do valor de seu saldo médio, o que equivale a R$"
                    + conta + ".");
        }
        leitor.close();
    }

}