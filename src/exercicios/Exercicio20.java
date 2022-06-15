package exercicios;
import java.util.Scanner;

public class Exercicio20{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num, cont=0;

        for (int i = 1; i < 21; i++) {
            System.out.println("Insira o " + i + "° número:");
            num = leitor.nextInt();

            if(num>8){
                cont ++;
            }
        }

        System.out.println("Dos 20 números inseridos, " + cont + " são maiores que 8.");

        leitor.close();
    }
}
