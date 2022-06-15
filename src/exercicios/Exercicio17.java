package exercicios;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade, cont=0;

        for (int i = 1; i < 21; i++) {
            System.out.println("Insira a " + i + "° idade:");
            idade = leitor.nextInt();

            if(idade>=18){
                cont ++;
            }
        }

        System.out.println("Das 20 idades inseridas, " + cont + " são maiores de idade.");
    }
}
