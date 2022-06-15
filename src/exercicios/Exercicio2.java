package exercicios;
import java.util.Scanner;

public class Exercicio2 {
    public static void main (String [] args){
        Scanner leitor = new Scanner(System.in);
        int numero;

        System.out.println("Olá, digite o número: ");
        numero = leitor.nextInt();

        if(numero % 2 == 0 && numero % 5 == 0 && numero % 10 == 0){
            System.out.println("O número " + numero + " é divisível por 2, por 5 e por 10");
        }else if(numero % 2 == 0 && numero % 10 == 0){
            System.out.println("O número " + numero + " é divisível por 2 e por 10");
        }else if(numero % 2 == 0){
            System.out.println("O número " + numero + " é divisível por 2");
        } else if(numero % 5 == 0){
            System.out.println("O número " + numero + " é divisível por 5");
        }else if(numero % 10 == 0){
            System.out.println("O número " + numero + " é divisível por 10");
        }else{
            System.out.println("O número " + numero + " não é divisível por 2, por 5 e nem por 10" );
        }
        leitor.close();
    }
}