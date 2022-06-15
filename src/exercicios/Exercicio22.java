package exercicios;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num, cont=0;

        for (int i = 1; i < 21; i++) {
            System.out.println("Insira o " + i + "° número:");
            num = leitor.nextInt();

            if(num>=0 && num<=100){
                cont ++;
            }
        }
        if(cont>=1) {
            System.out.println("Dos 20 números inseridos, " + cont + " estão entre 0 e 100.");
        }else{
            System.out.println("Nenhum número inserido está entre 0 e 100.");
        }
    }
}
