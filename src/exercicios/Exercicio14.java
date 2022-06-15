package exercicios;
import java.util.Scanner;

public class Exercicio14 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num, soma=0;

        for(int i=1; i<11; i++){
            System.out.println("Insira o " + i + "° número:");
            num = leitor.nextInt();

            soma += num;
        }
        System.out.println("O valor da soma dos números é igual a: " + soma + ".");
    }
}