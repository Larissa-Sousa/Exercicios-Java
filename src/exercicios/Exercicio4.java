package exercicios;
import java.util.Scanner;

public class Exercicio4 {
    public static void main (String [] args) {
        Scanner leitor = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Olá, digite o primeiro valor:");
        n1 = leitor.nextInt();
        System.out.println("Digite o segundo valor:");
        n2 = leitor.nextInt();
        System.out.println("Digite o terceiro valor");
        n3 = leitor.nextInt();

        if (n1>n2 && n2>n3) {
            System.out.println("Os valores em ordem descresente é: " + n1 + "; " + n2 + "; " + n3);
        }else if (n2>n3 && n3>n1){
            System.out.println("Os valores em ordem descresente é: " + n2 + "; " + n3 + "; " + n1);
        }else if (n1>n3 && n3>n2){
            System.out.println("Os valores em ordem descresente é: " + n1 + "; " + n3 + "; " + n2);
        }else if (n3>n2 && n2>n1){
            System.out.println("Os valores em ordem descresente é: " + n3 + "; " + n2 + "; " + n1);
        }else if (n3>n1 && n1>n2){
            System.out.println("Os valores em ordem descresente é: " + n3 + "; " + n1 + "; " + n2);
        }else if (n2>n1 && n1>n3){
            System.out.println("Os valores em ordem descresente é: " + n2 + "; " + n1 + "; " + n3);
        }
        leitor.close();
    }
}
