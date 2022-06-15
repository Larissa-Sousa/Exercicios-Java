package exercicios;
import java.util.Scanner;

public class Exercicio6 {
    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);
        int n1, antecessor, sucessor;

        System.out.println("Digite o número: ");
        n1 = leitor.nextInt();

        antecessor = (n1-1);
        sucessor = (n1+1);

        System.out.println("O número inserido foi: " + n1 + ", o seu antecessor é " +
                antecessor + " e seu sucessor é " + sucessor + ".");

    }
}